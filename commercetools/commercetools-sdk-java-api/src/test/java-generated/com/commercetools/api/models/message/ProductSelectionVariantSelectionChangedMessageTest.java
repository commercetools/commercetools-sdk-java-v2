
package com.commercetools.api.models.message;

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
public class ProductSelectionVariantSelectionChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionVariantSelectionChangedMessageBuilder builder) {
        ProductSelectionVariantSelectionChangedMessage productSelectionVariantSelectionChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionVariantSelectionChangedMessage)
                .isInstanceOf(ProductSelectionVariantSelectionChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionVariantSelectionChangedMessage.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductSelectionVariantSelectionChangedMessage.builder()
                        .oldVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) },
                new Object[] { ProductSelectionVariantSelectionChangedMessage.builder()
                        .newVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void oldVariantSelection() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setOldVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getOldVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }

    @Test
    public void newVariantSelection() {
        ProductSelectionVariantSelectionChangedMessage value = ProductSelectionVariantSelectionChangedMessage.of();
        value.setNewVariantSelection(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getNewVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
