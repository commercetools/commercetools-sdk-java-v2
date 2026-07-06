
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddCustomerGroupAssignmentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddCustomerGroupAssignmentActionBuilder builder) {
        BusinessUnitAddCustomerGroupAssignmentAction businessUnitAddCustomerGroupAssignmentAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddCustomerGroupAssignmentAction)
                .isInstanceOf(BusinessUnitAddCustomerGroupAssignmentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroupAssignment",
                BusinessUnitAddCustomerGroupAssignmentAction.builder()
                        .customerGroupAssignment(
                            new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        BusinessUnitAddCustomerGroupAssignmentAction value = BusinessUnitAddCustomerGroupAssignmentAction.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
    }
}
