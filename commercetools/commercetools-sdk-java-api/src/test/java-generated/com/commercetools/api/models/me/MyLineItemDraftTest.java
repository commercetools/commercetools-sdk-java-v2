
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyLineItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyLineItemDraftBuilder builder) {
        MyLineItemDraft myLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(myLineItemDraft).isInstanceOf(MyLineItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", MyLineItemDraft.builder().key("key") },
                new Object[] { "productId", MyLineItemDraft.builder().productId("productId") },
                new Object[] { "variantId", MyLineItemDraft.builder().variantId(5L) },
                new Object[] { "sku", MyLineItemDraft.builder().sku("sku") },
                new Object[] { "quantity", MyLineItemDraft.builder().quantity(8L) },
                new Object[] { "addedAt", MyLineItemDraft.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "supplyChannel", MyLineItemDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "distributionChannel",
                        MyLineItemDraft.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "shippingDetails", MyLineItemDraft.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "custom", MyLineItemDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productId() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void quantity() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void addedAt() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void supplyChannel() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void distributionChannel() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void shippingDetails() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void custom() {
        MyLineItemDraft value = MyLineItemDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
