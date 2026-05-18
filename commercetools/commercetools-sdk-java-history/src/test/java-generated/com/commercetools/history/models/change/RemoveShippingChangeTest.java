
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveShippingChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveShippingChangeBuilder builder) {
        RemoveShippingChange removeShippingChange = builder.buildUnchecked();
        Assertions.assertThat(removeShippingChange).isInstanceOf(RemoveShippingChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveShippingChange.builder().change("change") },
                new Object[] { "previousValue", RemoveShippingChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ShippingImpl()) } };
    }

    @Test
    public void change() {
        RemoveShippingChange value = RemoveShippingChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveShippingChange value = RemoveShippingChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ShippingImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingImpl());
    }
}
