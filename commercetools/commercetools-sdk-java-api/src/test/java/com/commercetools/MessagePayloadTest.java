
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import java.io.IOException;

import com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerLastNameSetMessagePayload;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.subscription.MessageDeliveryPayload;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagePayloadTest {

    @Test
    public void deserializeOrderCreatedMessageFromString() throws IOException {
        String payload = "{\"type\": \"OrderCreated\", \"order\": {}}";
        MessagePayload deserializedObject = JsonUtils.fromJsonString(payload, MessagePayload.class);

        Assertions.assertThat(deserializedObject).isInstanceOf(OrderCreatedMessagePayload.class);
    }

    @Test
    public void deserializeMessageDeliveryPayload() {
        MessageDeliveryPayload delivery = JsonUtils.fromJsonString(stringFromResource("messagedeliverypayload.json"),
            MessageDeliveryPayload.class);

        Assertions.assertThat(delivery.getMessagePayload()).isInstanceOf(CustomerLastNameSetMessagePayload.class);
        Assertions.assertThat(delivery.getMessagePayload().as(CustomerLastNameSetMessagePayload.class))
                .isInstanceOf(CustomerLastNameSetMessagePayload.class);
        Assertions.assertThat(delivery.hasCompleteMessage()).isTrue();
        Assertions.assertThatThrownBy(() -> delivery.getMessagePayload().as(CustomerFirstNameSetMessagePayload.class))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
