
package com.commercetools.api.models.order;

import java.util.Collections;

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
public class ShippingInfoImportDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingInfoImportDraftBuilder builder) {
        ShippingInfoImportDraft shippingInfoImportDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingInfoImportDraft).isInstanceOf(ShippingInfoImportDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingInfoImportDraft.builder().shippingMethodName("shippingMethodName") },
                new Object[] {
                        ShippingInfoImportDraft.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] {
                        ShippingInfoImportDraft.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl())) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .discountedPrice(new com.commercetools.api.models.order.DiscountedLineItemPriceDraftImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingMethodState(
                            com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart")) } };
    }

    @Test
    public void shippingMethodName() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void price() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void shippingRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void taxRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }

    @Test
    public void taxCategory() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void shippingMethod() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethod(
            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
    }

    @Test
    public void deliveries() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryDraftImpl()));
    }

    @Test
    public void discountedPrice() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDiscountedPrice(new com.commercetools.api.models.order.DiscountedLineItemPriceDraftImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.api.models.order.DiscountedLineItemPriceDraftImpl());
    }

    @Test
    public void shippingMethodState() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethodState(
            com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart"));
        Assertions.assertThat(value.getShippingMethodState())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMethodState.findEnum("DoesNotMatchCart"));
    }
}
