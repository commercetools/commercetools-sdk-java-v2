package com.commercetools.models.Project;

import com.commercetools.models.Message.MessageConfiguration;
import com.commercetools.models.Project.ExternalOAuth;
import com.commercetools.models.Project.ShippingRateInputType;
import java.lang.Long;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectImpl implements Project {

   private com.commercetools.models.Project.ExternalOAuth externalOAuth;
   
   private com.commercetools.models.Project.ShippingRateInputType shippingRateInputType;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.util.List<java.lang.String> languages;
   
   private java.lang.String name;
   
   private com.commercetools.models.Message.MessageConfiguration messages;
   
   private java.util.List<java.lang.String> countries;
   
   private java.lang.String trialUntil;
   
   private java.lang.Long version;
   
   private java.lang.String key;
   
   private java.util.List<java.lang.String> currencies;

   @JsonCreator
   ProjectImpl(@JsonProperty("externalOAuth") final com.commercetools.models.Project.ExternalOAuth externalOAuth, @JsonProperty("shippingRateInputType") final com.commercetools.models.Project.ShippingRateInputType shippingRateInputType, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("languages") final java.util.List<java.lang.String> languages, @JsonProperty("name") final java.lang.String name, @JsonProperty("messages") final com.commercetools.models.Message.MessageConfiguration messages, @JsonProperty("countries") final java.util.List<java.lang.String> countries, @JsonProperty("trialUntil") final java.lang.String trialUntil, @JsonProperty("version") final java.lang.Long version, @JsonProperty("key") final java.lang.String key, @JsonProperty("currencies") final java.util.List<java.lang.String> currencies) {
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
   
   
   public com.commercetools.models.Project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }
   
   
   public com.commercetools.models.Project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.util.List<java.lang.String> getLanguages(){
      return this.languages;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Message.MessageConfiguration getMessages(){
      return this.messages;
   }
   
   
   public java.util.List<java.lang.String> getCountries(){
      return this.countries;
   }
   
   
   public java.lang.String getTrialUntil(){
      return this.trialUntil;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<java.lang.String> getCurrencies(){
      return this.currencies;
   }

   public void setExternalOAuth(final com.commercetools.models.Project.ExternalOAuth externalOAuth){
      this.externalOAuth = externalOAuth;
   }
   
   public void setShippingRateInputType(final com.commercetools.models.Project.ShippingRateInputType shippingRateInputType){
      this.shippingRateInputType = shippingRateInputType;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLanguages(final java.util.List<java.lang.String> languages){
      this.languages = languages;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setMessages(final com.commercetools.models.Message.MessageConfiguration messages){
      this.messages = messages;
   }
   
   public void setCountries(final java.util.List<java.lang.String> countries){
      this.countries = countries;
   }
   
   public void setTrialUntil(final java.lang.String trialUntil){
      this.trialUntil = trialUntil;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setCurrencies(final java.util.List<java.lang.String> currencies){
      this.currencies = currencies;
   }

}