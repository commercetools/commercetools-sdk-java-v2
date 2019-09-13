package com.commercetools.models.review;

import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewDraftImpl implements ReviewDraft {

   private java.lang.String uniquenessValue;
   
   private java.lang.String authorName;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private java.lang.Integer rating;
   
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   private java.lang.String text;
   
   private java.lang.String title;
   
   private java.lang.String locale;
   
   private java.lang.String key;
   
   private com.commercetools.models.customer.CustomerResourceIdentifier customer;
   
   private java.lang.Object target;

   @JsonCreator
   ReviewDraftImpl(@JsonProperty("uniquenessValue") final java.lang.String uniquenessValue, @JsonProperty("authorName") final java.lang.String authorName, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("rating") final java.lang.Integer rating, @JsonProperty("state") final com.commercetools.models.state.StateResourceIdentifier state, @JsonProperty("text") final java.lang.String text, @JsonProperty("title") final java.lang.String title, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("key") final java.lang.String key, @JsonProperty("customer") final com.commercetools.models.customer.CustomerResourceIdentifier customer, @JsonProperty("target") final java.lang.Object target) {
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
   
   
   public java.lang.String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   
   public java.lang.String getAuthorName(){
      return this.authorName;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Integer getRating(){
      return this.rating;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getState(){
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
   
   
   public com.commercetools.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }
   
   
   public java.lang.Object getTarget(){
      return this.target;
   }

   public void setUniquenessValue(final java.lang.String uniquenessValue){
      this.uniquenessValue = uniquenessValue;
   }
   
   public void setAuthorName(final java.lang.String authorName){
      this.authorName = authorName;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setRating(final java.lang.Integer rating){
      this.rating = rating;
   }
   
   public void setState(final com.commercetools.models.state.StateResourceIdentifier state){
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
   
   public void setCustomer(final com.commercetools.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }
   
   public void setTarget(final java.lang.Object target){
      this.target = target;
   }

}