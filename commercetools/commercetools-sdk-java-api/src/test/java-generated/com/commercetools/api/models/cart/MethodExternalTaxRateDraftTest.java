
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
public class MethodExternalTaxRateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MethodExternalTaxRateDraftBuilder builder) {
        MethodExternalTaxRateDraft methodExternalTaxRateDraft = builder.buildUnchecked();
        Assertions.assertThat(methodExternalTaxRateDraft).isInstanceOf(MethodExternalTaxRateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MethodExternalTaxRateDraft.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { MethodExternalTaxRateDraft.builder()
                        .taxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingMethodKey() {
        MethodExternalTaxRateDraft value = MethodExternalTaxRateDraft.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }

    @Test
    public void taxRate() {
        MethodExternalTaxRateDraft value = MethodExternalTaxRateDraft.of();
        value.setTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
