
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderBillingAddressSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderBillingAddressSetMessageBuilder builder) {
        OrderBillingAddressSetMessage orderBillingAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderBillingAddressSetMessage).isInstanceOf(OrderBillingAddressSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        OrderBillingAddressSetMessage.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "oldAddress", OrderBillingAddressSetMessage.builder()
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
