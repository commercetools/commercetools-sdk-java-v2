
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomerIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomerIdActionBuilder builder) {
        StagedOrderSetCustomerIdAction stagedOrderSetCustomerIdAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomerIdAction).isInstanceOf(StagedOrderSetCustomerIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId", StagedOrderSetCustomerIdAction.builder().customerId("customerId") } };
    }

    @Test
    public void customerId() {
        StagedOrderSetCustomerIdAction value = StagedOrderSetCustomerIdAction.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }
}
