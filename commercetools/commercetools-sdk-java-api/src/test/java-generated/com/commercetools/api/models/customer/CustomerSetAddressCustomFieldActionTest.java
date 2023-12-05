
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
public class CustomerSetAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetAddressCustomFieldActionBuilder builder) {
        CustomerSetAddressCustomFieldAction customerSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetAddressCustomFieldAction)
                .isInstanceOf(CustomerSetAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { CustomerSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { CustomerSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
