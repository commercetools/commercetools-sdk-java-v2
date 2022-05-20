
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LineItemBuilder implements Builder<LineItem> {

    private String id;

    private String productId;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.Price price;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.cart.LineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.LineItemMode lineItemMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    /**
    *  <p>Platform-generated unique identifier of the LineItem.</p>
    */

    public LineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public LineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
    *  <p>User-defined unique identifier of the Product. Only present on Line Items in a Cart when the <code>key</code> is available on that specific Product at the time the Line Item is created or updated on the Cart. On Order resources this field is only present when the <code>key</code> is available on the specific Product at the time the Order is created from the Cart. This field is in general not present on Carts that had no updates until 3 December 2021 and on Orders created before this date.</p>
    */

    public LineItemBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
    *  <p>The product name.</p>
    */

    public LineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The product name.</p>
    */

    public LineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
    *  <p>The slug of a product is inserted on the fly. It is always up-to-date and can therefore be used to link to the product detail page of the product. It is empty if the product has been deleted. The slug is also empty if the cart or order is retrieved via Reference Expansion or is a snapshot in a Message.</p>
    */

    public LineItemBuilder productSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The slug of a product is inserted on the fly. It is always up-to-date and can therefore be used to link to the product detail page of the product. It is empty if the product has been deleted. The slug is also empty if the cart or order is retrieved via Reference Expansion or is a snapshot in a Message.</p>
    */

    public LineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    public LineItemBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    public LineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
    *  <p>The variant data is saved when the variant is added to the cart, and not updated automatically. It can manually be updated with the Recalculate update action.</p>
    */

    public LineItemBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The variant data is saved when the variant is added to the cart, and not updated automatically. It can manually be updated with the Recalculate update action.</p>
    */

    public LineItemBuilder variant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
    *  <p>The price of a line item is selected from the product variant according to the Product's priceMode value. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
    */

    public LineItemBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The price of a line item is selected from the product variant according to the Product's priceMode value. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
    */

    public LineItemBuilder price(final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */

    public LineItemBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */

    public LineItemBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
    *  <p>The total price of this line item. If the line item is discounted, then the <code>totalPrice</code> is the DiscountedLineItemPriceForQuantity multiplied by <code>quantity</code>. Otherwise the total price is the product price multiplied by the <code>quantity</code>. <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
    */

    public LineItemBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
    *  <p>The total price of this line item. If the line item is discounted, then the <code>totalPrice</code> is the DiscountedLineItemPriceForQuantity multiplied by <code>quantity</code>. Otherwise the total price is the product price multiplied by the <code>quantity</code>. <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
    */

    public LineItemBuilder totalPrice(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
    */

    public LineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
    *  <p>When the line item was added to the cart. Optional for backwards compatibility reasons only.</p>
    */

    public LineItemBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public LineItemBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public LineItemBuilder state(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public LineItemBuilder plusState(final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    public LineItemBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public LineItemBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set. For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */

    public LineItemBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set. For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */

    public LineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
    *  <p>The supply channel identifies the inventory entries that should be reserved. The channel has the role InventorySupply.</p>
    */

    public LineItemBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
    *  <p>The supply channel identifies the inventory entries that should be reserved. The channel has the role InventorySupply.</p>
    */

    public LineItemBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
    *  <p>The distribution channel is used to select a ProductPrice. The channel has the role ProductDistribution.</p>
    */

    public LineItemBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
    *  <p>The distribution channel is used to select a ProductPrice. The channel has the role ProductDistribution.</p>
    */

    public LineItemBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public LineItemBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public LineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    public LineItemBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public LineItemBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    public LineItemBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    public LineItemBuilder priceMode(final com.commercetools.api.models.cart.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    public LineItemBuilder lineItemMode(final com.commercetools.api.models.cart.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
        return this;
    }

    public LineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public LineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
    *  <p>Container for line item specific address(es).</p>
    */

    public LineItemBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Container for line item specific address(es).</p>
    */

    public LineItemBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
    *  <p>The date when the LineItem was last modified by one of the following actions setLineItemShippingDetails, addLineItem, removeLineItem, or changeLineItemQuantity. Optional only for backwards compatible reasons. When the LineItem is created lastModifiedAt is set to addedAt.</p>
    */

    public LineItemBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.cart.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    public com.commercetools.api.models.cart.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public LineItem build() {
        Objects.requireNonNull(id, LineItem.class + ": id is missing");
        Objects.requireNonNull(productId, LineItem.class + ": productId is missing");
        Objects.requireNonNull(name, LineItem.class + ": name is missing");
        Objects.requireNonNull(productType, LineItem.class + ": productType is missing");
        Objects.requireNonNull(variant, LineItem.class + ": variant is missing");
        Objects.requireNonNull(price, LineItem.class + ": price is missing");
        Objects.requireNonNull(totalPrice, LineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(quantity, LineItem.class + ": quantity is missing");
        Objects.requireNonNull(state, LineItem.class + ": state is missing");
        Objects.requireNonNull(discountedPricePerQuantity, LineItem.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(priceMode, LineItem.class + ": priceMode is missing");
        Objects.requireNonNull(lineItemMode, LineItem.class + ": lineItemMode is missing");
        return new LineItemImpl(id, productId, productKey, name, productSlug, productType, variant, price, taxedPrice,
            totalPrice, quantity, addedAt, state, taxRate, supplyChannel, distributionChannel,
            discountedPricePerQuantity, priceMode, lineItemMode, custom, shippingDetails, lastModifiedAt);
    }

    /**
     * builds LineItem without checking for non null required values
     */
    public LineItem buildUnchecked() {
        return new LineItemImpl(id, productId, productKey, name, productSlug, productType, variant, price, taxedPrice,
            totalPrice, quantity, addedAt, state, taxRate, supplyChannel, distributionChannel,
            discountedPricePerQuantity, priceMode, lineItemMode, custom, shippingDetails, lastModifiedAt);
    }

    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.id = template.getId();
        builder.productId = template.getProductId();
        builder.productKey = template.getProductKey();
        builder.name = template.getName();
        builder.productSlug = template.getProductSlug();
        builder.productType = template.getProductType();
        builder.variant = template.getVariant();
        builder.price = template.getPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.state = template.getState();
        builder.taxRate = template.getTaxRate();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.priceMode = template.getPriceMode();
        builder.lineItemMode = template.getLineItemMode();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
