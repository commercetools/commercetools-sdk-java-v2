
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyReferenceBuilder builder) {
        RecurrencePolicyReference recurrencePolicyReference = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicyReference).isInstanceOf(RecurrencePolicyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurrencePolicyReference.builder().id("id") } };
    }

    @Test
    public void id() {
        RecurrencePolicyReference value = RecurrencePolicyReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
