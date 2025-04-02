
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import java.io.IOException;

import com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerLastNameSetMessagePayload;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.subscription.*;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagePayloadTest {

    @Test
    public void delivery() {
        String messagePayload = "{\n" + "  \"notificationType\":\"Message\",\n"
                + "  \"projectKey\":\"<project_key>\",\n" + "  \"id\":\"<message_id>\",\n" + "  \"version\":1,\n"
                + "  \"sequenceNumber\":2,\n" + "  \"resource\":{\n" + "     \"typeId\":\"customer\",\n"
                + "     \"id\":\"<customer_id>\"\n" + "  },\n" + "  \"resourceVersion\":2,\n"
                + "  \"resourceUserProvidedIdentifiers\":{},\n" + "  \"type\":\"CustomerLastNameSet\",\n"
                + "  \"lastName\":\"Doe\",\n" + "  \"createdAt\":\"2022-10-25T13:30:09.760Z\",\n"
                + "  \"lastModifiedAt\":\"2022-10-25T13:30:09.760Z\"\n" + "}";
        SubscriptionNotification deserializedObject = JsonUtils.fromJsonString(messagePayload,
            SubscriptionNotification.class);
        Assertions.assertThat(deserializedObject).isInstanceOf(MessageDeliveryPayload.class);

        deserializedObject = JsonUtils.fromJsonString(messagePayload, DeliveryPayload.class);
        Assertions.assertThat(deserializedObject).isInstanceOf(MessageDeliveryPayload.class);

        String eventPayload = "{\n" + "  \"id\": \"3b364ca2-cbe5-42b4-a85a-37d4e57d659e\",\n"
                + "  \"notificationType\": \"Event\",\n" + "  \"type\": \"ImportContainerCreated\",\n"
                + "  \"resourceType\": \"import-api\",\n" + "  \"data\": {\n" + "    \"version\": 1,\n"
                + "    \"key\": \"my-import-container\",\n" + "    \"createdAt\": \"2025-03-26T17:28:20.376Z\",\n"
                + "    \"lastModifiedAt\": \"2025-03-26T17:28:20.376Z\"\n" + "  },\n"
                + "  \"createdAt\": \"2025-03-26T17:28:20.397Z\"\n" + "}\n";
        deserializedObject = JsonUtils.fromJsonString(eventPayload, SubscriptionNotification.class);
        Assertions.assertThat(deserializedObject).isInstanceOf(EventDeliveryPayload.class);

        String changePayload = "{\n" + "  \"notificationType\":\"ResourceCreated\",\n"
                + "  \"projectKey\":\"<project_key>\",\n" + "  \"resource\":{\n" + "     \"typeId\":\"product\",\n"
                + "     \"id\":\"<product_id>\"\n" + "  },\n" + "  \"resourceUserProvidedIdentifiers\":{\n"
                + "     \"key\":\"example-product-key\",\n" + "     \"slug\":{\n" + "        \"en\":\"example-slug\"\n"
                + "     }\n" + "  },\n" + "  \"version\":1,\n" + "  \"modifiedAt\":\"2022-10-25T13:23:05.384Z\"\n"
                + "}\n";
        deserializedObject = JsonUtils.fromJsonString(changePayload, SubscriptionNotification.class);
        Assertions.assertThat(deserializedObject).isInstanceOf(ResourceCreatedDeliveryPayload.class);

        deserializedObject = JsonUtils.fromJsonString(changePayload, DeliveryPayload.class);
        Assertions.assertThat(deserializedObject).isInstanceOf(ResourceCreatedDeliveryPayload.class);

    }

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

    @Test
    public void deserializeDeliveryPayload() {
        DeliveryPayload delivery = JsonUtils.fromJsonString(stringFromResource("messagedeliverypayload.json"),
            DeliveryPayload.class);

        Assertions.assertThat(delivery).isInstanceOf(MessageDeliveryPayload.class);
        MessageDeliveryPayload messageDelivery = (MessageDeliveryPayload) delivery;
        Assertions.assertThat(messageDelivery.getMessagePayload())
                .isInstanceOf(CustomerLastNameSetMessagePayload.class);
        Assertions.assertThat(messageDelivery.getMessagePayload().as(CustomerLastNameSetMessagePayload.class))
                .isInstanceOf(CustomerLastNameSetMessagePayload.class);
        Assertions.assertThat(messageDelivery.hasCompleteMessage()).isTrue();
        Assertions
                .assertThatThrownBy(
                    () -> messageDelivery.getMessagePayload().as(CustomerFirstNameSetMessagePayload.class))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
