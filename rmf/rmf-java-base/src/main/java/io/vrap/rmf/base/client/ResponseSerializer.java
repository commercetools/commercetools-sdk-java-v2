
package io.vrap.rmf.base.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public interface ResponseSerializer {
    <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType);

    byte[] toJsonByteArray(Object value) throws JsonProcessingException;

    static ResponseSerializer of() {
        return new ResponseSerializerImpl(JsonUtils.getConfiguredObjectMapper());
    }

    static ResponseSerializer of(ObjectMapper mapper) {
        return new ResponseSerializerImpl(mapper);
    }
}
