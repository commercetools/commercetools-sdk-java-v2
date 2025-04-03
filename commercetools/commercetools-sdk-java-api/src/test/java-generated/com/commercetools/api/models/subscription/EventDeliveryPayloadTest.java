
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class EventDeliveryPayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EventDeliveryPayloadBuilder builder) {
        EventDeliveryPayload eventDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(eventDeliveryPayload).isInstanceOf(EventDeliveryPayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EventDeliveryPayload.builder().id("id") },
                new Object[] { EventDeliveryPayload.builder()
                        .type(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated")) },
                new Object[] { EventDeliveryPayload.builder().resourceType("resourceType") },
                new Object[] { EventDeliveryPayload.builder().data("data") },
                new Object[] { EventDeliveryPayload.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        EventDeliveryPayload value = EventDeliveryPayload.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void type() {
        EventDeliveryPayload value = EventDeliveryPayload.of();
        value.setType(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated"));
    }

    @Test
    public void resourceType() {
        EventDeliveryPayload value = EventDeliveryPayload.of();
        value.setResourceType("resourceType");
        Assertions.assertThat(value.getResourceType()).isEqualTo("resourceType");
    }

    @Test
    public void data() {
        EventDeliveryPayload value = EventDeliveryPayload.of();
        value.setData("data");
        Assertions.assertThat(value.getData()).isEqualTo("data");
    }

    @Test
    public void createdAt() {
        EventDeliveryPayload value = EventDeliveryPayload.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
