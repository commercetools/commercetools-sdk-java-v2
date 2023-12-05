
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
public class MethodTaxedPriceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MethodTaxedPriceBuilder builder) {
        MethodTaxedPrice methodTaxedPrice = builder.buildUnchecked();
        Assertions.assertThat(methodTaxedPrice).isInstanceOf(MethodTaxedPrice.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MethodTaxedPrice.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { MethodTaxedPrice.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) } };
    }

    @Test
    public void shippingMethodKey() {
        MethodTaxedPrice value = MethodTaxedPrice.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }

    @Test
    public void taxedPrice() {
        MethodTaxedPrice value = MethodTaxedPrice.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }
}
