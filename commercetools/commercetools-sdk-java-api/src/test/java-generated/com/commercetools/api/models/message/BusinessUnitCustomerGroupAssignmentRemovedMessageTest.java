
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder builder) {
        BusinessUnitCustomerGroupAssignmentRemovedMessage businessUnitCustomerGroupAssignmentRemovedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentRemovedMessage)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                BusinessUnitCustomerGroupAssignmentRemovedMessage.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        BusinessUnitCustomerGroupAssignmentRemovedMessage value = BusinessUnitCustomerGroupAssignmentRemovedMessage
                .of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
    }
}
