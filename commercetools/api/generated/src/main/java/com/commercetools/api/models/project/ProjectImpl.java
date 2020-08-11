package com.commercetools.api.models.project;

import com.commercetools.api.models.message.MessageConfiguration;
import com.commercetools.api.models.project.ExternalOAuth;
import com.commercetools.api.models.project.ShippingRateInputType;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectImpl implements Project {

   private com.commercetools.api.models.project.ExternalOAuth externalOAuth;
   
   private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.util.List<String> languages;
   
   private String name;
   
   private com.commercetools.api.models.message.MessageConfiguration messages;
   
   private java.util.List<String> countries;
   
   private String trialUntil;
   
   private Long version;
   
   private String key;
   
   private java.util.List<String> currencies;

   @JsonCreator
   ProjectImpl(@JsonProperty("externalOAuth") final com.commercetools.api.models.project.ExternalOAuth externalOAuth, @JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("languages") final java.util.List<String> languages, @JsonProperty("name") final String name, @JsonProperty("messages") final com.commercetools.api.models.message.MessageConfiguration messages, @JsonProperty("countries") final java.util.List<String> countries, @JsonProperty("trialUntil") final String trialUntil, @JsonProperty("version") final Long version, @JsonProperty("key") final String key, @JsonProperty("currencies") final java.util.List<String> currencies) {
      this.externalOAuth = externalOAuth;
      this.shippingRateInputType = shippingRateInputType;
      this.createdAt = createdAt;
      this.languages = languages;
      this.name = name;
      this.messages = messages;
      this.countries = countries;
      this.trialUntil = trialUntil;
      this.version = version;
      this.key = key;
      this.currencies = currencies;
   }
   public ProjectImpl() {
      
   }
   
   
   public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }
   
   
   public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.util.List<String> getLanguages(){
      return this.languages;
   }
   
   /**
   *  <p>The name of the project.</p>
   */
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.models.message.MessageConfiguration getMessages(){
      return this.messages;
   }
   
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.util.List<String> getCountries(){
      return this.countries;
   }
   
   /**
   *  <p>The time is in the format Year-Month <code>YYYY-MM</code>.</p>
   */
   public String getTrialUntil(){
      return this.trialUntil;
   }
   
   /**
   *  <p>The current version of the project.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>The unique key of the project.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public java.util.List<String> getCurrencies(){
      return this.currencies;
   }

   public void setExternalOAuth(final com.commercetools.api.models.project.ExternalOAuth externalOAuth){
      this.externalOAuth = externalOAuth;
   }
   
   public void setShippingRateInputType(final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType){
      this.shippingRateInputType = shippingRateInputType;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLanguages(final java.util.List<String> languages){
      this.languages = languages;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setMessages(final com.commercetools.api.models.message.MessageConfiguration messages){
      this.messages = messages;
   }
   
   public void setCountries(final java.util.List<String> countries){
      this.countries = countries;
   }
   
   public void setTrialUntil(final String trialUntil){
      this.trialUntil = trialUntil;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCurrencies(final java.util.List<String> currencies){
      this.currencies = currencies;
   }

}
