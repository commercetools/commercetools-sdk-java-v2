
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
public class LineItemImportDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemImportDraftBuilder builder) {
        LineItemImportDraft lineItemImportDraft = builder.buildUnchecked();
        Assertions.assertThat(lineItemImportDraft).isInstanceOf(LineItemImportDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { LineItemImportDraft.builder()
                        .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .variant(
                            new com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .price(new com.commercetools.importapi.models.orders.LineItemPriceImpl()) },
                new Object[] { LineItemImportDraft.builder().quantity(8L) },
                new Object[] {
                        LineItemImportDraft.builder()
                                .state(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.ItemStateImpl())) },
                new Object[] { LineItemImportDraft.builder()
                        .supplyChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .distributionChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .taxRate(new com.commercetools.importapi.models.prices.TaxRateImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .shippingDetails(
                            new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl()) },
                new Object[] { LineItemImportDraft.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void product() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }

    @Test
    public void name() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setVariant(new com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftImpl());
    }

    @Test
    public void price() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setPrice(new com.commercetools.importapi.models.orders.LineItemPriceImpl());
        Assertions.assertThat(value.getPrice())
                .isEqualTo(new com.commercetools.importapi.models.orders.LineItemPriceImpl());
    }

    @Test
    public void quantity() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void state() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setState(Collections.singletonList(new com.commercetools.importapi.models.orders.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.ItemStateImpl()));
    }

    @Test
    public void supplyChannel() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setSupplyChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void distributionChannel() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setDistributionChannel(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.importapi.models.common.ChannelKeyReferenceImpl());
    }

    @Test
    public void taxRate() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setTaxRate(new com.commercetools.importapi.models.prices.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.importapi.models.prices.TaxRateImpl());
    }

    @Test
    public void shippingDetails() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setShippingDetails(new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void custom() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
