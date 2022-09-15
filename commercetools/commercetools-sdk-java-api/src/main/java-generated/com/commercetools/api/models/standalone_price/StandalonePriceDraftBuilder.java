
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
    private Boolean active;

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     */

    public StandalonePriceDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     */

    public StandalonePriceDraftBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     */

    public StandalonePriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the money value of this Price.</p>
     */

    public StandalonePriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     */

    public StandalonePriceDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
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
     */

    public StandalonePriceDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     */

    public StandalonePriceDraftBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     */

    public StandalonePriceDraftBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     */

    public StandalonePriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>.</p>
     */

    public StandalonePriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     */

    public StandalonePriceDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
     */

    public StandalonePriceDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Sets price tiers.</p>
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
     */

    public StandalonePriceDraftBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     */

    public StandalonePriceDraftBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     */

    public StandalonePriceDraftBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */

    public StandalonePriceDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */

    public StandalonePriceDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during price selection. If set to <code>false</code>, the StandalonePrice is not considered during price selection.</p>
     */

    public StandalonePriceDraftBuilder active(@Nullable final Boolean active) {
        this.active = active;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    public StandalonePriceDraft build() {
        Objects.requireNonNull(sku, StandalonePriceDraft.class + ": sku is missing");
        Objects.requireNonNull(value, StandalonePriceDraft.class + ": value is missing");
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom, active);
    }

    /**
     * builds StandalonePriceDraft without checking for non null required values
     */
    public StandalonePriceDraft buildUnchecked() {
        return new StandalonePriceDraftImpl(key, sku, value, country, customerGroup, channel, validFrom, validUntil,
            tiers, discounted, custom, active);
    }

    public static StandalonePriceDraftBuilder of() {
        return new StandalonePriceDraftBuilder();
    }

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
        builder.active = template.getActive();
        return builder;
    }

}
