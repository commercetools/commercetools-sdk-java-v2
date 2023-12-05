
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
public class CustomerSetMiddleNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetMiddleNameActionBuilder builder) {
        CustomerSetMiddleNameAction customerSetMiddleNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetMiddleNameAction).isInstanceOf(CustomerSetMiddleNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetMiddleNameAction.builder().middleName("middleName") } };
    }

    @Test
    public void middleName() {
        CustomerSetMiddleNameAction value = CustomerSetMiddleNameAction.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }
}
