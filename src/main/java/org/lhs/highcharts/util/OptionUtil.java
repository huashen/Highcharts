package org.lhs.highcharts.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.lhs.highcharts.Option;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * OptionUtil
 *
 * @author longhuashen
 * @since 16/12/20
 */
public class OptionUtil {

    /**
     * 导出到指定文件夹，文件名随机
     *
     * @param option
     * @param folderPath
     * @return 返回html路径
     */
    public static String exportToHtml(Option option, String folderPath) {
        String fileName = "ECharts-" + System.currentTimeMillis() + ".html";
        return exportToHtml(option, folderPath, fileName);
    }

    public static String exportToHtml(Option option,String filePath, String fileName) {
        if (fileName == null || fileName.length() == 0) {
            return exportToHtml(option, filePath);
        }
        FileWriter writer = null;
        List<String> lines = readLines(option);
        //写入文件
        File html = new File(getFolderPath(filePath) + "/" + fileName);
        try {
            writer = new FileWriter(html);
            for (String l : lines) {
                writer.write(l + "\n");
            }
        } catch (Exception e) {
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    //ignore
                }
            }
        }
        //处理
        try {
            return html.getAbsolutePath();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 读取模板并写入数据
     *
     * @param option
     * @return
     */
    private static List<String> readLines(Option option) {
        String optionStr = format(option);
        InputStream is = null;
        InputStreamReader iReader = null;
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<String>();
        String line;
        try {
            is = OptionUtil.class.getResourceAsStream("/template");
            iReader = new InputStreamReader(is);
            bufferedReader = new BufferedReader(iReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("##option##")) {
                    line = line.replace("##option##", optionStr);
                }
                lines.add(line);
            }
        } catch (Exception e) {
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    //ignore
                }
            }
        }
        return lines;
    }

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String format(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(gson.toJson(object));
        String prettyJsonString = gson.toJson(je);
        //简单处理function
        String[] lines = prettyJsonString.split("\n");
        lines = replaceFunctionQuote(lines);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    /**
     * 处理字符串中的function和(function(){})()，除{}中的代码外，其他地方不允许有空格
     *
     * @param lines
     * @return
     */
    public static String[] replaceFunctionQuote(String[] lines) {
        boolean function = false;
        boolean immediately = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }

            if (!immediately && line.contains("\"(function")) {
                immediately = true;
                line = line.replaceAll("\"\\(function", "\\(function");
            }
            if (immediately && line.contains("})()\"")) {
                immediately = false;
                line = line.replaceAll("\\}\\)\\(\\)\"", "\\}\\)\\(\\)");
            }
            lines[i] = line;
        }
        return lines;
    }

    /**
     * 获取文件夹路径，如果不存在则创建
     *
     * @param folderPath
     * @return
     */
    private static String getFolderPath(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isFile()) {
            String tempPath = folder.getParent();
            folder = new File(tempPath);
        }
        if (!folder.exists()) {
            folder.mkdirs();
        }
        return folder.getPath();
    }
}
