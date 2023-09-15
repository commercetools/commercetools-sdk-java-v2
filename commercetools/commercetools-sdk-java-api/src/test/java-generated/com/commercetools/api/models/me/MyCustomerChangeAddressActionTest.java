
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
public class MyCustomerChangeAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerChangeAddressActionBuilder builder) {
        MyCustomerChangeAddressAction myCustomerChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerChangeAddressAction).isInstanceOf(MyCustomerChangeAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerChangeAddressAction.builder().addressId("addressId") },
                new Object[] { MyCustomerChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { MyCustomerChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
