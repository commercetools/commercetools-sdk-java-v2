
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
public class MyBusinessUnitChangeAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitChangeAddressActionBuilder builder) {
        MyBusinessUnitChangeAddressAction myBusinessUnitChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeAddressAction).isInstanceOf(MyBusinessUnitChangeAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitChangeAddressAction.builder().addressId("addressId") },
                new Object[] { MyBusinessUnitChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { MyBusinessUnitChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
