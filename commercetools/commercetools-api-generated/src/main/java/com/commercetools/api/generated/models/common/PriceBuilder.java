package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.common.PriceTier;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.common.Price;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   @Nullable
   private String country;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.PriceTier> tiers;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private String id;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney value;
   
   public PriceBuilder discounted(@Nullable final com.commercetools.api.generated.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public PriceBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public PriceBuilder tiers(@Nullable final java.util.List<com.commercetools.api.generated.models.common.PriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public PriceBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public PriceBuilder channel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public PriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public PriceBuilder value( final com.commercetools.api.generated.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.PriceTier> getTiers(){
      return this.tiers;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getValue(){
      return this.value;
   }

   public Price build() {
       return new PriceImpl(discounted, country, tiers, customerGroup, custom, channel, validUntil, validFrom, id, value);
   }
   
   public static PriceBuilder of() {
      return new PriceBuilder();
   }
   
   public static PriceBuilder of(final Price template) {
      PriceBuilder builder = new PriceBuilder();
      builder.discounted = template.getDiscounted();
      builder.country = template.getCountry();
      builder.tiers = template.getTiers();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.channel = template.getChannel();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.id = template.getId();
      builder.value = template.getValue();
      return builder;
   }
   
}