package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class ReviewDraftImpl implements ReviewDraft {

   private String uniquenessValue;
   
   private String authorName;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private Integer rating;
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   private String text;
   
   private String title;
   
   private String locale;
   
   private String key;
   
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   private Object target;

   @JsonCreator
   ReviewDraftImpl(@JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("authorName") final String authorName, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("rating") final Integer rating, @JsonProperty("state") final com.commercetools.api.generated.models.state.StateResourceIdentifier state, @JsonProperty("text") final String text, @JsonProperty("title") final String title, @JsonProperty("locale") final String locale, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer, @JsonProperty("target") final Object target) {
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
   public ReviewDraftImpl() {
      
   }
   
   /**
   *  <p>If set, this value must be unique among reviews.
   *  For example, if you want to have only one review per customer and per product, you can set the value to <code>customer's id</code> + <code>product's id</code>.</p>
   */
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public String getAuthorName(){
      return this.authorName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>Number between -100 and 100 included.
   *  Rating of the targeted object, like a product.
   *  This rating can represent the number of stars, or a percentage, or a like (+1)/dislike (-1)
   *  A rating is used in the ratings statistics of the targeted object, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
   */
   public Integer getRating(){
      return this.rating;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
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
   
   /**
   *  <p>User-specific unique identifier for the review.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>The customer who created the review.</p>
   */
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }
   
   /**
   *  <p>Identifies the target of the review.
   *  Can be a Product or a Channel</p>
   */
   public Object getTarget(){
      return this.target;
   }

   public void setUniquenessValue(final String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setAuthorName(final String authorName){
      this.authorName = authorName;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setRating(final Integer rating){
      this.rating = rating;
   }
   
   public void setState(final com.commercetools.api.generated.models.state.StateResourceIdentifier state){
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
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }
   
   public void setTarget(final Object target){
      this.target = target;
   }

}