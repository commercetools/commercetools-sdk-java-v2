
package com.commercetools;

import java.io.IOException;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MessagePayloadTest {

    @Test
    public void deserializeOrderCreatedMessageFromString() throws IOException {
        String payload = "{\"type\": \"OrderCreated\", \"order\": {}}";
        MessagePayload deserializedObject = JsonUtils.fromJsonString(payload, MessagePayload.class);

        Assertions.assertThat(deserializedObject).isInstanceOf(OrderCreatedMessagePayload.class);
    }
}
