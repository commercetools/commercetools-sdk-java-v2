
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddLineItemActionBuilder builder) {
        CartAddLineItemAction cartAddLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddLineItemAction).isInstanceOf(CartAddLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CartAddLineItemAction.builder().key("key") },
                new Object[] { "productId", CartAddLineItemAction.builder().productId("productId") },
                new Object[] { "variantId", CartAddLineItemAction.builder().variantId(5L) },
                new Object[] { "sku", CartAddLineItemAction.builder().sku("sku") },
                new Object[] { "quantity", CartAddLineItemAction.builder().quantity(8L) },
                new Object[] { "addedAt",
                        CartAddLineItemAction.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "distributionChannel",
                        CartAddLineItemAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "supplyChannel", CartAddLineItemAction.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "externalPrice",
                        CartAddLineItemAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", CartAddLineItemAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { "externalTaxRate",
                        CartAddLineItemAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "perMethodExternalTaxRate",
                        CartAddLineItemAction.builder()
                                .perMethodExternalTaxRate(Collections.singletonList(
                                    new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl())) },
                new Object[] { "inventoryMode",
                        CartAddLineItemAction.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "shippingDetails", CartAddLineItemAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "custom", CartAddLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productId() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantity() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void distributionChannel() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void supplyChannel() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void externalPrice() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void externalTaxRate() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void perMethodExternalTaxRate() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setPerMethodExternalTaxRate(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl()));
        Assertions.assertThat(value.getPerMethodExternalTaxRate())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.MethodExternalTaxRateDraftImpl()));
    }

    @Test
    public void inventoryMode() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void shippingDetails() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void custom() {
        CartAddLineItemAction value = CartAddLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
