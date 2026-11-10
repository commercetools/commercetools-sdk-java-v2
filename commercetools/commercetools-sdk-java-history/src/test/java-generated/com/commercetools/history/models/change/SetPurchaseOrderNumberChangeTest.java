
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPurchaseOrderNumberChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPurchaseOrderNumberChangeBuilder builder) {
        SetPurchaseOrderNumberChange setPurchaseOrderNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setPurchaseOrderNumberChange).isInstanceOf(SetPurchaseOrderNumberChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPurchaseOrderNumberChange.builder().change("change") },
                new Object[] { "previousValue", SetPurchaseOrderNumberChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetPurchaseOrderNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
