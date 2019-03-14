package com.nuofankj.springdemo.utility;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 操作json的封装方法
 * use:jackson
 */
public class JSONChange {
    /*
     * 001.json转换成对象
     * @param:传入Class，json字符串
     * @return:Object
     */
    public static Object jsonToObj(Class clz, String jsonStr) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.readValue(jsonStr, clz);
    }

    /*
     * 002.对象转换成json
     * @param:传入对象
     * @return:json字符串
     */
    public static String objToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
}