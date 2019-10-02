package com.commercetools.models.project;

import com.commercetools.models.message.MessageConfiguration;
import com.commercetools.models.project.ExternalOAuth;
import com.commercetools.models.project.ShippingRateInputType;
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
public final class ProjectImpl implements Project {

   private com.commercetools.models.project.ExternalOAuth externalOAuth;
   
   private com.commercetools.models.project.ShippingRateInputType shippingRateInputType;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.util.List<String> languages;
   
   private String name;
   
   private com.commercetools.models.message.MessageConfiguration messages;
   
   private java.util.List<String> countries;
   
   private String trialUntil;
   
   private Long version;
   
   private String key;
   
   private java.util.List<String> currencies;

   @JsonCreator
   ProjectImpl(@JsonProperty("externalOAuth") final com.commercetools.models.project.ExternalOAuth externalOAuth, @JsonProperty("shippingRateInputType") final com.commercetools.models.project.ShippingRateInputType shippingRateInputType, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("languages") final java.util.List<String> languages, @JsonProperty("name") final String name, @JsonProperty("messages") final com.commercetools.models.message.MessageConfiguration messages, @JsonProperty("countries") final java.util.List<String> countries, @JsonProperty("trialUntil") final String trialUntil, @JsonProperty("version") final Long version, @JsonProperty("key") final String key, @JsonProperty("currencies") final java.util.List<String> currencies) {
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
   
   
   public com.commercetools.models.project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }
   
   
   public com.commercetools.models.project.ShippingRateInputType getShippingRateInputType(){
      return this.shippingRateInputType;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.util.List<String> getLanguages(){
      return this.languages;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.message.MessageConfiguration getMessages(){
      return this.messages;
   }
   
   
   public java.util.List<String> getCountries(){
      return this.countries;
   }
   
   
   public String getTrialUntil(){
      return this.trialUntil;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public java.util.List<String> getCurrencies(){
      return this.currencies;
   }

   public void setExternalOAuth(final com.commercetools.models.project.ExternalOAuth externalOAuth){
      this.externalOAuth = externalOAuth;
   }
   
   public void setShippingRateInputType(final com.commercetools.models.project.ShippingRateInputType shippingRateInputType){
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
   
   public void setMessages(final com.commercetools.models.message.MessageConfiguration messages){
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