
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
public class CustomerRemoveCustomerGroupAssignmentActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerRemoveCustomerGroupAssignmentActionBuilder builder) {
        CustomerRemoveCustomerGroupAssignmentAction customerRemoveCustomerGroupAssignmentAction = builder
                .buildUnchecked();
        Assertions.assertThat(customerRemoveCustomerGroupAssignmentAction)
                .isInstanceOf(CustomerRemoveCustomerGroupAssignmentAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerRemoveCustomerGroupAssignmentAction.builder()
                .customerGroup(
                    new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        CustomerRemoveCustomerGroupAssignmentAction value = CustomerRemoveCustomerGroupAssignmentAction.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
