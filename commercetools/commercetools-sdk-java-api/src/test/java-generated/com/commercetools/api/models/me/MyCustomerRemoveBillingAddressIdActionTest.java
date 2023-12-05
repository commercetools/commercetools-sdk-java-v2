
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
public class MyCustomerRemoveBillingAddressIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerRemoveBillingAddressIdActionBuilder builder) {
        MyCustomerRemoveBillingAddressIdAction myCustomerRemoveBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerRemoveBillingAddressIdAction)
                .isInstanceOf(MyCustomerRemoveBillingAddressIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyCustomerRemoveBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { MyCustomerRemoveBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerRemoveBillingAddressIdAction value = MyCustomerRemoveBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerRemoveBillingAddressIdAction value = MyCustomerRemoveBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
