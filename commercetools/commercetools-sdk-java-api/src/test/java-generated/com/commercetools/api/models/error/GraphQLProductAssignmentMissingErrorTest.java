
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLProductAssignmentMissingErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLProductAssignmentMissingErrorBuilder builder) {
        GraphQLProductAssignmentMissingError graphQLProductAssignmentMissingError = builder.buildUnchecked();
        Assertions.assertThat(graphQLProductAssignmentMissingError)
                .isInstanceOf(GraphQLProductAssignmentMissingError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "product", GraphQLProductAssignmentMissingError.builder()
                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void product() {
        GraphQLProductAssignmentMissingError value = GraphQLProductAssignmentMissingError.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
