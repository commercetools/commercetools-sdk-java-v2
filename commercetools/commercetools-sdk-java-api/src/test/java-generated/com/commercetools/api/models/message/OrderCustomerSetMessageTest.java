
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerSetMessageBuilder builder) {
        OrderCustomerSetMessage orderCustomerSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerSetMessage).isInstanceOf(OrderCustomerSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        OrderCustomerSetMessage.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "customerGroup", OrderCustomerSetMessage.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "oldCustomer",
                        OrderCustomerSetMessage.builder()
                                .oldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "oldCustomerGroup",
                        OrderCustomerSetMessage.builder()
                                .oldCustomerGroup(
                                    new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customer() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerGroup() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomer() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setOldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getOldCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
