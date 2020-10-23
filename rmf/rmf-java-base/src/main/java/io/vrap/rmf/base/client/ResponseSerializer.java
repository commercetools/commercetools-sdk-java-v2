package io.vrap.rmf.base.client;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ResponseSerializer {
    <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType);

    byte[] toJsonByteArray(Object value) throws JsonProcessingException;

    static ResponseSerializer of()
    {
        return new ResponseSerializerImpl();
    }
}
