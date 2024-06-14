
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDraft standalonePriceDraft = StandalonePriceDraft.builder()
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDraftBuilder implements Builder<StandalonePriceDraft> {

    @Nullable
    private String key;

    private String sku;

    private com.commercetools.api.models.common.Money value;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.standalone_price.StagedPriceDraft staged;

    @Nullable
    private Boolean active;

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     * @param key value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     * @param sku value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @param country value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceDraftBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder plusTiers(
            @Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceDraftBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceDraftBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceDraftBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceDraftBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraft> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public StandalonePriceDraftBuilder staged(
            Function<com.commercetools.api.models.standalone_price.StagedPriceDraftBuilder, com.commercetools.api.models.standalone_price.StagedPriceDraftBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.standalone_price.StagedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @param builder function to build the staged value
     * @return Builder
     */

    public StandalonePriceDraftBuilder withStaged(
            Function<com.commercetools.api.models.standalone_price.StagedPriceDraftBuilder, com.commercetools.api.models.standalone_price.StagedPriceDraft> builder) {
        this.staged = builder.apply(com.commercetools.api.models.standalone_price.StagedPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder staged(
            @Nullable final com.commercetools.api.models.standalone_price.StagedPriceDraft staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Set to <code>false</code>, if the StandalonePrice should not be considered during Product price selection.</p>
     * @param active value to be set
     * @return Builder
     */

    public StandalonePriceDraftBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @return staged
     */

    @Nullable
    public com.commercetools.api.models.standalone_price.StagedPriceDraft getStaged() {
        return this.staged;
    }

    /**
     *  <p>Set to <code>false</code>, if the StandalonePrice should not be considered during Product price selection.</p>
     * @return active
     */

    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    /**
     * builds StandalonePriceDraft with checking for non-null required values
     * @return StandalonePriceDraft
     */
    public StandalonePriceDraft build() {
        Objects.requireNonNull(sku, StandalonePriceDraft.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePriceDraft.class + ": value is missing");
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom, staged, active);
    }

    /**
     * builds StandalonePriceDraft without checking for non-null required values
     * @return StandalonePriceDraft
     */
    public StandalonePriceDraft buildUnchecked() {
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom, staged, active);
    }

    /**
     * factory method for an instance of StandalonePriceDraftBuilder
     * @return builder
     */
    public static StandalonePriceDraftBuilder of() {
        return new StandalonePriceDraftBuilder();
    }

    /**
     * create builder for StandalonePriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDraftBuilder of(final StandalonePriceDraft template) {
        StandalonePriceDraftBuilder builder = new StandalonePriceDraftBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.tiers = template.getTiers();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        builder.staged = template.getStaged();
        builder.active = template.getActive();
        return builder;
    }

}
