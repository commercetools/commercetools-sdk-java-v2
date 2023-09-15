
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
public class SetVariantSelectionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetVariantSelectionChangeBuilder builder) {
        SetVariantSelectionChange setVariantSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(setVariantSelectionChange).isInstanceOf(SetVariantSelectionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetVariantSelectionChange.builder().change("change") },
                new Object[] { SetVariantSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl()) },
                new Object[] { SetVariantSelectionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductVariantSelectionImpl()) },
                new Object[] { SetVariantSelectionChange.builder()
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
