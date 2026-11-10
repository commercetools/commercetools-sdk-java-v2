
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyResourceIdentifierBuilder builder) {
        RecurrencePolicyResourceIdentifier recurrencePolicyResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicyResourceIdentifier)
                .isInstanceOf(RecurrencePolicyResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurrencePolicyResourceIdentifier.builder().id("id") },
                new Object[] { "key", RecurrencePolicyResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        RecurrencePolicyResourceIdentifier value = RecurrencePolicyResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        RecurrencePolicyResourceIdentifier value = RecurrencePolicyResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
