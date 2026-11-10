
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderResourceIdentifierBuilder builder) {
        RecurringOrderResourceIdentifier recurringOrderResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderResourceIdentifier).isInstanceOf(RecurringOrderResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringOrderResourceIdentifier.builder().id("id") },
                new Object[] { "key", RecurringOrderResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        RecurringOrderResourceIdentifier value = RecurringOrderResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        RecurringOrderResourceIdentifier value = RecurringOrderResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
