
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicatePriceScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicatePriceScopeErrorBuilder builder) {
        GraphQLDuplicatePriceScopeError graphQLDuplicatePriceScopeError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicatePriceScopeError).isInstanceOf(GraphQLDuplicatePriceScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "conflictingPrice", GraphQLDuplicatePriceScopeError.builder()
                .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void conflictingPrice() {
        GraphQLDuplicatePriceScopeError value = GraphQLDuplicatePriceScopeError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
