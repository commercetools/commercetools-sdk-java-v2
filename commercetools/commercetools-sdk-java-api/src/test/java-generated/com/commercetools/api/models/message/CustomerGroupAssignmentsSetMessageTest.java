
package com.commercetools.api.models.message;

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
public class CustomerGroupAssignmentsSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupAssignmentsSetMessageBuilder builder) {
        CustomerGroupAssignmentsSetMessage customerGroupAssignmentsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentsSetMessage)
                .isInstanceOf(CustomerGroupAssignmentsSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupAssignmentsSetMessage.builder()
                .customerGroupAssignments(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerGroupAssignmentsSetMessage value = CustomerGroupAssignmentsSetMessage.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
