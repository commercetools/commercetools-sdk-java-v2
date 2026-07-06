
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupAssignmentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupAssignmentBuilder builder) {
        CustomerGroupAssignment customerGroupAssignment = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignment).isInstanceOf(CustomerGroupAssignment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup", CustomerGroupAssignment.builder()
                .customerGroup(new com.commercetools.history.models.common.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customerGroup() {
        CustomerGroupAssignment value = CustomerGroupAssignment.of();
        value.setCustomerGroup(new com.commercetools.history.models.common.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.history.models.common.CustomerGroupReferenceImpl());
    }
}
