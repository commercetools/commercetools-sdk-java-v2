package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.shopping_list.ShoppingListLineItem;
import com.commercetools.models.shopping_list.TextLineItem;
import com.commercetools.models.type.CustomFields;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.shopping_list.MyShoppingList;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItem> lineItems;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.shopping_list.TextLineItem> textLineItems;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString slug;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public MyShoppingListBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MyShoppingListBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MyShoppingListBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public MyShoppingListBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public MyShoppingListBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public MyShoppingListBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public MyShoppingListBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyShoppingListBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyShoppingListBuilder textLineItems(@Nullable final java.util.List<com.commercetools.models.shopping_list.TextLineItem> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public MyShoppingListBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public MyShoppingListBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyShoppingListBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public MyShoppingListBuilder slug(@Nullable final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public MyShoppingListBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public MyShoppingListBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
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
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItem> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.shopping_list.TextLineItem> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public MyShoppingList build() {
       return new MyShoppingListImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, lineItems, anonymousId, textLineItems, deleteDaysAfterLastModification, custom, name, description, slug, key, customer);
   }
   
   public static MyShoppingListBuilder of() {
      return new MyShoppingListBuilder();
   }
   
   public static MyShoppingListBuilder of(final MyShoppingList template) {
      MyShoppingListBuilder builder = new MyShoppingListBuilder();
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