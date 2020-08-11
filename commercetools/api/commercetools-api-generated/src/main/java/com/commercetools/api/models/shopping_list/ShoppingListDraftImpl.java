package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class ShoppingListDraftImpl implements ShoppingListDraft {

   private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;

   private String anonymousId;

   private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;

   private Long deleteDaysAfterLastModification;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private com.commercetools.api.models.common.LocalizedString name;

   private com.commercetools.api.models.common.LocalizedString description;

   private com.commercetools.api.models.common.LocalizedString slug;

   private String key;

   private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

   @JsonCreator
   ShoppingListDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
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


   public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }

   /**
   *  <p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }


   public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }

   /**
   *  <p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
   */
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }


   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   /**
   *  <p>Human-readable identifiers usually used as deep-link URL to the related shopping list.
   *  Each slug is unique across a project, but a shopping list can have the same slug for different languages.
   *  The slug must match the pattern [a-zA-Z0-9_-]{2,256}.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   /**
   *  <p>User-specific unique identifier for the shopping list.</p>
   */
   public String getKey(){
      return this.key;
   }


   public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setLineItems(final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }

   public void setTextLineItems(final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems){
      this.textLineItems = textLineItems;
   }

   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }

   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }

   public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
      this.slug = slug;
   }

   public void setKey(final String key){
      this.key = key;
   }

   public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}
