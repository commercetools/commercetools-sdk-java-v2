
package io.vrap.rmf.base.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

public interface ResponseSerializer {
    <O> ApiHttpResponse<O> convertResponse(final ApiHttpResponse<byte[]> response, final Class<O> outputType);

    byte[] toJsonByteArray(final Object value) throws JsonProcessingException;

    static ResponseSerializer of() {
        return new ResponseSerializerImpl(JsonUtils.getConfiguredObjectMapper());
    }

    static ResponseSerializer of(final ObjectMapper mapper) {
        return new ResponseSerializerImpl(mapper);
    }
}
