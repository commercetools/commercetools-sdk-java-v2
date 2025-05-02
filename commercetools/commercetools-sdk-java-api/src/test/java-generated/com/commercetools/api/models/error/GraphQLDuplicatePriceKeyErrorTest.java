
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicatePriceKeyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicatePriceKeyErrorBuilder builder) {
        GraphQLDuplicatePriceKeyError graphQLDuplicatePriceKeyError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicatePriceKeyError).isInstanceOf(GraphQLDuplicatePriceKeyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "conflictingPrice", GraphQLDuplicatePriceKeyError.builder()
                .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void conflictingPrice() {
        GraphQLDuplicatePriceKeyError value = GraphQLDuplicatePriceKeyError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
