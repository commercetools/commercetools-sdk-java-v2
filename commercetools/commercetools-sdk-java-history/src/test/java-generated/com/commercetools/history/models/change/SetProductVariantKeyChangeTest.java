
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductVariantKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductVariantKeyChangeBuilder builder) {
        SetProductVariantKeyChange setProductVariantKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setProductVariantKeyChange).isInstanceOf(SetProductVariantKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductVariantKeyChange.builder().change("change") },
                new Object[] { "previousValue", SetProductVariantKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetProductVariantKeyChange.builder().nextValue("nextValue") },
                new Object[] { "catalogData", SetProductVariantKeyChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void catalogData() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
