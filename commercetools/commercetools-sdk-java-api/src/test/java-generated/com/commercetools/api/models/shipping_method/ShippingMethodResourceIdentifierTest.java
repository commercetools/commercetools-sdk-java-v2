
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
public class ShippingMethodResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodResourceIdentifierBuilder builder) {
        ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodResourceIdentifier).isInstanceOf(ShippingMethodResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodResourceIdentifier.builder().id("id") },
                new Object[] { ShippingMethodResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ShippingMethodResourceIdentifier value = ShippingMethodResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ShippingMethodResourceIdentifier value = ShippingMethodResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
