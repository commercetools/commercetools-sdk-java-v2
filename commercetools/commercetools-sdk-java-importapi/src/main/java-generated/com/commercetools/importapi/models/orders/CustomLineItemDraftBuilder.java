
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemDraft customLineItemDraft = CustomLineItemDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemDraftBuilder implements Builder<CustomLineItemDraft> {

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.TypedMoney money;

    @Nullable
    private com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    private String slug;

    private Long quantity;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;

    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    @Nullable
    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    @Nullable
    private com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p>Maps to <code>CustomLineItem.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemDraftBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.money</code>.</p>
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder money(final com.commercetools.importapi.models.common.TypedMoney money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.money</code>.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemDraftBuilder money(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.money = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxedPrice</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxedPrice(
            Function<com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder, com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxedPrice</code>.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withTaxedPrice(
            Function<com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder, com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxedPrice</code>.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxedPrice(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.totalPrice</code>.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder totalPrice(
            final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.totalPrice</code>.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemDraftBuilder totalPrice(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.totalPrice = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.slug</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.quantity</code>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder plusState(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemDraftBuilder plusState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemDraftBuilder addState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()));
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public CustomLineItemDraftBuilder setState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemState> builder) {
        return state(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()));
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxCategory</code>. References a tax category by key. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxCategory</code>. References a tax category by key. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withTaxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxCategory</code>. References a tax category by key. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withTaxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxRate</code>.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CustomLineItemDraftBuilder externalTaxRate(
            Function<com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder, com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withExternalTaxRate(
            Function<com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder, com.commercetools.importapi.models.orders.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder
                .apply(com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder externalTaxRate(
            @Nullable final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder discountedPricePerQuantity(
            @Nullable final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder discountedPricePerQuantity(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder plusDiscountedPricePerQuantity(
            @Nullable final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemDraftBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemDraftBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public CustomLineItemDraftBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()));
    }

    /**
     *  <p>Maps to <code>CustomLineItem.shippingDetails</code>.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemDraftBuilder shippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.shippingDetails</code>.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CustomLineItemDraftBuilder withShippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.shippingDetails</code>.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CustomLineItemDraftBuilder shippingDetails(
            @Nullable final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.name</code>.</p>
     * @return name
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.money</code>.</p>
     * @return money
     */

    public com.commercetools.importapi.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxedPrice</code>.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.totalPrice</code>.</p>
     * @return totalPrice
     */

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.slug</code>.</p>
     * @return slug
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.quantity</code>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.state</code>.</p>
     * @return state
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxCategory</code>. References a tax category by key. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.taxRate</code>.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>External Tax Rate for the Custom Line Item if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.discountedPricePerQuantity</code>.</p>
     * @return discountedPricePerQuantity
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Maps to <code>CustomLineItem.shippingDetails</code>.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds CustomLineItemDraft with checking for non-null required values
     * @return CustomLineItemDraft
     */
    public CustomLineItemDraft build() {
        Objects.requireNonNull(name, CustomLineItemDraft.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItemDraft.class + ": money is missing");
        Objects.requireNonNull(totalPrice, CustomLineItemDraft.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItemDraft.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItemDraft.class + ": quantity is missing");
        return new CustomLineItemDraftImpl(name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, externalTaxRate, discountedPricePerQuantity, shippingDetails);
    }

    /**
     * builds CustomLineItemDraft without checking for non-null required values
     * @return CustomLineItemDraft
     */
    public CustomLineItemDraft buildUnchecked() {
        return new CustomLineItemDraftImpl(name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, externalTaxRate, discountedPricePerQuantity, shippingDetails);
    }

    /**
     * factory method for an instance of CustomLineItemDraftBuilder
     * @return builder
     */
    public static CustomLineItemDraftBuilder of() {
        return new CustomLineItemDraftBuilder();
    }

    /**
     * create builder for CustomLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemDraftBuilder of(final CustomLineItemDraft template) {
        CustomLineItemDraftBuilder builder = new CustomLineItemDraftBuilder();
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        builder.taxCategory = template.getTaxCategory();
        builder.taxRate = template.getTaxRate();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
