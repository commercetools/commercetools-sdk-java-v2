
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddCustomerGroupAssignmentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddCustomerGroupAssignmentActionBuilder builder) {
        CustomerAddCustomerGroupAssignmentAction customerAddCustomerGroupAssignmentAction = builder.buildUnchecked();
        Assertions.assertThat(customerAddCustomerGroupAssignmentAction)
                .isInstanceOf(CustomerAddCustomerGroupAssignmentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                CustomerAddCustomerGroupAssignmentAction.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        CustomerAddCustomerGroupAssignmentAction value = CustomerAddCustomerGroupAssignmentAction.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
    }
}
