
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomerGroupAssignmentAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomerGroupAssignmentAddedMessagePayloadBuilder builder) {
        BusinessUnitCustomerGroupAssignmentAddedMessagePayload businessUnitCustomerGroupAssignmentAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomerGroupAssignmentAddedMessagePayload)
                .isInstanceOf(BusinessUnitCustomerGroupAssignmentAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                BusinessUnitCustomerGroupAssignmentAddedMessagePayload.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        BusinessUnitCustomerGroupAssignmentAddedMessagePayload value = BusinessUnitCustomerGroupAssignmentAddedMessagePayload
                .of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl());
    }
}
