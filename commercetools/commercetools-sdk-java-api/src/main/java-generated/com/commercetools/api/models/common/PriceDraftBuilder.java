
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

    @Nullable
    private String key;

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

    @Nullable
    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    /**
     *  <p>User-defined identifier for the Price. It must be unique per ProductVariant.</p>
     * @param key value to be set
     * @return Builder
     */

    public PriceDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceDraftBuilder withValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @param country value to be set
     * @return Builder
     */

    public PriceDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public PriceDraftBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public PriceDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceDraftBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public PriceDraftBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @param channel value to be set
     * @return Builder
     */

    public PriceDraftBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public PriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public PriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceDraftBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public PriceDraftBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraft> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @param discounted value to be set
     * @return Builder
     */

    public PriceDraftBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public PriceDraftBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
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
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceDraftBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceDraftBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public PriceDraftBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PriceDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PriceDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public PriceDraftBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public PriceDraftBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public PriceDraftBuilder recurrencePolicy(
            @Nullable final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p>User-defined identifier for the Price. It must be unique per ProductVariant.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @return recurrencePolicy
     */

    @Nullable
    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds PriceDraft with checking for non-null required values
     * @return PriceDraft
     */
    public PriceDraft build() {
        Objects.requireNonNull(value, PriceDraft.class + ": value is missing");
        return new PriceDraftImpl(key, value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers,
            custom, recurrencePolicy);
    }

    /**
     * builds PriceDraft without checking for non-null required values
     * @return PriceDraft
     */
    public PriceDraft buildUnchecked() {
        return new PriceDraftImpl(key, value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers,
            custom, recurrencePolicy);
    }

    /**
     * factory method for an instance of PriceDraftBuilder
     * @return builder
     */
    public static PriceDraftBuilder of() {
        return new PriceDraftBuilder();
    }

    /**
     * create builder for PriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceDraftBuilder of(final PriceDraft template) {
        PriceDraftBuilder builder = new PriceDraftBuilder();
        builder.key = template.getKey();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.tiers = template.getTiers();
        builder.custom = template.getCustom();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
