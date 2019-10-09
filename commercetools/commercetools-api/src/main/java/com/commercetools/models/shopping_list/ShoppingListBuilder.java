package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.shopping_list.ShoppingListLineItem;
import com.commercetools.models.shopping_list.TextLineItem;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.shopping_list.ShoppingList;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItem> lineItems;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.shopping_list.TextLineItem> textLineItems;
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString slug;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public ShoppingListBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ShoppingListBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ShoppingListBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ShoppingListBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ShoppingListBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ShoppingListBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.shopping_list.ShoppingListLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public ShoppingListBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public ShoppingListBuilder textLineItems(@Nullable final java.util.List<com.commercetools.models.shopping_list.TextLineItem> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public ShoppingListBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public ShoppingListBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListBuilder slug(@Nullable final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ShoppingListBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ShoppingListBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
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
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.shopping_list.TextLineItem> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
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
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getCustomer(){
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