package com.share.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * @description 自定义返回JSON 数据格中日期格式化处理
 */
public class JsonDateSerializer extends JsonSerializer<Date>
{
    
    @Override
    public void serialize(Date value, JsonGenerator jsonGenerator,
            SerializerProvider provider)
                    throws IOException, JsonProcessingException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        jsonGenerator.writeString(sdf.format(value));
    }
}