package com.kimlien.novel.Core.Json.Serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class UsernameSerializer extends JsonSerializer<String>{
    @Override
    public void serialize(String s, JsonGenerator jsonGenerator,
        SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(s.substring(0, 4) + "****" + s.substring(8));
    }
}
