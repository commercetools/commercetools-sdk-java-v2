package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.type.CustomFields;
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
public final class ReviewImpl implements Review {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private Boolean includedInStatistics;
   
   private String uniquenessValue;
   
   private String authorName;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private Integer rating;
   
   private com.commercetools.api.generated.models.state.StateReference state;
   
   private String text;
   
   private String title;
   
   private String locale;
   
   private String key;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;
   
   private Object target;

   @JsonCreator
   ReviewImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("includedInStatistics") final Boolean includedInStatistics, @JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("authorName") final String authorName, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("rating") final Integer rating, @JsonProperty("state") final com.commercetools.api.generated.models.state.StateReference state, @JsonProperty("text") final String text, @JsonProperty("title") final String title, @JsonProperty("locale") final String locale, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer, @JsonProperty("target") final Object target) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public String getAuthorName(){
      return this.authorName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public Integer getRating(){
      return this.rating;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public String getText(){
      return this.text;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }
   
   
   public Object getTarget(){
      return this.target;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setIncludedInStatistics(final Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setUniquenessValue(final String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setAuthorName(final String authorName){
      this.authorName = authorName;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setRating(final Integer rating){
      this.rating = rating;
   }
   
   public void setState(final com.commercetools.api.generated.models.state.StateReference state){
      this.state = state;
   }
   
   public void setText(final String text){
      this.text = text;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }
   
   public void setTarget(final Object target){
      this.target = target;
   }

}