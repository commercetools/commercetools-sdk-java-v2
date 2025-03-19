
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
public class CustomerGroupAssignmentsSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupAssignmentsSetMessagePayloadBuilder builder) {
        CustomerGroupAssignmentsSetMessagePayload customerGroupAssignmentsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentsSetMessagePayload)
                .isInstanceOf(CustomerGroupAssignmentsSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupAssignmentsSetMessagePayload.builder()
                .customerGroupAssignments(Collections
                        .singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl())) } };
    }

    @Test
    public void customerGroupAssignments() {
        CustomerGroupAssignmentsSetMessagePayload value = CustomerGroupAssignmentsSetMessagePayload.of();
        value.setCustomerGroupAssignments(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
        Assertions.assertThat(value.getCustomerGroupAssignments())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerGroupAssignmentImpl()));
    }
}
