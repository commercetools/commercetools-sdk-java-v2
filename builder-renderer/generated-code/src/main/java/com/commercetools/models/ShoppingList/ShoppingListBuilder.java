package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.ShoppingList.ShoppingListLineItem;
import com.commercetools.models.ShoppingList.TextLineItem;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingList;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItem> lineItems;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.TextLineItem> textLineItems;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString slug;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public ShoppingListBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ShoppingListBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ShoppingListBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ShoppingListBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ShoppingListBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ShoppingListBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public ShoppingListBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public ShoppingListBuilder textLineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.TextLineItem> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public ShoppingListBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public ShoppingListBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListBuilder slug(@Nullable final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ShoppingListBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ShoppingListBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItem> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShoppingList.TextLineItem> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public ShoppingList build() {
       return new ShoppingListImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, lineItems, anonymousId, textLineItems, deleteDaysAfterLastModification, custom, name, description, slug, key, customer);
   }
   
   public static ShoppingListBuilder of() {
      return new ShoppingListBuilder();
   }
   
   public static ShoppingListBuilder of(final ShoppingList template) {
      ShoppingListBuilder builder = new ShoppingListBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.lineItems = template.getLineItems();
      builder.anonymousId = template.getAnonymousId();
      builder.textLineItems = template.getTextLineItems();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.slug = template.getSlug();
      builder.key = template.getKey();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}