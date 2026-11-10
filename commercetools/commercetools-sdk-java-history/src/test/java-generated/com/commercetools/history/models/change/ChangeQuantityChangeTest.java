
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeQuantityChangeBuilder builder) {
        ChangeQuantityChange changeQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuantityChange).isInstanceOf(ChangeQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeQuantityChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeQuantityChange.builder()
                                .previousValue(
                                    new com.commercetools.history.models.change_value.InventoryQuantityValueImpl()) },
                new Object[] { "nextValue", ChangeQuantityChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
    }
}
