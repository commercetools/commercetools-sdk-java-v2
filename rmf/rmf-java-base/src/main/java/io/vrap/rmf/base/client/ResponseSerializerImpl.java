
package io.vrap.rmf.base.client;

import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.ObjectMapper;

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
            if (response.getBody() == null || response.getBody().length == 0) {
                return (ApiHttpResponse<O>) response;
            }
            O newBody = mapper.readValue(response.getBody(), outputType);
            return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody,
                response.getMessage(), response.getContextMap());
        }
        catch (JacksonException e) {
            throw new DeserializationException(e.getMessage(), e);
        }
    }

    public <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final JavaType outputType) {
        try {
            if (response.getBody() == null) {
                return (ApiHttpResponse<O>) response;
            }
            O newBody = mapper.readValue(response.getBody(), outputType);
            return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody,
                response.getMessage(), response.getContextMap());
        }
        catch (JacksonException e) {
            throw new DeserializationException(e.getMessage(), e);
        }
    }

    public <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response,
            final TypeReference<O> outputType) {
        try {
            if (response.getBody() == null) {
                return (ApiHttpResponse<O>) response;
            }
            O newBody = mapper.readValue(response.getBody(), outputType);
            return new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), newBody,
                response.getMessage(), response.getContextMap());
        }
        catch (JacksonException e) {
            throw new DeserializationException(e.getMessage(), e);
        }
    }

    public byte[] toJsonByteArray(final Object value) throws JacksonException {
        return mapper.writeValueAsBytes(value);
    }
}
