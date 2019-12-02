package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.common.PriceTierDraft;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
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

   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   private String country;
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceTierDraft> tiers;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier channel;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private com.commercetools.api.generated.models.common.Money value;

   @JsonCreator
   PriceDraftImpl(@JsonProperty("discounted") final com.commercetools.api.generated.models.common.DiscountedPrice discounted, @JsonProperty("country") final String country, @JsonProperty("tiers") final java.util.List<com.commercetools.api.generated.models.common.PriceTierDraft> tiers, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("channel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier channel, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("value") final com.commercetools.api.generated.models.common.Money value) {
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
   
   
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.PriceTierDraft> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getChannel(){
      return this.channel;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
      return this.value;
   }

   public void setDiscounted(final com.commercetools.api.generated.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setTiers(final java.util.List<com.commercetools.api.generated.models.common.PriceTierDraft> tiers){
      this.tiers = tiers;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValue(final com.commercetools.api.generated.models.common.Money value){
      this.value = value;
   }

}