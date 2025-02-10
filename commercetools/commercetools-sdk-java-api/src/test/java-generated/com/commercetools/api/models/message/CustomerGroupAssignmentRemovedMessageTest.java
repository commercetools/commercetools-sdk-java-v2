
package com.commercetools.api.models.message;

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
public class CustomerGroupAssignmentRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupAssignmentRemovedMessageBuilder builder) {
        CustomerGroupAssignmentRemovedMessage customerGroupAssignmentRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentRemovedMessage)
                .isInstanceOf(CustomerGroupAssignmentRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupAssignmentRemovedMessage.builder()
                .customerGroupAssignment(
                    new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customerGroupAssignment() {
        CustomerGroupAssignmentRemovedMessage value = CustomerGroupAssignmentRemovedMessage.of();
        value.setCustomerGroupAssignment(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroupAssignment())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
