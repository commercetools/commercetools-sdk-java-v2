package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.QueryPrice;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryPrice queryPrice = QueryPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QueryPriceBuilder implements Builder<QueryPrice> {

    
    @Nullable
    private String id;
    
    
    
    private com.commercetools.api.models.common.Money value;
    
    
    @Nullable
    private String country;
    
    
    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;
    
    
    @Nullable
    private java.time.ZonedDateTime validFrom;
    
    
    @Nullable
    private java.time.ZonedDateTime validUntil;
    
    
    @Nullable
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    
    /**
     *  <p>Unique identifier of the given Price.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Money value of the given Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public QueryPriceBuilder value(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Money value of the given Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public QueryPriceBuilder withValue(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Money value of the given Price.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder value( final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }
    
    
    
    
    /**
     *  <p>Country for which the given Price is valid.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }
    
    
    
    
    /**
     *  <p>CustomerGroup for which the given Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public QueryPriceBuilder customerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>CustomerGroup for which the given Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public QueryPriceBuilder withCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>CustomerGroup for which the given Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which the given Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public QueryPriceBuilder channel(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which the given Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public QueryPriceBuilder withChannel(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p><code>ProductDistribution</code> Channel for which the given Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date from which the given Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date until which the given Price is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    
    
    
    
    /**
     *  <p>DiscountedPrice you specify for the given Price.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */
    
    public QueryPriceBuilder discounted(Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>DiscountedPrice you specify for the given Price.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */
    
    public QueryPriceBuilder withDiscounted(Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraft> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>DiscountedPrice you specify for the given Price.</p>
     * @param discounted value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder discounted(@Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public QueryPriceBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public QueryPriceBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for the Price.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft ...tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder tiers(@Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public QueryPriceBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTierDraft ...tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }
    
    
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public QueryPriceBuilder plusTiers(Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public QueryPriceBuilder withTiers(Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public QueryPriceBuilder addTiers(Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public QueryPriceBuilder setTiers(Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }
                    

    /**
     *  <p>Unique identifier of the given Price.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Money value of the given Price.</p>
     * @return value
     */
    
    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }
    
    /**
     *  <p>Country for which the given Price is valid.</p>
     * @return country
     */
    
    @Nullable
    public String getCountry(){
        return this.country;
    }
    
    /**
     *  <p>CustomerGroup for which the given Price is valid.</p>
     * @return customerGroup
     */
    
    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which the given Price is valid.</p>
     * @return channel
     */
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }
    
    /**
     *  <p>Date from which the given Price is valid.</p>
     * @return validFrom
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
     *  <p>Date until which the given Price is valid.</p>
     * @return validUntil
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    /**
     *  <p>DiscountedPrice you specify for the given Price.</p>
     * @return discounted
     */
    
    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted(){
        return this.discounted;
    }
    
    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     * @return tiers
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers(){
        return this.tiers;
    }

    /**
     * builds QueryPrice with checking for non-null required values
     * @return QueryPrice
     */
    public QueryPrice build() {
        Objects.requireNonNull(value, QueryPrice.class + ": value is missing");
        return new QueryPriceImpl(id, value, country, customerGroup, channel, validFrom, validUntil, discounted, custom, tiers);
    }
    
    /**
     * builds QueryPrice without checking for non-null required values
     * @return QueryPrice
     */
    public QueryPrice buildUnchecked() {
        return new QueryPriceImpl(id, value, country, customerGroup, channel, validFrom, validUntil, discounted, custom, tiers);
    }

    /**
     * factory method for an instance of QueryPriceBuilder
     * @return builder 
     */
    public static QueryPriceBuilder of() {
        return new QueryPriceBuilder();
    }

    /**
     * create builder for QueryPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QueryPriceBuilder of(final QueryPrice template) {
        QueryPriceBuilder builder = new QueryPriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        builder.tiers = template.getTiers();
        return builder;
    }

}
