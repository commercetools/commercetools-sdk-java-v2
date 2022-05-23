
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceDraft priceDraft = PriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceDraftBuilder implements Builder<PriceDraft> {

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
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     <*  <p>Money value of this Price.</p>>
     */

    public PriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Money value of this Price.</p>>
     */

    public PriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     <*  <p>Set this field if this Price is only valid for the specified country.</p>>
     */

    public PriceDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     <*  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>>
     */

    public PriceDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>>
     */

    public PriceDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     <*  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>>
     */

    public PriceDraftBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>>
     */

    public PriceDraftBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     <*  <p>Set this field if this Price is valid only valid from the specified date and time.</p>>
     */

    public PriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     <*  <p>Set this field if this Price is valid only valid until the specified date and time.</p>>
     */

    public PriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     <*  <p>Set this field to add a DiscountedPrice from an external service.</p>
    *  <p>The commercetools Platform sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
    *  <ul>
    *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
    *   <li>A ProductDiscountValue of type <code>external</code>.</li>
    *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
    *  </ul>>
     */

    public PriceDraftBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Set this field to add a DiscountedPrice from an external service.</p>
    *  <p>The commercetools Platform sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
    *  <ul>
    *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
    *   <li>A ProductDiscountValue of type <code>external</code>.</li>
    *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
    *  </ul>>
     */

    public PriceDraftBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     <*  <p>Set this field to specify different Prices for certain LineItem quantities.</p>>
     */

    public PriceDraftBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     <*  <p>Set this field to specify different Prices for certain LineItem quantities.</p>>
     */

    public PriceDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     <*  <p>Set this field to specify different Prices for certain LineItem quantities.</p>>
     */

    public PriceDraftBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     <*  <p>Set this field to specify different Prices for certain LineItem quantities.</p>>
     */

    public PriceDraftBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Set this field to specify different Prices for certain LineItem quantities.</p>>
     */

    public PriceDraftBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Custom Fields for the Price.</p>>
     */

    public PriceDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Custom Fields for the Price.</p>>
     */

    public PriceDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
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
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public PriceDraft build() {
        Objects.requireNonNull(value, PriceDraft.class + ": value is missing");
        return new PriceDraftImpl(value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers,
            custom);
    }

    /**
     * builds PriceDraft without checking for non null required values
     */
    public PriceDraft buildUnchecked() {
        return new PriceDraftImpl(value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers,
            custom);
    }

    public static PriceDraftBuilder of() {
        return new PriceDraftBuilder();
    }

    public static PriceDraftBuilder of(final PriceDraft template) {
        PriceDraftBuilder builder = new PriceDraftBuilder();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.tiers = template.getTiers();
        builder.custom = template.getCustom();
        return builder;
    }

}
