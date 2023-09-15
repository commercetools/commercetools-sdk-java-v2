
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
public class MyBusinessUnitSetDefaultBillingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitSetDefaultBillingAddressActionBuilder builder) {
        MyBusinessUnitSetDefaultBillingAddressAction myBusinessUnitSetDefaultBillingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetDefaultBillingAddressAction)
                .isInstanceOf(MyBusinessUnitSetDefaultBillingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyBusinessUnitSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { MyBusinessUnitSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetDefaultBillingAddressAction value = MyBusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitSetDefaultBillingAddressAction value = MyBusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
