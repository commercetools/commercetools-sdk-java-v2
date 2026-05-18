
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadBuilder builder) {
        BusinessUnitCustomerGroupAssignmentRemovedMessagePayload businessUnitCustomerGroupAssignmentRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentRemovedMessagePayload)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                BusinessUnitCustomerGroupAssignmentRemovedMessagePayload.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        BusinessUnitCustomerGroupAssignmentRemovedMessagePayload value = BusinessUnitCustomerGroupAssignmentRemovedMessagePayload
                .of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
    }
}
