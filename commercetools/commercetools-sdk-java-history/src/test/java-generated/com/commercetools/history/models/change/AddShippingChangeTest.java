
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddShippingChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddShippingChangeBuilder builder) {
        AddShippingChange addShippingChange = builder.buildUnchecked();
        Assertions.assertThat(addShippingChange).isInstanceOf(AddShippingChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddShippingChange.builder().change("change") }, new Object[] {
                "nextValue",
                AddShippingChange.builder().nextValue(new com.commercetools.history.models.common.ShippingImpl()) } };
    }

    @Test
    public void change() {
        AddShippingChange value = AddShippingChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddShippingChange value = AddShippingChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ShippingImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingImpl());
    }
}
