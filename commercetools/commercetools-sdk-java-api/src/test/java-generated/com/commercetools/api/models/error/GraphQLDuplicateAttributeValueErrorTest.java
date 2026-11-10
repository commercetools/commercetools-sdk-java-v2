
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateAttributeValueErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateAttributeValueErrorBuilder builder) {
        GraphQLDuplicateAttributeValueError graphQLDuplicateAttributeValueError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateAttributeValueError)
                .isInstanceOf(GraphQLDuplicateAttributeValueError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attribute", GraphQLDuplicateAttributeValueError.builder()
                .attribute(new com.commercetools.api.models.product.AttributeImpl()) } };
    }

    @Test
    public void attribute() {
        GraphQLDuplicateAttributeValueError value = GraphQLDuplicateAttributeValueError.of();
        value.setAttribute(new com.commercetools.api.models.product.AttributeImpl());
        Assertions.assertThat(value.getAttribute()).isEqualTo(new com.commercetools.api.models.product.AttributeImpl());
    }
}
