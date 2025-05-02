
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerGroupSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerGroupSetMessageBuilder builder) {
        OrderCustomerGroupSetMessage orderCustomerGroupSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerGroupSetMessage).isInstanceOf(OrderCustomerGroupSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerGroup", OrderCustomerGroupSetMessage.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "oldCustomerGroup",
                        OrderCustomerGroupSetMessage.builder()
                                .oldCustomerGroup(
                                    new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customerGroup() {
        OrderCustomerGroupSetMessage value = OrderCustomerGroupSetMessage.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerGroupSetMessage value = OrderCustomerGroupSetMessage.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
