package io.vrap.rmf.base.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

class ResponseSerializerImpl implements ResponseSerializer {

    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType)
    {
        return Utils.convertResponse(response, outputType);
    }

    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        return JsonUtils.getConfiguredObjectMapper().writeValueAsBytes(value);
    }
}
