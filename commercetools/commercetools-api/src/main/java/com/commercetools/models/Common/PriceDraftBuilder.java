package com.commercetools.models.common;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.common.Money;
import com.commercetools.models.common.PriceTierDraft;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.models.common.PriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceDraftBuilder {
   
   @Nullable
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   @Nullable
   private String country;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.PriceTierDraft> tiers;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private com.commercetools.models.common.Money value;
   
   public PriceDraftBuilder discounted(@Nullable final com.commercetools.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public PriceDraftBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public PriceDraftBuilder tiers(@Nullable final java.util.List<com.commercetools.models.common.PriceTierDraft> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public PriceDraftBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public PriceDraftBuilder channel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier channel) {
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
   
   public PriceDraftBuilder value( final com.commercetools.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.PriceTierDraft> getTiers(){
      return this.tiers;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getChannel(){
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
   
   
   public com.commercetools.models.common.Money getValue(){
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