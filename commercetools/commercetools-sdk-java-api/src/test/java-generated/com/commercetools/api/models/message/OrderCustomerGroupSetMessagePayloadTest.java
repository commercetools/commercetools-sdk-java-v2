
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerGroupSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerGroupSetMessagePayloadBuilder builder) {
        OrderCustomerGroupSetMessagePayload orderCustomerGroupSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerGroupSetMessagePayload)
                .isInstanceOf(OrderCustomerGroupSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerGroup", OrderCustomerGroupSetMessagePayload.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { "oldCustomerGroup",
                        OrderCustomerGroupSetMessagePayload.builder()
                                .oldCustomerGroup(
                                    new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customerGroup() {
        OrderCustomerGroupSetMessagePayload value = OrderCustomerGroupSetMessagePayload.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerGroupSetMessagePayload value = OrderCustomerGroupSetMessagePayload.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
