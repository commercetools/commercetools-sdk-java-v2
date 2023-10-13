
package com.commercetools.api.models.cart;

import java.util.Collections;

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
public class CartUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartUpdateBuilder builder) {
        CartUpdate cartUpdate = builder.buildUnchecked();
        Assertions.assertThat(cartUpdate).isInstanceOf(CartUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartUpdate.builder().version(2L) }, new Object[] { CartUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CartUpdate value = CartUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CartUpdate value = CartUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl()));
    }
}
