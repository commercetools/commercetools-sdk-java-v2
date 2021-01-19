package com.commercetools;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class MessagePayloadTest {

    @Test
    public void deserializeOrderCreatedMessageFromString() throws IOException {
        String payload = "{\"type\": \"OrderCreated\", \"order\": {}}";
        MessagePayload deserializedObject = VrapJsonUtils.fromJsonString(payload, MessagePayload.class);

        Assertions.assertThat(deserializedObject).isInstanceOf(OrderCreatedMessagePayload.class);
    }
}
