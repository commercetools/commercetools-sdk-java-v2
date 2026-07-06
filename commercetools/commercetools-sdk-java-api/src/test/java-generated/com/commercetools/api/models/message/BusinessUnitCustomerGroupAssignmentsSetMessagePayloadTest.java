
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentsSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentsSetMessagePayloadBuilder builder) {
        BusinessUnitCustomerGroupAssignmentsSetMessagePayload businessUnitCustomerGroupAssignmentsSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentsSetMessagePayload)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentsSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerGroupAssignments",
                        BusinessUnitCustomerGroupAssignmentsSetMessagePayload.builder()
                                .customerGroupAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) },
                new Object[] { "oldCustomerGroupAssignments",
                        BusinessUnitCustomerGroupAssignmentsSetMessagePayload.builder()
                                .oldCustomerGroupAssignments(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        BusinessUnitCustomerGroupAssignmentsSetMessagePayload value = BusinessUnitCustomerGroupAssignmentsSetMessagePayload
                .of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }

    @Test
    public void oldCustomerGroupAssignments() {
        BusinessUnitCustomerGroupAssignmentsSetMessagePayload value = BusinessUnitCustomerGroupAssignmentsSetMessagePayload
                .of();
        value.setOldCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getOldCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
