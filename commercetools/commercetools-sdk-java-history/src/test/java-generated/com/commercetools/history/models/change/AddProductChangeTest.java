
package com.commercetools.history.models.change;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class AddProductChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddProductChangeBuilder builder) {
        AddProductChange addProductChange = builder.buildUnchecked();
        Assertions.assertThat(addProductChange).isInstanceOf(AddProductChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddProductChange.builder().change("change") },
                new Object[] { AddProductChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { AddProductChange.builder()
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
