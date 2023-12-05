
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
public class CustomerSetDefaultShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetDefaultShippingAddressActionBuilder builder) {
        CustomerSetDefaultShippingAddressAction customerSetDefaultShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDefaultShippingAddressAction)
                .isInstanceOf(CustomerSetDefaultShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { CustomerSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerSetDefaultShippingAddressAction value = CustomerSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerSetDefaultShippingAddressAction value = CustomerSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
