
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
public class CustomLineItemDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomLineItemDraftBuilder builder) {
        CustomLineItemDraft customLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(customLineItemDraft).isInstanceOf(CustomLineItemDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomLineItemDraft.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .money(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .taxedPrice(new com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .totalPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { CustomLineItemDraft.builder().slug("slug") },
                new Object[] { CustomLineItemDraft.builder().quantity(8L) },
                new Object[] {
                        CustomLineItemDraft.builder()
                                .state(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.ItemStateImpl())) },
                new Object[] { CustomLineItemDraft.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .taxRate(new com.commercetools.importapi.models.prices.TaxRateImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .externalTaxRate(new com.commercetools.importapi.models.orders.ExternalTaxRateDraftImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl())) },
                new Object[] { CustomLineItemDraft.builder()
                        .shippingDetails(
                            new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void name() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void money() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setMoney(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getMoney())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setTaxedPrice(new com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceImpl());
    }

    @Test
    public void totalPrice() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setTotalPrice(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void slug() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void quantity() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void state() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setState(Collections.singletonList(new com.commercetools.importapi.models.orders.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.ItemStateImpl()));
    }

    @Test
    public void taxCategory() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setTaxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
    }

    @Test
    public void taxRate() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setTaxRate(new com.commercetools.importapi.models.prices.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.importapi.models.prices.TaxRateImpl());
    }

    @Test
    public void externalTaxRate() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setExternalTaxRate(new com.commercetools.importapi.models.orders.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.importapi.models.orders.ExternalTaxRateDraftImpl());
    }

    @Test
    public void discountedPricePerQuantity() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setDiscountedPricePerQuantity(Collections
                .singletonList(new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl()));
    }

    @Test
    public void shippingDetails() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setShippingDetails(new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl());
    }
}
