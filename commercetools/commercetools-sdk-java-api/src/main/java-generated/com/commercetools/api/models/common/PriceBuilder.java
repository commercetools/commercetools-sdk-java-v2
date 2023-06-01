package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.Price;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Price price = Price.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PriceBuilder implements Builder<Price> {

    
    
    private String id;
    
    
    @Nullable
    private String key;
    
    
    
    private com.commercetools.api.models.common.TypedMoney value;
    
    
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
    private com.commercetools.api.models.common.DiscountedPrice discounted;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    
    /**
     *  <p>Unique identifier of this Price.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public PriceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined identifier of the Price. It is unique per ProductVariant.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public PriceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Money value of this Price.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public PriceBuilder value( final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }
    
    
    /**
     *  <p>Money value of this Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */
    
    public PriceBuilder value(Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Country for which this Price is valid.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public PriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }
    
    
    
    
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public PriceBuilder customerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public PriceBuilder withCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */
    
    public PriceBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public PriceBuilder channel(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */
    
    public PriceBuilder withChannel(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */
    
    public PriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time from which this Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public PriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time until this Price is valid. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @param validUntil value to be set
     * @return Builder
     */
    
    public PriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    
    
    
    
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */
    
    public PriceBuilder discounted(Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */
    
    public PriceBuilder withDiscounted(Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @param discounted value to be set
     * @return Builder
     */
    
    public PriceBuilder discounted(@Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }
    
    
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public PriceBuilder tiers(@Nullable final com.commercetools.api.models.common.PriceTier ...tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public PriceBuilder tiers(@Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public PriceBuilder plusTiers(@Nullable final com.commercetools.api.models.common.PriceTier ...tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }
    
    
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public PriceBuilder plusTiers(Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public PriceBuilder withTiers(Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public PriceBuilder addTiers(Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public PriceBuilder setTiers(Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }
                    
    
    
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public PriceBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public PriceBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public PriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of this Price.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined identifier of the Price. It is unique per ProductVariant.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Money value of this Price.</p>
     * @return value
     */
    
    
    public com.commercetools.api.models.common.TypedMoney getValue(){
        return this.value;
    }
    
    /**
     *  <p>Country for which this Price is valid.</p>
     * @return country
     */
    
    @Nullable
    public String getCountry(){
        return this.country;
    }
    
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */
    
    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @return channel
     */
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }
    
    /**
     *  <p>Date and time from which this Price is valid.</p>
     * @return validFrom
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
     *  <p>Date and time until this Price is valid. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @return validUntil
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @return discounted
     */
    
    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @return tiers
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers(){
        return this.tiers;
    }
    
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    /**
     * builds Price with checking for non-null required values
     * @return Price
     */
    public Price build() {
        Objects.requireNonNull(id, Price.class + ": id is missing");
        Objects.requireNonNull(value, Price.class + ": value is missing");
        return new PriceImpl(id, key, value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers, custom);
    }
    
    /**
     * builds Price without checking for non-null required values
     * @return Price
     */
    public Price buildUnchecked() {
        return new PriceImpl(id, key, value, country, customerGroup, channel, validFrom, validUntil, discounted, tiers, custom);
    }

    /**
     * factory method for an instance of PriceBuilder
     * @return builder 
     */
    public static PriceBuilder of() {
        return new PriceBuilder();
    }

    /**
     * create builder for Price instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceBuilder of(final Price template) {
        PriceBuilder builder = new PriceBuilder();
        builder.id = template.getId();
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
        return builder;
    }

}
