
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionCreatedMessageBuilder builder) {
        ProductSelectionCreatedMessage productSelectionCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(productSelectionCreatedMessage).isInstanceOf(ProductSelectionCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", ProductSelectionCreatedMessage.builder()
                .productSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl()) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionCreatedMessage value = ProductSelectionCreatedMessage.of();
        value.setProductSelection(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
    }
}
