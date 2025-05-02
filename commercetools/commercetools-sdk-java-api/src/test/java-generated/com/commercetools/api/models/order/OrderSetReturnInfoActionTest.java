
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetReturnInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetReturnInfoActionBuilder builder) {
        OrderSetReturnInfoAction orderSetReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnInfoAction).isInstanceOf(OrderSetReturnInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "items", OrderSetReturnInfoAction.builder()
                .items(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl())) } };
    }

    @Test
    public void items() {
        OrderSetReturnInfoAction value = OrderSetReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
    }
}
