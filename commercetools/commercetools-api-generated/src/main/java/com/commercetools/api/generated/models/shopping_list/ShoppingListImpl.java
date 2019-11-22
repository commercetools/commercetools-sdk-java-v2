package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem;
import com.commercetools.api.generated.models.shopping_list.TextLineItem;
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
public final class ShoppingListImpl implements ShoppingList {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private String anonymousId;
   
   private java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItem> textLineItems;
   
   private Long deleteDaysAfterLastModification;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem> lineItems;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   private String key;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;

   @JsonCreator
   ShoppingListImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItem> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem> lineItems, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.api.generated.models.common.LocalizedString slug, @JsonProperty("key") final String key, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.anonymousId = anonymousId;
      this.textLineItems = textLineItems;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.description = description;
      this.lineItems = lineItems;
      this.name = name;
      this.slug = slug;
      this.key = key;
      this.customer = customer;
   }
   public ShoppingListImpl() {
      
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   	<p>The unique ID of the shopping list.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	<p>The current version of the shopping list.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	<p>Identifies shopping lists belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItem> getTextLineItems(){
      return this.textLineItems;
   }
   
   /**
   	<p>The shopping list will be deleted automatically if it hasn't been modified for the specified amount of days.</p>
   */
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem> getLineItems(){
      return this.lineItems;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   	<p>Human-readable identifiers usually used as deep-link URL to the related shopping list.
   	Each slug is unique across a project, but a shopping list can have the same slug for different languages.
   	The slug must match the pattern {{ site.data.api-limits.slugPattern }}.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   /**
   	<p>User-specific unique identifier for the shopping list.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   	
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
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setTextLineItems(final java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItem> textLineItems){
      this.textLineItems = textLineItems;
   }
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItem> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final com.commercetools.api.generated.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}