package com.ximi.design.pattern.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽象工程
 */
public class AbstractFactoryDome {

    /**
     * 规则解析
     */
    public interface RuleParse{

    }

    /**
     * 系统解析
     */
    public interface SystemParse{

    }

    /**
     * Xml规则解析
     */
    public static class XmlRuleParse implements RuleParse{

    }

    /**
     * Xml 系统解析
     */
    public static class XmlSystemParse implements SystemParse{

    }

    /**
     * json 规则解析
     */
    public static class JsonRulePrase implements RuleParse{

    }

    /**
     * json 系统解析
     */
    public static class JsonSystemParse implements SystemParse{

    }

    /**
     * 抽象解析工程
     */
    public interface PraseFactory{

        /**
         * 规则解析
         * @return
         */
        public RuleParse createRuleParse();

        /**
         * 系统解析
         * @return
         */
        public SystemParse createSystemParse();

    }

    /**
     * Xml 解析工厂
     */
    public static class XmlPraseFactory implements PraseFactory{

        @Override
        public RuleParse createRuleParse() {
            return new XmlRuleParse();
        }

        @Override
        public SystemParse createSystemParse() {
            return new XmlSystemParse();
        }
    }

    /**
     * json 解析工厂
     */
    public static class JsonPraseFactory implements PraseFactory{

        @Override
        public RuleParse createRuleParse() {
            return new JsonRulePrase();
        }

        @Override
        public SystemParse createSystemParse() {
            return new JsonSystemParse();
        }
    }

    /**
     * 工厂管理者
     */
    public static class ManagerParseFactory{

        public static Map<String,PraseFactory> praseFactoryMap = new ConcurrentHashMap<>();

        static {
            praseFactoryMap.put("xml",new XmlPraseFactory());
            praseFactoryMap.put("json",new JsonPraseFactory());
        }

        public static PraseFactory getParseFactory(String name){
            return praseFactoryMap.get(name);
        }
    }

    public static void main(String[] args) {
        PraseFactory praseFactory = ManagerParseFactory.getParseFactory("json");
        System.out.println(praseFactory);
        System.out.println(praseFactory.createRuleParse());
        System.out.println(praseFactory.createSystemParse());
    }

}
