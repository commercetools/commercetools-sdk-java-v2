package com.commercetools.models.Review;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
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
public final class ReviewImpl implements Review {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private java.lang.Boolean includedInStatistics;
   
   private java.lang.String uniquenessValue;
   
   private java.lang.String authorName;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.Integer rating;
   
   private com.commercetools.models.State.StateReference state;
   
   private java.lang.String text;
   
   private java.lang.String title;
   
   private java.lang.String locale;
   
   private java.lang.String key;
   
   private com.commercetools.models.Customer.CustomerReference customer;
   
   private java.lang.Object target;

   @JsonCreator
   ReviewImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("includedInStatistics") final java.lang.Boolean includedInStatistics, @JsonProperty("uniquenessValue") final java.lang.String uniquenessValue, @JsonProperty("authorName") final java.lang.String authorName, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("rating") final java.lang.Integer rating, @JsonProperty("state") final com.commercetools.models.State.StateReference state, @JsonProperty("text") final java.lang.String text, @JsonProperty("title") final java.lang.String title, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("key") final java.lang.String key, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerReference customer, @JsonProperty("target") final java.lang.Object target) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.includedInStatistics = includedInStatistics;
      this.uniquenessValue = uniquenessValue;
      this.authorName = authorName;
      this.custom = custom;
      this.rating = rating;
      this.state = state;
      this.text = text;
      this.title = title;
      this.locale = locale;
      this.key = key;
      this.customer = customer;
      this.target = target;
   }
   public ReviewImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   
   public java.lang.String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public java.lang.String getAuthorName(){
      return this.authorName;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Integer getRating(){
      return this.rating;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }
   
   
   public java.lang.String getText(){
      return this.text;
   }
   
   
   public java.lang.String getTitle(){
      return this.title;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }
   
   
   public java.lang.Object getTarget(){
      return this.target;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setIncludedInStatistics(final java.lang.Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setUniquenessValue(final java.lang.String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setAuthorName(final java.lang.String authorName){
      this.authorName = authorName;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setRating(final java.lang.Integer rating){
      this.rating = rating;
   }
   
   public void setState(final com.commercetools.models.State.StateReference state){
      this.state = state;
   }
   
   public void setText(final java.lang.String text){
      this.text = text;
   }
   
   public void setTitle(final java.lang.String title){
      this.title = title;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerReference customer){
      this.customer = customer;
   }
   
   public void setTarget(final java.lang.Object target){
      this.target = target;
   }

}