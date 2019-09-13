package com.commercetools.models.error;

import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.error.ErrorObject;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.error.MatchingPriceNotFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MatchingPriceNotFoundErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private java.lang.String country;
   
   
   private java.lang.String productId;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.channel.ChannelReference channel;
   
   @Nullable
   private java.lang.String currency;
   
   
   private java.lang.Integer variantId;
   
   public MatchingPriceNotFoundErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder productId( final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder channel(@Nullable final com.commercetools.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder currency(@Nullable final java.lang.String currency) {
      this.currency = currency;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }

   public MatchingPriceNotFoundError build() {
       return new MatchingPriceNotFoundErrorImpl(message, country, productId, customerGroup, channel, currency, variantId);
   }
   
   public static MatchingPriceNotFoundErrorBuilder of() {
      return new MatchingPriceNotFoundErrorBuilder();
   }
   
   public static MatchingPriceNotFoundErrorBuilder of(final MatchingPriceNotFoundError template) {
      MatchingPriceNotFoundErrorBuilder builder = new MatchingPriceNotFoundErrorBuilder();
      builder.message = template.getMessage();
      builder.country = template.getCountry();
      builder.productId = template.getProductId();
      builder.customerGroup = template.getCustomerGroup();
      builder.channel = template.getChannel();
      builder.currency = template.getCurrency();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}