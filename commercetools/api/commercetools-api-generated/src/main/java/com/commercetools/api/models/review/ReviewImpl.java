package com.commercetools.api.models.review;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class ReviewImpl implements Review {

   private String id;
   
   private Long version;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   private String key;
   
   private String uniquenessValue;
   
   private String locale;
   
   private String authorName;
   
   private String title;
   
   private String text;
   
   private com.fasterxml.jackson.databind.JsonNode target;
   
   private Boolean includedInStatistics;
   
   private Integer rating;
   
   private com.commercetools.api.models.state.StateReference state;
   
   private com.commercetools.api.models.customer.CustomerReference customer;
   
   private com.commercetools.api.models.type.CustomFields custom;

   @JsonCreator
   ReviewImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("locale") final String locale, @JsonProperty("authorName") final String authorName, @JsonProperty("title") final String title, @JsonProperty("text") final String text, @JsonProperty("target") final com.fasterxml.jackson.databind.JsonNode target, @JsonProperty("includedInStatistics") final Boolean includedInStatistics, @JsonProperty("rating") final Integer rating, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
      this.id = id;
      this.version = version;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.lastModifiedBy = lastModifiedBy;
      this.createdBy = createdBy;
      this.key = key;
      this.uniquenessValue = uniquenessValue;
      this.locale = locale;
      this.authorName = authorName;
      this.title = title;
      this.text = text;
      this.target = target;
      this.includedInStatistics = includedInStatistics;
      this.rating = rating;
      this.state = state;
      this.customer = customer;
      this.custom = custom;
   }
   public ReviewImpl() {
      
   }
   
   /**
   *  <p>The unique ID of the review.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the review.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>User-specific unique identifier for the review.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public String getAuthorName(){
      return this.authorName;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getText(){
      return this.text;
   }
   
   /**
   *  <p>Identifies the target of the review.
   *  Can be a Product or a Channel</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getTarget(){
      return this.target;
   }
   
   /**
   *  <p>Indicates if this review is taken into account in the ratings statistics of the target.
   *  A review is per default used in the statistics, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.
   *  If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
   */
   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   /**
   *  <p>Number between -100 and 100 included.</p>
   */
   public Integer getRating(){
      return this.rating;
   }
   
   
   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }
   
   /**
   *  <p>The customer who created the review.</p>
   */
   public com.commercetools.api.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setUniquenessValue(final String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setAuthorName(final String authorName){
      this.authorName = authorName;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setText(final String text){
      this.text = text;
   }
   
   public void setTarget(final com.fasterxml.jackson.databind.JsonNode target){
      this.target = target;
   }
   
   public void setIncludedInStatistics(final Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setRating(final Integer rating){
      this.rating = rating;
   }
   
   public void setState(final com.commercetools.api.models.state.StateReference state){
      this.state = state;
   }
   
   public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
      this.customer = customer;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }

}
