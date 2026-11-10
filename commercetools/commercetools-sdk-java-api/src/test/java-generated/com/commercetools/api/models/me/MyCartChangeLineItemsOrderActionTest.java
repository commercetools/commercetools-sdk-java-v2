
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartChangeLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartChangeLineItemsOrderActionBuilder builder) {
        MyCartChangeLineItemsOrderAction myCartChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(myCartChangeLineItemsOrderAction).isInstanceOf(MyCartChangeLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItemOrder", MyCartChangeLineItemsOrderAction.builder()
                .lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        MyCartChangeLineItemsOrderAction value = MyCartChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
