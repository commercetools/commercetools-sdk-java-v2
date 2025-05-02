
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupAssignmentsSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupAssignmentsSetMessagePayloadBuilder builder) {
        CustomerGroupAssignmentsSetMessagePayload customerGroupAssignmentsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentsSetMessagePayload)
                .isInstanceOf(CustomerGroupAssignmentsSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignments",
                CustomerGroupAssignmentsSetMessagePayload.builder()
                        .customerGroupAssignments(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerGroupAssignmentsSetMessagePayload value = CustomerGroupAssignmentsSetMessagePayload.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
