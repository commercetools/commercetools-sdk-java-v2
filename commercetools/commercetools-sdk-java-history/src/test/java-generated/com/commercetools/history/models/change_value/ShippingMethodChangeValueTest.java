
package com.commercetools.history.models.change_value;

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
public class ShippingMethodChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodChangeValueBuilder builder) {
        ShippingMethodChangeValue shippingMethodChangeValue = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeValue).isInstanceOf(ShippingMethodChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodChangeValue.builder().id("id") },
                new Object[] { ShippingMethodChangeValue.builder().name("name") } };
    }

    @Test
    public void id() {
        ShippingMethodChangeValue value = ShippingMethodChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ShippingMethodChangeValue value = ShippingMethodChangeValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
