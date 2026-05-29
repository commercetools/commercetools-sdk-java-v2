
package io.vrap.rmf.base.client;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.core.JacksonException;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

/**
 * Interface to deserialize a response to a specified output type
 */
public interface ResponseSerializer {
    <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final Class<O> outputType);

    <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final JavaType outputType);

    <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final TypeReference<O> outputType);

    byte[] toJsonByteArray(final Object value) throws JacksonException;

    static ResponseSerializer of() {
        return new ResponseSerializerImpl(JsonUtils.getConfiguredObjectMapper());
    }

    static ResponseSerializer of(final ObjectMapper mapper) {
        return new ResponseSerializerImpl(mapper);
    }
}
