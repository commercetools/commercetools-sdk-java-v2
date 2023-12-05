
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
public class MyCartUpdateItemShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartUpdateItemShippingAddressActionBuilder builder) {
        MyCartUpdateItemShippingAddressAction myCartUpdateItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCartUpdateItemShippingAddressAction)
                .isInstanceOf(MyCartUpdateItemShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartUpdateItemShippingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        MyCartUpdateItemShippingAddressAction value = MyCartUpdateItemShippingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
