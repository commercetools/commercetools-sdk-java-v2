
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
public class MyCustomerSigninTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerSigninBuilder builder) {
        MyCustomerSignin myCustomerSignin = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSignin).isInstanceOf(MyCustomerSignin.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerSignin.builder().email("email") },
                new Object[] { MyCustomerSignin.builder().password("password") },
                new Object[] { MyCustomerSignin.builder()
                        .activeCartSignInMode(com.commercetools.api.models.customer.AnonymousCartSignInMode
                                .findEnum("MergeWithExistingCustomerCart")) },
                new Object[] { MyCustomerSignin.builder().updateProductData(true) } };
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
