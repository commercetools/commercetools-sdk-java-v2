
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionRemoveProductActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionRemoveProductActionBuilder builder) {
        ProductSelectionRemoveProductAction productSelectionRemoveProductAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionRemoveProductAction)
                .isInstanceOf(ProductSelectionRemoveProductAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "product", ProductSelectionRemoveProductAction.builder()
                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionRemoveProductAction value = ProductSelectionRemoveProductAction.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }
}
