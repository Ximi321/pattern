package com.ximi.design.pattern.template;

import org.apache.commons.collections.BeanMap;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * 导出csv文件的模板
 *
 * 模板方法,子类提供文件名，文件头，和文件内容
 *
 * @author Ximi
 * @since 2020/07/28
 */
public abstract class ExportDataTemplate {

    /**
     * 导出文件
     *
     * @param params
     * @return
     */
    public File export(Map<String, Object> params) {
        BufferedWriter writer = null;
        try {
            File file = createFile(getFileName(params));
            List<HeadColumn> headers = getHeaders(params);
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),
                    "GB2312"), 1024);
            writeHead(writer, headers);
            List<Object> datas = getExportData(params);
            writeDatas(writer, headers, datas);
            return file;
        } catch (Exception ex) {
            ex.getStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 文件名
     *
     * @param params
     * @return
     */
    protected abstract String getFileName(Map<String, Object> params);

    /**
     * 获取头部
     *
     * @param params
     * @return
     */
    protected abstract List<HeadColumn> getHeaders(Map<String, Object> params);

    /**
     * 获取导出的数据
     *
     * @param params
     * @return
     */
    protected abstract List<Object> getExportData(Map<String, Object> params);

    /**
     * 创建一个文件
     * @param fileName 文件名
     * @return
     */
    private File createFile(String fileName) {
        File file = new File(fileName);
        return file;
    }

    /**
     * 写入头部
     *
     * @param writer 文件写入流
     * @param header 文件头
     */
    private void writeHead(BufferedWriter writer, List<HeadColumn> header) throws IOException {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < header.size(); index++) {
            if (index != 0) {
                builder.append(",");
            }
            builder.append(header.get(index).getHeadName());
        }
        writer.write(builder.toString());
    }

    /**
     * 将Object 对象转化为map对象
     *
     * @param object
     * @return
     */
    private Map<String, Object> objectToMap(Object object) {
        return new BeanMap(object);
    }

    /**
     * 写入数据
     *
     * @param writer 文件写入流
     * @param headers 头部
     * @param datas 数据
     * @throws IOException
     */
    private void writeDatas(BufferedWriter writer, List<HeadColumn> headers, List<Object> datas) throws IOException {
        for (Object object : datas) {
            writer.newLine();
            Map<String, Object> dataMap = objectToMap(object);
            StringBuilder builder = new StringBuilder();
            for (int index = 0; index < headers.size(); index++) {
                if (index != 0) {
                    builder.append(",");
                }
                builder.append(dataMap.get(headers.get(index).getFieldName()));
            }
            writer.write(builder.toString());
        }
    }


}
