
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateVariantValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateVariantValuesErrorBuilder builder) {
        GraphQLDuplicateVariantValuesError graphQLDuplicateVariantValuesError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateVariantValuesError)
                .isInstanceOf(GraphQLDuplicateVariantValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantValues", GraphQLDuplicateVariantValuesError.builder()
                .variantValues(new com.commercetools.api.models.error.VariantValuesImpl()) } };
    }

    @Test
    public void variantValues() {
        GraphQLDuplicateVariantValuesError value = GraphQLDuplicateVariantValuesError.of();
        value.setVariantValues(new com.commercetools.api.models.error.VariantValuesImpl());
        Assertions.assertThat(value.getVariantValues())
                .isEqualTo(new com.commercetools.api.models.error.VariantValuesImpl());
    }
}
