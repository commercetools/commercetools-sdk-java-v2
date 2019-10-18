package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.message.MessageConfiguration;
import com.commercetools.api.generated.models.project.ExternalOAuth;
import com.commercetools.api.generated.models.project.ShippingRateInputType;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.project.Project;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth;
   
   @Nullable
   private com.commercetools.api.generated.models.project.ShippingRateInputType shippingRateInputType;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.util.List<String> languages;
   
   
   private String name;
   
   
   private com.commercetools.api.generated.models.message.MessageConfiguration messages;
   
   
   private java.util.List<String> countries;
   
   @Nullable
   private String trialUntil;
   
   
   private Long version;
   
   
   private String key;
   
   
   private java.util.List<String> currencies;
   
   public ProjectBuilder externalOAuth(@Nullable final com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth) {
      this.externalOAuth = externalOAuth;
      return this;
   }
   
   public ProjectBuilder shippingRateInputType(@Nullable final com.commercetools.api.generated.models.project.ShippingRateInputType shippingRateInputType) {
      this.shippingRateInputType = shippingRateInputType;
      return this;
   }
   
   public ProjectBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProjectBuilder languages( final java.util.List<String> languages) {
      this.languages = languages;
      return this;
   }
   
   public ProjectBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProjectBuilder messages( final com.commercetools.api.generated.models.message.MessageConfiguration messages) {
      this.messages = messages;
      return this;
   }
   
   public ProjectBuilder countries( final java.util.List<String> countries) {
      this.countries = countries;
      return this;
   }
   
   public ProjectBuilder trialUntil(@Nullable final String trialUntil) {
      this.trialUntil = trialUntil;
      return this;
   }
   
   public ProjectBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProjectBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public ProjectBuilder currencies( final java.util.List<String> currencies) {
      this.currencies = currencies;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.project.ShippingRateInputType getShippingRateInputType(){
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
   
   
   public com.commercetools.api.generated.models.message.MessageConfiguration getMessages(){
      return this.messages;
   }
   
   
   public java.util.List<String> getCountries(){
      return this.countries;
   }
   
   @Nullable
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

   public Project build() {
       return new ProjectImpl(externalOAuth, shippingRateInputType, createdAt, languages, name, messages, countries, trialUntil, version, key, currencies);
   }
   
   public static ProjectBuilder of() {
      return new ProjectBuilder();
   }
   
   public static ProjectBuilder of(final Project template) {
      ProjectBuilder builder = new ProjectBuilder();
      builder.externalOAuth = template.getExternalOAuth();
      builder.shippingRateInputType = template.getShippingRateInputType();
      builder.createdAt = template.getCreatedAt();
      builder.languages = template.getLanguages();
      builder.name = template.getName();
      builder.messages = template.getMessages();
      builder.countries = template.getCountries();
      builder.trialUntil = template.getTrialUntil();
      builder.version = template.getVersion();
      builder.key = template.getKey();
      builder.currencies = template.getCurrencies();
      return builder;
   }
   
}