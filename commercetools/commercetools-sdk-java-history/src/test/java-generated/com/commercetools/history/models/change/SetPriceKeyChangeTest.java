
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPriceKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPriceKeyChangeBuilder builder) {
        SetPriceKeyChange setPriceKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setPriceKeyChange).isInstanceOf(SetPriceKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPriceKeyChange.builder().change("change") },
                new Object[] { "catalogData", SetPriceKeyChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetPriceKeyChange.builder().variant("variant") },
                new Object[] { "priceId", SetPriceKeyChange.builder().priceId("priceId") },
                new Object[] { "previousValue", SetPriceKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetPriceKeyChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void catalogData() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void priceId() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void previousValue() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetPriceKeyChange value = SetPriceKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
