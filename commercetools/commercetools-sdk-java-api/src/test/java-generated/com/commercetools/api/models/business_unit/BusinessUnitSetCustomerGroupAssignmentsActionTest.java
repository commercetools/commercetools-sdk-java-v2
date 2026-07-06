
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetCustomerGroupAssignmentsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetCustomerGroupAssignmentsActionBuilder builder) {
        BusinessUnitSetCustomerGroupAssignmentsAction businessUnitSetCustomerGroupAssignmentsAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitSetCustomerGroupAssignmentsAction)
                .isInstanceOf(BusinessUnitSetCustomerGroupAssignmentsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignments",
                BusinessUnitSetCustomerGroupAssignmentsAction.builder()
                        .customerGroupAssignments(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        BusinessUnitSetCustomerGroupAssignmentsAction value = BusinessUnitSetCustomerGroupAssignmentsAction.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
    }
}
