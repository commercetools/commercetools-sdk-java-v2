
package com.commercetools.api.models.customer;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetCustomerGroupAssignmentsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetCustomerGroupAssignmentsActionBuilder builder) {
        CustomerSetCustomerGroupAssignmentsAction customerSetCustomerGroupAssignmentsAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomerGroupAssignmentsAction)
                .isInstanceOf(CustomerSetCustomerGroupAssignmentsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignments",
                CustomerSetCustomerGroupAssignmentsAction.builder()
                        .customerGroupAssignments(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerSetCustomerGroupAssignmentsAction value = CustomerSetCustomerGroupAssignmentsAction.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
    }
}
