
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportUnresolvedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportUnresolvedEventBuilder builder) {
        ImportUnresolvedEvent importUnresolvedEvent = builder.buildUnchecked();
        Assertions.assertThat(importUnresolvedEvent).isInstanceOf(ImportUnresolvedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportUnresolvedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", ImportUnresolvedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportUnresolvedEvent value = ImportUnresolvedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        ImportUnresolvedEvent value = ImportUnresolvedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportUnresolvedEventDataImpl());
    }
}
