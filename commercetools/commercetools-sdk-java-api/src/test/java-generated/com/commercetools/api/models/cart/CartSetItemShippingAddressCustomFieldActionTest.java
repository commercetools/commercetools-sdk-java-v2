
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
public class CartSetItemShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetItemShippingAddressCustomFieldActionBuilder builder) {
        CartSetItemShippingAddressCustomFieldAction cartSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(CartSetItemShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { CartSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { CartSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
