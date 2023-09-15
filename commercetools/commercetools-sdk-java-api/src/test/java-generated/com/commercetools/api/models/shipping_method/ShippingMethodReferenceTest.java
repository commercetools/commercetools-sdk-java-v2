
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
public class ShippingMethodReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodReferenceBuilder builder) {
        ShippingMethodReference shippingMethodReference = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodReference).isInstanceOf(ShippingMethodReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingMethodReference.builder()
                        .obj(new com.commercetools.api.models.shipping_method.ShippingMethodImpl()) },
                new Object[] { ShippingMethodReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ShippingMethodReference value = ShippingMethodReference.of();
        value.setObj(new com.commercetools.api.models.shipping_method.ShippingMethodImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodImpl());
    }

    @Test
    public void id() {
        ShippingMethodReference value = ShippingMethodReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
