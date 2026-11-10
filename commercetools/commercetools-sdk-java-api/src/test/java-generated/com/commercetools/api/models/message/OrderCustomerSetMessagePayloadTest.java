
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerSetMessagePayloadBuilder builder) {
        OrderCustomerSetMessagePayload orderCustomerSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerSetMessagePayload).isInstanceOf(OrderCustomerSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        OrderCustomerSetMessagePayload.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "customerGroup", OrderCustomerSetMessagePayload.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "oldCustomer",
                        OrderCustomerSetMessagePayload.builder()
                                .oldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "oldCustomerGroup",
                        OrderCustomerSetMessagePayload.builder()
                                .oldCustomerGroup(
                                    new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customer() {
        OrderCustomerSetMessagePayload value = OrderCustomerSetMessagePayload.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerGroup() {
        OrderCustomerSetMessagePayload value = OrderCustomerSetMessagePayload.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomer() {
        OrderCustomerSetMessagePayload value = OrderCustomerSetMessagePayload.of();
        value.setOldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getOldCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerSetMessagePayload value = OrderCustomerSetMessagePayload.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
