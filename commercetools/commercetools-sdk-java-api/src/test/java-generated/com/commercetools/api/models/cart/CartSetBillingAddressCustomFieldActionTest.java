
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
public class CartSetBillingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetBillingAddressCustomFieldActionBuilder builder) {
        CartSetBillingAddressCustomFieldAction cartSetBillingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetBillingAddressCustomFieldAction)
                .isInstanceOf(CartSetBillingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetBillingAddressCustomFieldAction.builder().name("name") },
                new Object[] { CartSetBillingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartSetBillingAddressCustomFieldAction value = CartSetBillingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetBillingAddressCustomFieldAction value = CartSetBillingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
