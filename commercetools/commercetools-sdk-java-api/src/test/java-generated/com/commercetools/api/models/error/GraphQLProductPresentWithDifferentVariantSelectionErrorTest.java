
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
public class GraphQLProductPresentWithDifferentVariantSelectionErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder builder) {
        GraphQLProductPresentWithDifferentVariantSelectionError graphQLProductPresentWithDifferentVariantSelectionError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLProductPresentWithDifferentVariantSelectionError)
                .isInstanceOf(GraphQLProductPresentWithDifferentVariantSelectionError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLProductPresentWithDifferentVariantSelectionError.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { GraphQLProductPresentWithDifferentVariantSelectionError.builder()
                        .existingVariantSelection(
                            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl()) } };
    }

    @Test
    public void product() {
        GraphQLProductPresentWithDifferentVariantSelectionError value = GraphQLProductPresentWithDifferentVariantSelectionError
                .of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void existingVariantSelection() {
        GraphQLProductPresentWithDifferentVariantSelectionError value = GraphQLProductPresentWithDifferentVariantSelectionError
                .of();
        value.setExistingVariantSelection(
            new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
        Assertions.assertThat(value.getExistingVariantSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductVariantSelectionImpl());
    }
}
