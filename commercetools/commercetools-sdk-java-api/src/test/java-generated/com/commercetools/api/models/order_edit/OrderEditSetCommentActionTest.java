
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditSetCommentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditSetCommentActionBuilder builder) {
        OrderEditSetCommentAction orderEditSetCommentAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditSetCommentAction).isInstanceOf(OrderEditSetCommentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "comment", OrderEditSetCommentAction.builder().comment("comment") } };
    }

    @Test
    public void comment() {
        OrderEditSetCommentAction value = OrderEditSetCommentAction.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }
}
