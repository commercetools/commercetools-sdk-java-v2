
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
public class CustomerSetCustomerNumberActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetCustomerNumberActionBuilder builder) {
        CustomerSetCustomerNumberAction customerSetCustomerNumberAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomerNumberAction).isInstanceOf(CustomerSetCustomerNumberAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSetCustomerNumberAction.builder().customerNumber("customerNumber") } };
    }

    @Test
    public void customerNumber() {
        CustomerSetCustomerNumberAction value = CustomerSetCustomerNumberAction.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }
}
