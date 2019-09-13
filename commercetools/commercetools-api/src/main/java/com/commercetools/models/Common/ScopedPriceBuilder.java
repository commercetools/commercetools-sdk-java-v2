package com.commercetools.models.common;

import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.common.ScopedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ScopedPriceBuilder {
   
   @Nullable
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.String id;
   
   
   private com.commercetools.models.common.TypedMoney value;
   
   
   private com.commercetools.models.common.TypedMoney currentValue;
   
   public ScopedPriceBuilder discounted(@Nullable final com.commercetools.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ScopedPriceBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public ScopedPriceBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public ScopedPriceBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ScopedPriceBuilder channel(@Nullable final com.commercetools.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public ScopedPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ScopedPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public ScopedPriceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ScopedPriceBuilder value( final com.commercetools.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   public ScopedPriceBuilder currentValue( final com.commercetools.models.common.TypedMoney currentValue) {
      this.currentValue = currentValue;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getChannel(){
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
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.common.TypedMoney getValue(){
      return this.value;
   }
   
   
   public com.commercetools.models.common.TypedMoney getCurrentValue(){
      return this.currentValue;
   }

   public ScopedPrice build() {
       return new ScopedPriceImpl(discounted, country, customerGroup, custom, channel, validUntil, validFrom, id, value, currentValue);
   }
   
   public static ScopedPriceBuilder of() {
      return new ScopedPriceBuilder();
   }
   
   public static ScopedPriceBuilder of(final ScopedPrice template) {
      ScopedPriceBuilder builder = new ScopedPriceBuilder();
      builder.discounted = template.getDiscounted();
      builder.country = template.getCountry();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.channel = template.getChannel();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.id = template.getId();
      builder.value = template.getValue();
      builder.currentValue = template.getCurrentValue();
      return builder;
   }
   
}