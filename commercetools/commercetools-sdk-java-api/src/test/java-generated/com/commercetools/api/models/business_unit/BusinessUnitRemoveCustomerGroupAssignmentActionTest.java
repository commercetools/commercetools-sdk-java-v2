
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveCustomerGroupAssignmentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveCustomerGroupAssignmentActionBuilder builder) {
        BusinessUnitRemoveCustomerGroupAssignmentAction businessUnitRemoveCustomerGroupAssignmentAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitRemoveCustomerGroupAssignmentAction)
                .isInstanceOf(BusinessUnitRemoveCustomerGroupAssignmentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup",
                BusinessUnitRemoveCustomerGroupAssignmentAction.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        BusinessUnitRemoveCustomerGroupAssignmentAction value = BusinessUnitRemoveCustomerGroupAssignmentAction.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
