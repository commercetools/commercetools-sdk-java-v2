
package com.commercetools.api.models.message;

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
public class OrderShippingAddressSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderShippingAddressSetMessageBuilder builder) {
        OrderShippingAddressSetMessage orderShippingAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderShippingAddressSetMessage).isInstanceOf(OrderShippingAddressSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderShippingAddressSetMessage.builder()
                        .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { OrderShippingAddressSetMessage.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        OrderShippingAddressSetMessage value = OrderShippingAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        OrderShippingAddressSetMessage value = OrderShippingAddressSetMessage.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
