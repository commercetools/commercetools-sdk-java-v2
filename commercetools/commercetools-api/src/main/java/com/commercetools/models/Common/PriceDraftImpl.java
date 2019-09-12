package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceDraftImpl implements PriceDraft {

   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   private java.lang.String country;
   
   private java.util.List<com.commercetools.models.Common.PriceTier> tiers;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier channel;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private com.commercetools.models.Common.Money value;

   @JsonCreator
   PriceDraftImpl(@JsonProperty("discounted") final com.commercetools.models.Common.DiscountedPrice discounted, @JsonProperty("country") final java.lang.String country, @JsonProperty("tiers") final java.util.List<com.commercetools.models.Common.PriceTier> tiers, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("channel") final com.commercetools.models.Channel.ChannelResourceIdentifier channel, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("value") final com.commercetools.models.Common.Money value) {
      this.discounted = discounted;
      this.country = country;
      this.tiers = tiers;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.channel = channel;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.value = value;
   }
   public PriceDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public void setDiscounted(final com.commercetools.models.Common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setTiers(final java.util.List<com.commercetools.models.Common.PriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValue(final com.commercetools.models.Common.Money value){
      this.value = value;
   }

}