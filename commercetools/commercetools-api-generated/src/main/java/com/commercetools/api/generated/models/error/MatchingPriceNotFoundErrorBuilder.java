package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.MatchingPriceNotFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MatchingPriceNotFoundErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private String country;
   
   
   private String productId;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   @Nullable
   private String currency;
   
   
   private Integer variantId;
   
   public MatchingPriceNotFoundErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder productId( final String productId) {
      this.productId = productId;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder channel(@Nullable final com.commercetools.api.generated.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder currency(@Nullable final String currency) {
      this.currency = currency;
      return this;
   }
   
   public MatchingPriceNotFoundErrorBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public String getCurrency(){
      return this.currency;
   }
   
   
   public Integer getVariantId(){
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