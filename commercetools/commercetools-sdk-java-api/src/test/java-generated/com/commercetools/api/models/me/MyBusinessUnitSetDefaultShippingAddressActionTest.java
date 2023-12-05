
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
public class MyBusinessUnitSetDefaultShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitSetDefaultShippingAddressActionBuilder builder) {
        MyBusinessUnitSetDefaultShippingAddressAction myBusinessUnitSetDefaultShippingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetDefaultShippingAddressAction)
                .isInstanceOf(MyBusinessUnitSetDefaultShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyBusinessUnitSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { MyBusinessUnitSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetDefaultShippingAddressAction value = MyBusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitSetDefaultShippingAddressAction value = MyBusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
