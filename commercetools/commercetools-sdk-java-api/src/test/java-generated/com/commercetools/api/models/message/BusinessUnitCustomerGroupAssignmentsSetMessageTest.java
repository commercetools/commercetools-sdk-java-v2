
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentsSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentsSetMessageBuilder builder) {
        BusinessUnitCustomerGroupAssignmentsSetMessage businessUnitCustomerGroupAssignmentsSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentsSetMessage)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentsSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerGroupAssignments",
                        BusinessUnitCustomerGroupAssignmentsSetMessage.builder()
                                .customerGroupAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) },
                new Object[] { "oldCustomerGroupAssignments",
                        BusinessUnitCustomerGroupAssignmentsSetMessage.builder()
                                .oldCustomerGroupAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        BusinessUnitCustomerGroupAssignmentsSetMessage value = BusinessUnitCustomerGroupAssignmentsSetMessage.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }

    @Test
    public void oldCustomerGroupAssignments() {
        BusinessUnitCustomerGroupAssignmentsSetMessage value = BusinessUnitCustomerGroupAssignmentsSetMessage.of();
        value.setOldCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getOldCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
