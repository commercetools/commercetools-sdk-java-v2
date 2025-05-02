
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetVariantAvailabilityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetVariantAvailabilityChangeBuilder builder) {
        SetVariantAvailabilityChange setVariantAvailabilityChange = builder.buildUnchecked();
        Assertions.assertThat(setVariantAvailabilityChange).isInstanceOf(SetVariantAvailabilityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetVariantAvailabilityChange.builder().change("change") },
                new Object[] { "previousValue", SetVariantAvailabilityChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl()) },
                new Object[] { "nextValue", SetVariantAvailabilityChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl()) },
                new Object[] { "catalogData", SetVariantAvailabilityChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetVariantAvailabilityChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
    }

    @Test
    public void nextValue() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
    }

    @Test
    public void catalogData() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
