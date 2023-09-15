
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
public class CustomerSignInResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSignInResultBuilder builder) {
        CustomerSignInResult customerSignInResult = builder.buildUnchecked();
        Assertions.assertThat(customerSignInResult).isInstanceOf(CustomerSignInResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSignInResult.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerImpl()) },
                new Object[] {
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
