package com.ximi.design.pattern.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂方法Dome
 */
public class FactoryMethodDome {

    /**
     * 解析抽象类
     */
    public interface Parse {
    }

    /**
     * xml文件解析类
     */
    public static class XmlParse implements Parse {
    }

    /**
     * Json 解析类
     */
    public static class JsonParse implements Parse {
    }

    /**
     * Yaml 解析类
     */
    public static class YamlParse implements Parse {
    }

    ;

    /**
     * 抽象的解析工厂类
     */
    public interface ParseFactory {

        /**
         * 创建解析器
         *
         * @return Parse
         */
        public Parse createParse();

    }

    /**
     * Xml 的解析工厂
     */
    public static class XmlParseFactory implements ParseFactory {

        @Override
        public Parse createParse() {
            return new XmlParse();
        }
    }

    /**
     * json 解析工厂
     */
    public static class JsonParseFactory implements ParseFactory {

        @Override
        public Parse createParse() {
            return new JsonParse();
        }
    }

    /**
     * Yaml 解析工厂
     */
    public static class YamlParseFactory implements ParseFactory {

        @Override
        public Parse createParse() {
            return new YamlParse();
        }
    }

    /**
     * 解析工厂的管理者
     */
    public static class ManagerParseFactory {

        private static Map<String, ParseFactory> parseFactorymap = new ConcurrentHashMap<>();

        static {
            parseFactorymap.put("xml", new XmlParseFactory());
            parseFactorymap.put("json", new JsonParseFactory());
            parseFactorymap.put("yaml", new YamlParseFactory());
        }

        public static ParseFactory getParseFactory(String name) {
            return parseFactorymap.get(name);
        }
    }

    public static void main(String[] args) {
        ParseFactory factory = ManagerParseFactory.getParseFactory("json");
        System.out.println(factory);
        Parse parse = factory.createParse();
        System.out.println(parse);
    }

}
