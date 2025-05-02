
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemDraftBuilder builder) {
        LineItemDraft lineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(lineItemDraft).isInstanceOf(LineItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", LineItemDraft.builder().key("key") },
                new Object[] { "productId", LineItemDraft.builder().productId("productId") },
                new Object[] { "variantId", LineItemDraft.builder().variantId(5L) },
                new Object[] { "sku", LineItemDraft.builder().sku("sku") },
                new Object[] { "quantity", LineItemDraft.builder().quantity(8L) },
                new Object[] { "addedAt", LineItemDraft.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "distributionChannel",
                        LineItemDraft.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "supplyChannel", LineItemDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "externalPrice",
                        LineItemDraft.builder().externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", LineItemDraft.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { "externalTaxRate",
                        LineItemDraft.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "perMethodExternalTaxRate",
                        LineItemDraft.builder()
                                .perMethodExternalTaxRate(Collections.singletonList(
                                    new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl())) },
                new Object[] { "inventoryMode",
                        LineItemDraft.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "shippingDetails", LineItemDraft.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "custom", LineItemDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        LineItemDraft value = LineItemDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productId() {
        LineItemDraft value = LineItemDraft.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        LineItemDraft value = LineItemDraft.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        LineItemDraft value = LineItemDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantity() {
        LineItemDraft value = LineItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        LineItemDraft value = LineItemDraft.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void distributionChannel() {
        LineItemDraft value = LineItemDraft.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void supplyChannel() {
        LineItemDraft value = LineItemDraft.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void externalPrice() {
        LineItemDraft value = LineItemDraft.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        LineItemDraft value = LineItemDraft.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void externalTaxRate() {
        LineItemDraft value = LineItemDraft.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void perMethodExternalTaxRate() {
        LineItemDraft value = LineItemDraft.of();
        value.setPerMethodExternalTaxRate(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl()));
        Assertions.assertThat(value.getPerMethodExternalTaxRate())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl()));
    }

    @Test
    public void inventoryMode() {
        LineItemDraft value = LineItemDraft.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void shippingDetails() {
        LineItemDraft value = LineItemDraft.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void custom() {
        LineItemDraft value = LineItemDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
