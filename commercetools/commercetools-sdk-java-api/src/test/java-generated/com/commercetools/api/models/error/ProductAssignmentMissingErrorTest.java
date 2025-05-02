
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAssignmentMissingErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAssignmentMissingErrorBuilder builder) {
        ProductAssignmentMissingError productAssignmentMissingError = builder.buildUnchecked();
        Assertions.assertThat(productAssignmentMissingError).isInstanceOf(ProductAssignmentMissingError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ProductAssignmentMissingError.builder().message("message") },
                new Object[] { "product", ProductAssignmentMissingError.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void message() {
        ProductAssignmentMissingError value = ProductAssignmentMissingError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void product() {
        ProductAssignmentMissingError value = ProductAssignmentMissingError.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
