package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListLineItemDraft;
import com.commercetools.models.ShoppingList.TextLineItemDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
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
public final class ShoppingListDraftImpl implements ShoppingListDraft {

   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems;
   
   private java.lang.String anonymousId;
   
   private java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems;
   
   private java.lang.Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   private java.lang.String key;
   
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;

   @JsonCreator
   ShoppingListDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("textLineItems") final java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug, @JsonProperty("key") final java.lang.String key, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.lineItems = lineItems;
      this.anonymousId = anonymousId;
      this.textLineItems = textLineItems;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.name = name;
      this.description = description;
      this.slug = slug;
      this.key = key;
      this.customer = customer;
   }
   public ShoppingListDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }
   
   
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setLineItems(final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setTextLineItems(final java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems){
      this.textLineItems = textLineItems;
   }
   
   public void setDeleteDaysAfterLastModification(final java.lang.Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}