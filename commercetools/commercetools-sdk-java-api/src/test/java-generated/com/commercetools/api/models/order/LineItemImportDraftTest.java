
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemImportDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemImportDraftBuilder builder) {
        LineItemImportDraft lineItemImportDraft = builder.buildUnchecked();
        Assertions.assertThat(lineItemImportDraft).isInstanceOf(LineItemImportDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        LineItemImportDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", LineItemImportDraft.builder().key("key") },
                new Object[] { "variant",
                        LineItemImportDraft.builder()
                                .variant(new com.commercetools.api.models.order.ProductVariantImportDraftImpl()) },
                new Object[] { "productId", LineItemImportDraft.builder().productId("productId") },
                new Object[] { "quantity", LineItemImportDraft.builder().quantity(8L) },
                new Object[] { "price",
                        LineItemImportDraft.builder().price(new com.commercetools.api.models.common.PriceDraftImpl()) },
                new Object[] { "taxRate",
                        LineItemImportDraft.builder()
                                .taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) },
                new Object[] { "distributionChannel",
                        LineItemImportDraft.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "supplyChannel", LineItemImportDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "inventoryMode",
                        LineItemImportDraft.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "shippingDetails", LineItemImportDraft.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "state",
                        LineItemImportDraft.builder()
                                .state(Collections
                                        .singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { "custom", LineItemImportDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void variant() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setVariant(new com.commercetools.api.models.order.ProductVariantImportDraftImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.order.ProductVariantImportDraftImpl());
    }

    @Test
    public void productId() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void quantity() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void price() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setPrice(new com.commercetools.api.models.common.PriceDraftImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceDraftImpl());
    }

    @Test
    public void taxRate() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }

    @Test
    public void distributionChannel() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void supplyChannel() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void inventoryMode() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void shippingDetails() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void state() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }

    @Test
    public void custom() {
        LineItemImportDraft value = LineItemImportDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
