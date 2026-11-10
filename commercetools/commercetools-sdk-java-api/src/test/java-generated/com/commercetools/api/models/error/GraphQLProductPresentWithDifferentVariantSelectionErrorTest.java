
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLProductPresentWithDifferentVariantSelectionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder builder) {
        GraphQLProductPresentWithDifferentVariantSelectionError graphQLProductPresentWithDifferentVariantSelectionError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLProductPresentWithDifferentVariantSelectionError)
                .isInstanceOf(GraphQLProductPresentWithDifferentVariantSelectionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        GraphQLProductPresentWithDifferentVariantSelectionError.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "existingVariantSelection", GraphQLProductPresentWithDifferentVariantSelectionError
                        .builder()
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
