package com.ximi.design.pattern.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 导出用户
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class UserExport extends ExportDataTemplate {

    @Override
    protected String getFileName(Map<String, Object> params) {
        return "导出用户.csv";
    }

    @Override
    protected List<HeadColumn> getHeaders(Map<String, Object> params) {
        List<HeadColumn> headColumns = new ArrayList<>();
        HeadColumn column1 = new HeadColumn("名字", "name");
        HeadColumn column2 = new HeadColumn("年龄", "age");
        headColumns.add(column1);
        headColumns.add(column2);
        return headColumns;
    }

    @Override
    protected List<Object> getExportData(Map<String, Object> params) {
        List<Object> list = new ArrayList<>();
        User user = new User("Ximi", "100");
        list.add(user);
        return list;
    }
}
