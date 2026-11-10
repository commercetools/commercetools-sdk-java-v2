
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupAssignmentAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupAssignmentAddedMessagePayloadBuilder builder) {
        CustomerGroupAssignmentAddedMessagePayload customerGroupAssignmentAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentAddedMessagePayload)
                .isInstanceOf(CustomerGroupAssignmentAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                CustomerGroupAssignmentAddedMessagePayload.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        CustomerGroupAssignmentAddedMessagePayload value = CustomerGroupAssignmentAddedMessagePayload.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
    }
}
