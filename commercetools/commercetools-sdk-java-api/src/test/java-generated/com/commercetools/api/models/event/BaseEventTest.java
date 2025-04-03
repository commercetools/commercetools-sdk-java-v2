
package com.commercetools.api.models.event;

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
public class BaseEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BaseEventBuilder builder) {
        BaseEvent baseEvent = builder.buildUnchecked();
        Assertions.assertThat(baseEvent).isInstanceOf(BaseEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BaseEvent.builder().id("id") },
                new Object[] { BaseEvent.builder().notificationType("notificationType") },
                new Object[] { BaseEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { BaseEvent.builder()
                        .type(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated")) },
                new Object[] { BaseEvent.builder().data("data") },
                new Object[] { BaseEvent.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        BaseEvent value = BaseEvent.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void notificationType() {
        BaseEvent value = BaseEvent.of();
        value.setNotificationType("notificationType");
        Assertions.assertThat(value.getNotificationType()).isEqualTo("notificationType");
    }

    @Test
    public void resourceType() {
        BaseEvent value = BaseEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void type() {
        BaseEvent value = BaseEvent.of();
        value.setType(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated"));
    }

    @Test
    public void data() {
        BaseEvent value = BaseEvent.of();
        value.setData("data");
        Assertions.assertThat(value.getData()).isEqualTo("data");
    }

    @Test
    public void createdAt() {
        BaseEvent value = BaseEvent.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
