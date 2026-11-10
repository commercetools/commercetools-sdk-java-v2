
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateAttributeValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateAttributeValuesErrorBuilder builder) {
        GraphQLDuplicateAttributeValuesError graphQLDuplicateAttributeValuesError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateAttributeValuesError)
                .isInstanceOf(GraphQLDuplicateAttributeValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attributes", GraphQLDuplicateAttributeValuesError.builder()
                .attributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void attributes() {
        GraphQLDuplicateAttributeValuesError value = GraphQLDuplicateAttributeValuesError.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
