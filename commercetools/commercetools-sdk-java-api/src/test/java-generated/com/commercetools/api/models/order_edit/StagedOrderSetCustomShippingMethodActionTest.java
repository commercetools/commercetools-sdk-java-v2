
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetCustomShippingMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetCustomShippingMethodActionBuilder builder) {
        StagedOrderSetCustomShippingMethodAction stagedOrderSetCustomShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomShippingMethodAction)
                .isInstanceOf(StagedOrderSetCustomShippingMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderSetCustomShippingMethodAction.builder().shippingMethodName("shippingMethodName") },
                new Object[] { StagedOrderSetCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { StagedOrderSetCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetCustomShippingMethodAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingMethodName() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingRate() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void taxCategory() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
