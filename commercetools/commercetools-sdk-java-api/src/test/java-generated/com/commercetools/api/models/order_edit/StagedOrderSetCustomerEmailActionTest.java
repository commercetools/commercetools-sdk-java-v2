
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomerEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomerEmailActionBuilder builder) {
        StagedOrderSetCustomerEmailAction stagedOrderSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomerEmailAction).isInstanceOf(StagedOrderSetCustomerEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", StagedOrderSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        StagedOrderSetCustomerEmailAction value = StagedOrderSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
