
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSignInResultTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSignInResultBuilder builder) {
        CustomerSignInResult customerSignInResult = builder.buildUnchecked();
        Assertions.assertThat(customerSignInResult).isInstanceOf(CustomerSignInResult.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        CustomerSignInResult.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerImpl()) },
                new Object[] { "cart",
                        CustomerSignInResult.builder().cart(new com.commercetools.api.models.cart.CartImpl()) } };
    }

    @Test
    public void customer() {
        CustomerSignInResult value = CustomerSignInResult.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }

    @Test
    public void cart() {
        CustomerSignInResult value = CustomerSignInResult.of();
        value.setCart(new com.commercetools.api.models.cart.CartImpl());
        Assertions.assertThat(value.getCart()).isEqualTo(new com.commercetools.api.models.cart.CartImpl());
    }
}
