
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddProductChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddProductChangeBuilder builder) {
        AddProductChange addProductChange = builder.buildUnchecked();
        Assertions.assertThat(addProductChange).isInstanceOf(AddProductChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddProductChange.builder().change("change") },
                new Object[] { "nextValue",
                        AddProductChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "variantSelection",
                        AddProductChange.builder()
                                .variantSelection(
                                    new com.commercetools.history.models.common.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void change() {
        AddProductChange value = AddProductChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddProductChange value = AddProductChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void variantSelection() {
        AddProductChange value = AddProductChange.of();
        value.setVariantSelection(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getVariantSelection())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantSelectionImpl());
    }
}
