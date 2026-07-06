
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPriceModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPriceModeChangeBuilder builder) {
        SetPriceModeChange setPriceModeChange = builder.buildUnchecked();
        Assertions.assertThat(setPriceModeChange).isInstanceOf(SetPriceModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPriceModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetPriceModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.ProductPriceModeEnum
                                        .findEnum("Embedded")) },
                new Object[] { "nextValue", SetPriceModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void change() {
        SetPriceModeChange value = SetPriceModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPriceModeChange value = SetPriceModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ProductPriceModeEnum.findEnum("Embedded"));
    }

    @Test
    public void nextValue() {
        SetPriceModeChange value = SetPriceModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
