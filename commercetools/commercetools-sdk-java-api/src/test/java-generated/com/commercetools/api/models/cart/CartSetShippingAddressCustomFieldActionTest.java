
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
public class CartSetShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetShippingAddressCustomFieldActionBuilder builder) {
        CartSetShippingAddressCustomFieldAction cartSetShippingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingAddressCustomFieldAction)
                .isInstanceOf(CartSetShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { CartSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartSetShippingAddressCustomFieldAction value = CartSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetShippingAddressCustomFieldAction value = CartSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
