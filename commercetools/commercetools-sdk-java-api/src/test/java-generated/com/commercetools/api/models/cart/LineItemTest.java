
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemBuilder builder) {
        LineItem lineItem = builder.buildUnchecked();
        Assertions.assertThat(lineItem).isInstanceOf(LineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", LineItem.builder().id("id") },
                new Object[] { "key", LineItem.builder().key("key") },
                new Object[] { "productId", LineItem.builder().productId("productId") },
                new Object[] { "productKey", LineItem.builder().productKey("productKey") },
                new Object[] { "name",
                        LineItem.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "productSlug",
                        LineItem.builder().productSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "productType", LineItem.builder()
                        .productType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl()) },
                new Object[] { "variant",
                        LineItem.builder().variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "price", LineItem.builder().price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "quantity", LineItem.builder().quantity(8L) },
                new Object[] { "totalPrice",
                        LineItem.builder()
                                .totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "discountedPricePerQuantity",
                        LineItem.builder()
                                .discountedPricePerQuantity(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "taxedPrice",
                        LineItem.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { "taxedPricePortions",
                        LineItem.builder()
                                .taxedPricePortions(Collections
                                        .singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl())) },
                new Object[] { "state",
                        LineItem.builder()
                                .state(Collections
                                        .singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { "taxRate",
                        LineItem.builder().taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) },
                new Object[] { "perMethodTaxRate",
                        LineItem.builder()
                                .perMethodTaxRate(Collections
                                        .singletonList(new com.commercetools.api.models.cart.MethodTaxRateImpl())) },
                new Object[] { "supplyChannel",
                        LineItem.builder()
                                .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { "distributionChannel",
                        LineItem.builder()
                                .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { "priceMode",
                        LineItem.builder()
                                .priceMode(com.commercetools.api.models.cart.LineItemPriceMode.findEnum("Platform")) },
                new Object[] { "lineItemMode",
                        LineItem.builder()
                                .lineItemMode(com.commercetools.api.models.cart.LineItemMode.findEnum("Standard")) },
                new Object[] { "inventoryMode",
                        LineItem.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "shippingDetails",
                        LineItem.builder()
                                .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsImpl()) },
                new Object[] { "custom",
                        LineItem.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "addedAt", LineItem.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        LineItem.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        LineItem value = LineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        LineItem value = LineItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void productId() {
        LineItem value = LineItem.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void productKey() {
        LineItem value = LineItem.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void name() {
        LineItem value = LineItem.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void productSlug() {
        LineItem value = LineItem.of();
        value.setProductSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getProductSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void productType() {
        LineItem value = LineItem.of();
        value.setProductType(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeReferenceImpl());
    }

    @Test
    public void variant() {
        LineItem value = LineItem.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void price() {
        LineItem value = LineItem.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void quantity() {
        LineItem value = LineItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void totalPrice() {
        LineItem value = LineItem.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void discountedPricePerQuantity() {
        LineItem value = LineItem.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void taxedPrice() {
        LineItem value = LineItem.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        LineItem value = LineItem.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
    }

    @Test
    public void state() {
        LineItem value = LineItem.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }

    @Test
    public void taxRate() {
        LineItem value = LineItem.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }

    @Test
    public void perMethodTaxRate() {
        LineItem value = LineItem.of();
        value.setPerMethodTaxRate(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxRateImpl()));
        Assertions.assertThat(value.getPerMethodTaxRate())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxRateImpl()));
    }

    @Test
    public void supplyChannel() {
        LineItem value = LineItem.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void distributionChannel() {
        LineItem value = LineItem.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void priceMode() {
        LineItem value = LineItem.of();
        value.setPriceMode(com.commercetools.api.models.cart.LineItemPriceMode.findEnum("Platform"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.cart.LineItemPriceMode.findEnum("Platform"));
    }

    @Test
    public void lineItemMode() {
        LineItem value = LineItem.of();
        value.setLineItemMode(com.commercetools.api.models.cart.LineItemMode.findEnum("Standard"));
        Assertions.assertThat(value.getLineItemMode())
                .isEqualTo(com.commercetools.api.models.cart.LineItemMode.findEnum("Standard"));
    }

    @Test
    public void inventoryMode() {
        LineItem value = LineItem.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void shippingDetails() {
        LineItem value = LineItem.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsImpl());
    }

    @Test
    public void custom() {
        LineItem value = LineItem.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void addedAt() {
        LineItem value = LineItem.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        LineItem value = LineItem.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
