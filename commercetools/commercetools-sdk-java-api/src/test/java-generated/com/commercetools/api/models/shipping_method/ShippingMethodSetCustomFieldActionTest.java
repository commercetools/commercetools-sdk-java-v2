
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodSetCustomFieldActionBuilder builder) {
        ShippingMethodSetCustomFieldAction shippingMethodSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetCustomFieldAction)
                .isInstanceOf(ShippingMethodSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodSetCustomFieldAction.builder().name("name") },
                new Object[] { ShippingMethodSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ShippingMethodSetCustomFieldAction value = ShippingMethodSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShippingMethodSetCustomFieldAction value = ShippingMethodSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
