package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.QueryPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class QueryPriceBuilder {

   @Nullable
   private com.commercetools.api.models.common.DiscountedPrice discounted;

   @Nullable
   private String country;

   @Nullable
   private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;

   @Nullable
   private com.commercetools.api.models.channel.ChannelReference channel;

   @Nullable
   private java.time.ZonedDateTime validUntil;

   @Nullable
   private java.time.ZonedDateTime validFrom;


   private String id;


   private com.commercetools.api.models.common.Money value;

   public QueryPriceBuilder discounted(@Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }

   public QueryPriceBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }

   public QueryPriceBuilder tiers(@Nullable final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
      this.tiers = tiers;
      return this;
   }

   public QueryPriceBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }

   public QueryPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public QueryPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }

   public QueryPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }

   public QueryPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }

   public QueryPriceBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public QueryPriceBuilder value( final com.commercetools.api.models.common.Money value) {
      this.value = value;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }

   @Nullable
   public String getCountry(){
      return this.country;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers(){
      return this.tiers;
   }

   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   @Nullable
   public com.commercetools.api.models.channel.ChannelReference getChannel(){
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


   public com.commercetools.api.models.common.Money getValue(){
      return this.value;
   }

   public QueryPrice build() {
       return new QueryPriceImpl(discounted, country, tiers, customerGroup, custom, channel, validUntil, validFrom, id, value);
   }

   public static QueryPriceBuilder of() {
      return new QueryPriceBuilder();
   }

   public static QueryPriceBuilder of(final QueryPrice template) {
      QueryPriceBuilder builder = new QueryPriceBuilder();
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
