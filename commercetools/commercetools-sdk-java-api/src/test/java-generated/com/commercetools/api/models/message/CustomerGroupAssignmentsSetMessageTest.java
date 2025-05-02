
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupAssignmentsSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupAssignmentsSetMessageBuilder builder) {
        CustomerGroupAssignmentsSetMessage customerGroupAssignmentsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentsSetMessage)
                .isInstanceOf(CustomerGroupAssignmentsSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignments",
                CustomerGroupAssignmentsSetMessage.builder()
                        .customerGroupAssignments(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerGroupAssignmentsSetMessage value = CustomerGroupAssignmentsSetMessage.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
