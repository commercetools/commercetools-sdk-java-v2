
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetVariantExclusionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetVariantExclusionChangeBuilder builder) {
        SetVariantExclusionChange setVariantExclusionChange = builder.buildUnchecked();
        Assertions.assertThat(setVariantExclusionChange).isInstanceOf(SetVariantExclusionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetVariantExclusionChange.builder().change("change") },
                new Object[] { "product",
                        SetVariantExclusionChange.builder()
                                .product(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "previousValue", SetVariantExclusionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductVariantExclusionImpl()) },
                new Object[] { "nextValue", SetVariantExclusionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductVariantExclusionImpl()) } };
    }

    @Test
    public void change() {
        SetVariantExclusionChange value = SetVariantExclusionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void product() {
        SetVariantExclusionChange value = SetVariantExclusionChange.of();
        value.setProduct(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void previousValue() {
        SetVariantExclusionChange value = SetVariantExclusionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
    }

    @Test
    public void nextValue() {
        SetVariantExclusionChange value = SetVariantExclusionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
    }
}
