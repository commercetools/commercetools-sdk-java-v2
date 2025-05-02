
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerRemoveCustomerGroupAssignmentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerRemoveCustomerGroupAssignmentActionBuilder builder) {
        CustomerRemoveCustomerGroupAssignmentAction customerRemoveCustomerGroupAssignmentAction = builder
                .buildUnchecked();
        Assertions.assertThat(customerRemoveCustomerGroupAssignmentAction)
                .isInstanceOf(CustomerRemoveCustomerGroupAssignmentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup",
                CustomerRemoveCustomerGroupAssignmentAction.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        CustomerRemoveCustomerGroupAssignmentAction value = CustomerRemoveCustomerGroupAssignmentAction.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
