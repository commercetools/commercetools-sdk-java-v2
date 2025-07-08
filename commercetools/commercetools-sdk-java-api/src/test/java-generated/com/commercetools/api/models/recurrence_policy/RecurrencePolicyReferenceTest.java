
package com.commercetools.api.models.recurrence_policy;

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
        return new Object[][] {
                new Object[] { "obj",
                        RecurrencePolicyReference.builder()
                                .obj(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl()) },
                new Object[] { "id", RecurrencePolicyReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        RecurrencePolicyReference value = RecurrencePolicyReference.of();
        value.setObj(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyImpl());
    }

    @Test
    public void id() {
        RecurrencePolicyReference value = RecurrencePolicyReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
