
package com.commercetools.api.models.customer;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CustomerAddCustomerGroupAssignmentActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddCustomerGroupAssignmentActionBuilder builder) {
        CustomerAddCustomerGroupAssignmentAction customerAddCustomerGroupAssignmentAction = builder.buildUnchecked();
        Assertions.assertThat(customerAddCustomerGroupAssignmentAction)
                .isInstanceOf(CustomerAddCustomerGroupAssignmentAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddCustomerGroupAssignmentAction.builder()
                .customerGroupAssignment(
                    new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        CustomerAddCustomerGroupAssignmentAction value = CustomerAddCustomerGroupAssignmentAction.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl());
    }
}
