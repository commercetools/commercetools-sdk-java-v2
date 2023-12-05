
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
public class CustomerRemoveAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerRemoveAddressActionBuilder builder) {
        CustomerRemoveAddressAction customerRemoveAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerRemoveAddressAction).isInstanceOf(CustomerRemoveAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerRemoveAddressAction.builder().addressId("addressId") },
                new Object[] { CustomerRemoveAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerRemoveAddressAction value = CustomerRemoveAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerRemoveAddressAction value = CustomerRemoveAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
