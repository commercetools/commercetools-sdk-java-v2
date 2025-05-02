
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetVariantSelectionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetVariantSelectionChangeBuilder builder) {
        SetVariantSelectionChange setVariantSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(setVariantSelectionChange).isInstanceOf(SetVariantSelectionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetVariantSelectionChange.builder().change("change") },
                new Object[] { "previousValue", SetVariantSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl()) },
                new Object[] { "nextValue",
                        SetVariantSelectionChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl()) },
                new Object[] { "product", SetVariantSelectionChange.builder()
                        .product(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        SetVariantSelectionChange value = SetVariantSelectionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetVariantSelectionChange value = SetVariantSelectionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
    }

    @Test
    public void nextValue() {
        SetVariantSelectionChange value = SetVariantSelectionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
    }

    @Test
    public void product() {
        SetVariantSelectionChange value = SetVariantSelectionChange.of();
        value.setProduct(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
