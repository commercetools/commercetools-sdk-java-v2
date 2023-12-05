
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
public class OrderBillingAddressSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderBillingAddressSetMessageBuilder builder) {
        OrderBillingAddressSetMessage orderBillingAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderBillingAddressSetMessage).isInstanceOf(OrderBillingAddressSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderBillingAddressSetMessage.builder()
                        .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { OrderBillingAddressSetMessage.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        OrderBillingAddressSetMessage value = OrderBillingAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        OrderBillingAddressSetMessage value = OrderBillingAddressSetMessage.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
