
package example;

import static com.commercetools.TestUtils.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Map;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.json.ApiModuleOptions;
import com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerLastNameSetMessagePayload;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.AttributeAccessor;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.subscription.DeliveryPayload;
import com.commercetools.api.models.subscription.MessageDeliveryPayload;
import com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayload;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class SerializationTest {
    @Test
    public void dateAsString() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of()
                .withDateAttributeAsString(true)
                .withDateCustomFieldAsString(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withSerializer(ResponseSerializer.of(mapper))
                .build("test");

        ProductVariant variant = mapper.readValue(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttributes()).isNotEmpty();

        Map<String, Attribute> attributes = variant.withProductVariant(AttributeAccessor::asMap);

        assertThat(attributes.get("date").getValue()).isInstanceOfSatisfying(String.class,
            localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time").getValue()).isInstanceOfSatisfying(String.class,
            localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime").getValue()).isInstanceOfSatisfying(String.class,
            dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));
        assertThat(attributes.get("date").withAttribute(AttributeAccessor::asDate))
                .isInstanceOfSatisfying(LocalDate.class, localDate -> assertThat(localDate).isEqualTo("2020-01-01"));
        assertThat(attributes.get("time").withAttribute(AttributeAccessor::asTime))
                .isInstanceOfSatisfying(LocalTime.class, localTime -> assertThat(localTime).isEqualTo("13:15:00.123"));
        assertThat(attributes.get("datetime").withAttribute(AttributeAccessor::asDateTime)).isInstanceOfSatisfying(
            ZonedDateTime.class, dateTime -> assertThat(dateTime).isEqualTo("2020-01-01T13:15:00.123Z"));

        assertThat(attributes.get("set-date").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-time").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-datetime").getValue()).asList().first().isInstanceOf(String.class);
        assertThat(attributes.get("set-date").withAttribute(AttributeAccessor::asSetDate)).asList()
                .first()
                .isInstanceOf(LocalDate.class);
        assertThat(attributes.get("set-time").withAttribute(AttributeAccessor::asSetTime)).asList()
                .first()
                .isInstanceOf(LocalTime.class);
        assertThat(attributes.get("set-datetime").withAttribute(AttributeAccessor::asSetDateTime)).asList()
                .first()
                .isInstanceOf(ZonedDateTime.class);
    }

    @Test
    public void jsonNodes() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of().withCustomFieldAsJsonNode(true).withAttributeAsJsonNode(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withSerializer(ResponseSerializer.of(mapper))
                .build("test");
    }

    @Test
    public void attributesNumberAsDouble() throws JsonProcessingException {
        ApiModuleOptions options = ApiModuleOptions.of().withAttributeNumberAsDouble(true);
        ObjectMapper mapper = JsonUtils.createObjectMapper(options);

        ProductVariant variant = mapper.readValue(stringFromResource("attributes.json"), ProductVariant.class);

        assertThat(variant.getAttribute("integer").getValue()).isEqualTo(10.0);
    }

    @Test
    public void deliveryPayloads() {
        DeliveryPayload delivery = JsonUtils.fromJsonString(stringFromResource("messagedeliverypayload.json"),
            DeliveryPayload.class);
        assertThat(delivery).isInstanceOf(DeliveryPayload.class);
        assertThat(delivery).isInstanceOf(MessageDeliveryPayload.class);
    }

    @Test
    public void messageDeliveryPayloads() {
        DeliveryPayload delivery = JsonUtils.fromJsonString(stringFromResource("messagedeliverypayload.json"),
            DeliveryPayload.class);

        assertThat(delivery).isInstanceOf(MessageDeliveryPayload.class);
        MessageDeliveryPayload messageDelivery = (MessageDeliveryPayload) delivery;

        assertThat(messageDelivery.getMessagePayload()).isInstanceOf(CustomerLastNameSetMessagePayload.class);

        assertThat(messageDelivery.getMessagePayload().as(CustomerLastNameSetMessagePayload.class))
                .isInstanceOf(CustomerLastNameSetMessagePayload.class);

        assertThat(messageDelivery.hasCompleteMessage()).isTrue();

        assertThatThrownBy(() -> messageDelivery.getMessagePayload().as(CustomerFirstNameSetMessagePayload.class))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void changeDeliveryPayloads() {
        DeliveryPayload delivery = JsonUtils.fromJsonString(stringFromResource("changedeliverypayload.json"),
            DeliveryPayload.class);

        assertThat(delivery).isInstanceOf(ResourceCreatedDeliveryPayload.class);
    }
}
