package com.zhanglang.res;


public class Result {

    private int code;
    private String msg;
    private Object data;

    private Result(Builder builder){
        this.code = builder.code;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    public static Result.Builder builder(){
        return new Result.Builder();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static class Builder<T>{
        private int code;
        private String msg;
        private T data;

        public Builder(){}

        public Builder code(int code){
            this.code = code;
            return this;
        }
        public Builder msg(String msg){
            this.msg = msg;
            return this;
        }
        public Builder data(T data){
            this.data = data;
            return this;
        }

        public Result build(){
            return new Result(this);
        }
    }
}
