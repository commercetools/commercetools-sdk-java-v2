
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSigninTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSigninBuilder builder) {
        CustomerSignin customerSignin = builder.buildUnchecked();
        Assertions.assertThat(customerSignin).isInstanceOf(CustomerSignin.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerSignin.builder().email("email") },
                new Object[] { "password", CustomerSignin.builder().password("password") },
                new Object[] { "anonymousCartId", CustomerSignin.builder().anonymousCartId("anonymousCartId") },
                new Object[] { "anonymousCart",
                        CustomerSignin.builder()
                                .anonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { "anonymousCartSignInMode",
                        CustomerSignin.builder()
                                .anonymousCartSignInMode(com.commercetools.api.models.customer.AnonymousCartSignInMode
                                        .findEnum("MergeWithExistingCustomerCart")) },
                new Object[] { "anonymousId", CustomerSignin.builder().anonymousId("anonymousId") },
                new Object[] { "updateProductData", CustomerSignin.builder().updateProductData(true) } };
    }

    @Test
    public void email() {
        CustomerSignin value = CustomerSignin.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        CustomerSignin value = CustomerSignin.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void anonymousCartId() {
        CustomerSignin value = CustomerSignin.of();
        value.setAnonymousCartId("anonymousCartId");
        Assertions.assertThat(value.getAnonymousCartId()).isEqualTo("anonymousCartId");
    }

    @Test
    public void anonymousCart() {
        CustomerSignin value = CustomerSignin.of();
        value.setAnonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getAnonymousCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void anonymousCartSignInMode() {
        CustomerSignin value = CustomerSignin.of();
        value.setAnonymousCartSignInMode(
            com.commercetools.api.models.customer.AnonymousCartSignInMode.findEnum("MergeWithExistingCustomerCart"));
        Assertions.assertThat(value.getAnonymousCartSignInMode())
                .isEqualTo(com.commercetools.api.models.customer.AnonymousCartSignInMode
                        .findEnum("MergeWithExistingCustomerCart"));
    }

    @Test
    public void anonymousId() {
        CustomerSignin value = CustomerSignin.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void updateProductData() {
        CustomerSignin value = CustomerSignin.of();
        value.setUpdateProductData(true);
        Assertions.assertThat(value.getUpdateProductData()).isEqualTo(true);
    }
}
