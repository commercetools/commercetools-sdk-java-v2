
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLLineItemQuantityBelowLimitErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLLineItemQuantityBelowLimitErrorBuilder builder) {
        GraphQLLineItemQuantityBelowLimitError graphQLLineItemQuantityBelowLimitError = builder.buildUnchecked();
        Assertions.assertThat(graphQLLineItemQuantityBelowLimitError)
                .isInstanceOf(GraphQLLineItemQuantityBelowLimitError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quantity", GraphQLLineItemQuantityBelowLimitError.builder().quantity(8) },
                new Object[] { "minCartQuantity", GraphQLLineItemQuantityBelowLimitError.builder().minCartQuantity(6) },
                new Object[] { "lineItem", GraphQLLineItemQuantityBelowLimitError.builder().lineItem("lineItem") } };
    }

    @Test
    public void quantity() {
        GraphQLLineItemQuantityBelowLimitError value = GraphQLLineItemQuantityBelowLimitError.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void minCartQuantity() {
        GraphQLLineItemQuantityBelowLimitError value = GraphQLLineItemQuantityBelowLimitError.of();
        value.setMinCartQuantity(6);
        Assertions.assertThat(value.getMinCartQuantity()).isEqualTo(6);
    }

    @Test
    public void lineItem() {
        GraphQLLineItemQuantityBelowLimitError value = GraphQLLineItemQuantityBelowLimitError.of();
        value.setLineItem("lineItem");
        Assertions.assertThat(value.getLineItem()).isEqualTo("lineItem");
    }
}
