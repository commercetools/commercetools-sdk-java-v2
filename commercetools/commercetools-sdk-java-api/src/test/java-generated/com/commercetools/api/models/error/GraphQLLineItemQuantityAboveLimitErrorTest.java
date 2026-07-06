
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLLineItemQuantityAboveLimitErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLLineItemQuantityAboveLimitErrorBuilder builder) {
        GraphQLLineItemQuantityAboveLimitError graphQLLineItemQuantityAboveLimitError = builder.buildUnchecked();
        Assertions.assertThat(graphQLLineItemQuantityAboveLimitError)
                .isInstanceOf(GraphQLLineItemQuantityAboveLimitError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quantity", GraphQLLineItemQuantityAboveLimitError.builder().quantity(8) },
                new Object[] { "maxCartQuantity", GraphQLLineItemQuantityAboveLimitError.builder().maxCartQuantity(4) },
                new Object[] { "lineItem", GraphQLLineItemQuantityAboveLimitError.builder().lineItem("lineItem") } };
    }

    @Test
    public void quantity() {
        GraphQLLineItemQuantityAboveLimitError value = GraphQLLineItemQuantityAboveLimitError.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void maxCartQuantity() {
        GraphQLLineItemQuantityAboveLimitError value = GraphQLLineItemQuantityAboveLimitError.of();
        value.setMaxCartQuantity(4);
        Assertions.assertThat(value.getMaxCartQuantity()).isEqualTo(4);
    }

    @Test
    public void lineItem() {
        GraphQLLineItemQuantityAboveLimitError value = GraphQLLineItemQuantityAboveLimitError.of();
        value.setLineItem("lineItem");
        Assertions.assertThat(value.getLineItem()).isEqualTo("lineItem");
    }
}
