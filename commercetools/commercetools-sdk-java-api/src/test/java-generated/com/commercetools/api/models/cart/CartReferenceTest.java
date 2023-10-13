
package com.commercetools.api.models.cart;

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
public class CartReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartReferenceBuilder builder) {
        CartReference cartReference = builder.buildUnchecked();
        Assertions.assertThat(cartReference).isInstanceOf(CartReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartReference.builder().obj(new com.commercetools.api.models.cart.CartImpl()) },
                new Object[] { CartReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CartReference value = CartReference.of();
        value.setObj(new com.commercetools.api.models.cart.CartImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.cart.CartImpl());
    }

    @Test
    public void id() {
        CartReference value = CartReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
