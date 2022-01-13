
package io.vrap.rmf.base.client;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Default implementation of {@link ResponseSerializer} using Jackson {@link ObjectMapper}
 */
class ResponseSerializerImpl implements ResponseSerializer {

    private final ObjectMapper mapper;

    public ResponseSerializerImpl(final ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final Class<O> outputType) {
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

    public <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final JavaType outputType) {
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

    public <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response,
            final TypeReference<O> outputType) {
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

    public byte[] toJsonByteArray(final Object value) throws JsonProcessingException {
        return mapper.writeValueAsBytes(value);
    }
}
