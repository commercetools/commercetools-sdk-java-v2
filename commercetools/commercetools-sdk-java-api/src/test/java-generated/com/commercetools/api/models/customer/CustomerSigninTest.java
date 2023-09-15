
package com.commercetools.api.models.customer;

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
public class CustomerSigninTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSigninBuilder builder) {
        CustomerSignin customerSignin = builder.buildUnchecked();
        Assertions.assertThat(customerSignin).isInstanceOf(CustomerSignin.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSignin.builder().email("email") },
                new Object[] { CustomerSignin.builder().password("password") },
                new Object[] { CustomerSignin.builder().anonymousCartId("anonymousCartId") },
                new Object[] { CustomerSignin.builder()
                        .anonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { CustomerSignin.builder()
                        .anonymousCartSignInMode(com.commercetools.api.models.customer.AnonymousCartSignInMode
                                .findEnum("MergeWithExistingCustomerCart")) },
                new Object[] { CustomerSignin.builder().anonymousId("anonymousId") },
                new Object[] { CustomerSignin.builder().updateProductData(true) } };
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
