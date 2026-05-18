
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentAddedMessageBuilder builder) {
        BusinessUnitCustomerGroupAssignmentAddedMessage businessUnitCustomerGroupAssignmentAddedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentAddedMessage)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                BusinessUnitCustomerGroupAssignmentAddedMessage.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        BusinessUnitCustomerGroupAssignmentAddedMessage value = BusinessUnitCustomerGroupAssignmentAddedMessage.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
    }
}
