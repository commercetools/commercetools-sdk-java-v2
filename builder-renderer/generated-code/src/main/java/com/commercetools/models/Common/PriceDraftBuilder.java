package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.PriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.PriceTier> tiers;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private com.commercetools.models.Common.Money value;
   
   public PriceDraftBuilder discounted(@Nullable final com.commercetools.models.Common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public PriceDraftBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public PriceDraftBuilder tiers(@Nullable final java.util.List<com.commercetools.models.Common.PriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public PriceDraftBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public PriceDraftBuilder channel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public PriceDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceDraftBuilder value( final com.commercetools.models.Common.Money value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.PriceTier> getTiers(){
      return this.tiers;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getChannel(){
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
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public PriceDraft build() {
       return new PriceDraftImpl(discounted, country, tiers, customerGroup, custom, channel, validUntil, validFrom, value);
   }
   
   public static PriceDraftBuilder of() {
      return new PriceDraftBuilder();
   }
   
   public static PriceDraftBuilder of(final PriceDraft template) {
      PriceDraftBuilder builder = new PriceDraftBuilder();
      builder.discounted = template.getDiscounted();
      builder.country = template.getCountry();
      builder.tiers = template.getTiers();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.channel = template.getChannel();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.value = template.getValue();
      return builder;
   }
   
}