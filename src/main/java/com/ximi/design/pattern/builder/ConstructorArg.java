package com.ximi.design.pattern.builder;

/**
 * 建造者模式的Demo
 * 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
 * 当 isRef 为 false 的时候，arg、type 都需要设置
 *
 * @author Ximi
 * @since 2020/07/20
 */
public class ConstructorArg {

    private Boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(){

    }

    @Override
    public String toString() {
        return "ConstructorArg{" +
                "isRef=" + isRef +
                ", type=" + type +
                ", arg=" + arg +
                '}';
    }

    public static class Builder{
        private Boolean isRef;
        private Class type;
        private Object arg;

        public Builder isRef(Boolean isRef){
            this.isRef = isRef;
            return this;
        }

        public Builder type(Class type){
            this.type = type;
            return this;
        }

        public Builder arg(Object arg){
            this.arg = arg;
            return this;
        }

        public ConstructorArg build(){
            if(isRef == null){
                throw new IllegalArgumentException("isRef can not null");
            }

            if(isRef){
                if(arg == null){
                    throw new IllegalArgumentException("arg can not null");
                }
                if(!arg.getClass().getName().equals(String.class.getName())){
                    throw new IllegalArgumentException("arg class type should String");
                }
            }

            if(!isRef){
                if(type == null){
                    throw new IllegalArgumentException("type can not null");
                }

                if(arg == null){
                    throw new IllegalArgumentException("arg can not null");
                }

                if(!type.equals(arg.getClass())){
                    throw new IllegalArgumentException("type is not equals arg class");
                }
            }

            ConstructorArg constructorArg = new ConstructorArg();
            constructorArg.isRef = this.isRef;
            constructorArg.arg = this.arg;
            constructorArg.type = this.type;
            return constructorArg;
        }
    }

    public static void main(String[] args) {
        try {
            ConstructorArg constructorArg = new Builder()
                    .isRef(false)
                    .arg(Integer.valueOf(1))
                    .type(Integer.class)
                    .build();
            System.out.println(constructorArg.toString());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
