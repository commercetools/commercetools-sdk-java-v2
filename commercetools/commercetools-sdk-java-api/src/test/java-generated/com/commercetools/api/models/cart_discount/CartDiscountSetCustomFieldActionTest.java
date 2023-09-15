
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountSetCustomFieldActionBuilder builder) {
        CartDiscountSetCustomFieldAction cartDiscountSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetCustomFieldAction).isInstanceOf(CartDiscountSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountSetCustomFieldAction.builder().name("name") },
                new Object[] { CartDiscountSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartDiscountSetCustomFieldAction value = CartDiscountSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartDiscountSetCustomFieldAction value = CartDiscountSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
