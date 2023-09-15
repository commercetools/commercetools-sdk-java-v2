
package com.commercetools.importapi.models.orders;

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
                new Object[] { ShippingInfoImportDraft.builder()
                        .price(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingRate(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .taxRate(new com.commercetools.importapi.models.prices.TaxRateImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingMethod(
                            new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl()) },
                new Object[] {
                        ShippingInfoImportDraft.builder()
                                .deliveries(Collections
                                        .singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl())) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .discountedPrice(
                            new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl()) },
                new Object[] { ShippingInfoImportDraft.builder()
                        .shippingMethodState(com.commercetools.importapi.models.orders.ShippingMethodState
                                .findEnum("DoesNotMatchCart")) } };
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
        value.setPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getPrice())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void shippingRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingRate(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.importapi.models.orders.ShippingRateDraftImpl());
    }

    @Test
    public void taxRate() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxRate(new com.commercetools.importapi.models.prices.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.importapi.models.prices.TaxRateImpl());
    }

    @Test
    public void taxCategory() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setTaxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
    }

    @Test
    public void shippingMethod() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethod(new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl());
    }

    @Test
    public void deliveries() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDeliveries(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl()));
        Assertions.assertThat(value.getDeliveries())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryImpl()));
    }

    @Test
    public void discountedPrice() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setDiscountedPrice(new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl());
        Assertions.assertThat(value.getDiscountedPrice())
                .isEqualTo(new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl());
    }

    @Test
    public void shippingMethodState() {
        ShippingInfoImportDraft value = ShippingInfoImportDraft.of();
        value.setShippingMethodState(
            com.commercetools.importapi.models.orders.ShippingMethodState.findEnum("DoesNotMatchCart"));
        Assertions.assertThat(value.getShippingMethodState())
                .isEqualTo(com.commercetools.importapi.models.orders.ShippingMethodState.findEnum("DoesNotMatchCart"));
    }
}
