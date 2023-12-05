
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
public class CartSetShippingCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetShippingCustomFieldActionBuilder builder) {
        CartSetShippingCustomFieldAction cartSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingCustomFieldAction).isInstanceOf(CartSetShippingCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { CartSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { CartSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
