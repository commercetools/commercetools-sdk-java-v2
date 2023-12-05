
package com.commercetools.api.models.me;

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
public class MyCustomerAddBillingAddressIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerAddBillingAddressIdActionBuilder builder) {
        MyCustomerAddBillingAddressIdAction myCustomerAddBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerAddBillingAddressIdAction)
                .isInstanceOf(MyCustomerAddBillingAddressIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerAddBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { MyCustomerAddBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerAddBillingAddressIdAction value = MyCustomerAddBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerAddBillingAddressIdAction value = MyCustomerAddBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
