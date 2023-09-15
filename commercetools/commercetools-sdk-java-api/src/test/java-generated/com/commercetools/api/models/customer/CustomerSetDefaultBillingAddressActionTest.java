
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
public class CustomerSetDefaultBillingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetDefaultBillingAddressActionBuilder builder) {
        CustomerSetDefaultBillingAddressAction customerSetDefaultBillingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDefaultBillingAddressAction)
                .isInstanceOf(CustomerSetDefaultBillingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { CustomerSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerSetDefaultBillingAddressAction value = CustomerSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerSetDefaultBillingAddressAction value = CustomerSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
