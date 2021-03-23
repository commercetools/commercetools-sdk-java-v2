
package io.vrap.rmf.base.client;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class ResponseSerializerImpl implements ResponseSerializer {

    private final ObjectMapper mapper;

    public ResponseSerializerImpl(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        try {
            if (response.getBody() == null) {
                return (ApiHttpResponse<O>) response;
            }
            O newBody = mapper.readValue(response.getBody(), outputType);
            return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        return mapper.writeValueAsBytes(value);
    }
}
