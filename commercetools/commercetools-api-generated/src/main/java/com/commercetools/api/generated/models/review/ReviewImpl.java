package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.type.CustomFields;
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
public final class ReviewImpl implements Review {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private String uniquenessValue;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private Integer rating;
   
   private String title;
   
   private String locale;
   
   private Object target;
   
   private Boolean includedInStatistics;
   
   private String authorName;
   
   private com.commercetools.api.generated.models.state.StateReference state;
   
   private String text;
   
   private String key;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;

   @JsonCreator
   ReviewImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("rating") final Integer rating, @JsonProperty("title") final String title, @JsonProperty("locale") final String locale, @JsonProperty("target") final Object target, @JsonProperty("includedInStatistics") final Boolean includedInStatistics, @JsonProperty("authorName") final String authorName, @JsonProperty("state") final com.commercetools.api.generated.models.state.StateReference state, @JsonProperty("text") final String text, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.uniquenessValue = uniquenessValue;
      this.custom = custom;
      this.rating = rating;
      this.title = title;
      this.locale = locale;
      this.target = target;
      this.includedInStatistics = includedInStatistics;
      this.authorName = authorName;
      this.state = state;
      this.text = text;
      this.key = key;
      this.customer = customer;
   }
   public ReviewImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
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
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>Number between -100 and 100 included.</p>
   */
   public Integer getRating(){
      return this.rating;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   /**
   *  <p>Identifies the target of the review.
   *  Can be a Product or a Channel</p>
   */
   public Object getTarget(){
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
   
   
   public String getAuthorName(){
      return this.authorName;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public String getText(){
      return this.text;
   }
   
   /**
   *  <p>User-specific unique identifier for the review.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>The customer who created the review.</p>
   */
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
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
   
   public void setUniquenessValue(final String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setRating(final Integer rating){
      this.rating = rating;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setTarget(final Object target){
      this.target = target;
   }
   
   public void setIncludedInStatistics(final Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setAuthorName(final String authorName){
      this.authorName = authorName;
   }
   
   public void setState(final com.commercetools.api.generated.models.state.StateReference state){
      this.state = state;
   }
   
   public void setText(final String text){
      this.text = text;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}