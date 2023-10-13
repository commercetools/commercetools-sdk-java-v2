
package com.commercetools.api.models.error;

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
public class ProductPresentWithDifferentVariantSelectionErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPresentWithDifferentVariantSelectionErrorBuilder builder) {
        ProductPresentWithDifferentVariantSelectionError productPresentWithDifferentVariantSelectionError = builder
                .buildUnchecked();
        Assertions.assertThat(productPresentWithDifferentVariantSelectionError)
                .isInstanceOf(ProductPresentWithDifferentVariantSelectionError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPresentWithDifferentVariantSelectionError.builder().message("message") },
                new Object[] { ProductPresentWithDifferentVariantSelectionError.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { ProductPresentWithDifferentVariantSelectionError.builder()
                        .existingVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void message() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void product() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void existingVariantSelection() {
        ProductPresentWithDifferentVariantSelectionError value = ProductPresentWithDifferentVariantSelectionError.of();
        value.setExistingVariantSelection(
            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getExistingVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
