
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetSkuChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetSkuChangeBuilder builder) {
        SetSkuChange setSkuChange = builder.buildUnchecked();
        Assertions.assertThat(setSkuChange).isInstanceOf(SetSkuChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetSkuChange.builder().change("change") },
                new Object[] { "previousValue", SetSkuChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetSkuChange.builder().nextValue("nextValue") },
                new Object[] { "catalogData", SetSkuChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetSkuChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetSkuChange value = SetSkuChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSkuChange value = SetSkuChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetSkuChange value = SetSkuChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void catalogData() {
        SetSkuChange value = SetSkuChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetSkuChange value = SetSkuChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
