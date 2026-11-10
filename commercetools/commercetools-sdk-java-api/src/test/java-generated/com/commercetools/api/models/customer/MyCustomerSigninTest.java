
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSigninTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSigninBuilder builder) {
        MyCustomerSignin myCustomerSignin = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSignin).isInstanceOf(MyCustomerSignin.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", MyCustomerSignin.builder().email("email") },
                new Object[] { "password", MyCustomerSignin.builder().password("password") },
                new Object[] { "activeCartSignInMode",
                        MyCustomerSignin.builder()
                                .activeCartSignInMode(com.commercetools.api.models.customer.AnonymousCartSignInMode
                                        .findEnum("MergeWithExistingCustomerCart")) },
                new Object[] { "updateProductData", MyCustomerSignin.builder().updateProductData(true) } };
    }

    @Test
    public void email() {
        MyCustomerSignin value = MyCustomerSignin.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void password() {
        MyCustomerSignin value = MyCustomerSignin.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }

    @Test
    public void activeCartSignInMode() {
        MyCustomerSignin value = MyCustomerSignin.of();
        value.setActiveCartSignInMode(
            com.commercetools.api.models.customer.AnonymousCartSignInMode.findEnum("MergeWithExistingCustomerCart"));
        Assertions.assertThat(value.getActiveCartSignInMode())
                .isEqualTo(com.commercetools.api.models.customer.AnonymousCartSignInMode
                        .findEnum("MergeWithExistingCustomerCart"));
    }

    @Test
    public void updateProductData() {
        MyCustomerSignin value = MyCustomerSignin.of();
        value.setUpdateProductData(true);
        Assertions.assertThat(value.getUpdateProductData()).isEqualTo(true);
    }
}
