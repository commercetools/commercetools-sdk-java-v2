
package com.commercetools.api.models.customer;

import java.util.Collections;

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
public class CustomerSetCustomerGroupAssignmentsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetCustomerGroupAssignmentsActionBuilder builder) {
        CustomerSetCustomerGroupAssignmentsAction customerSetCustomerGroupAssignmentsAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomerGroupAssignmentsAction)
                .isInstanceOf(CustomerSetCustomerGroupAssignmentsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetCustomerGroupAssignmentsAction.builder()
                .customerGroupAssignments(Collections.singletonList(
                    new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerSetCustomerGroupAssignmentsAction value = CustomerSetCustomerGroupAssignmentsAction.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentDraftImpl()));
    }
}
