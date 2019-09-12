package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListLineItemDraft;
import com.commercetools.models.ShoppingList.TextLineItemDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString slug;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;
   
   public ShoppingListDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public ShoppingListDraftBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public ShoppingListDraftBuilder textLineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public ShoppingListDraftBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public ShoppingListDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListDraftBuilder slug(@Nullable final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ShoppingListDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ShoppingListDraftBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
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
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public ShoppingListDraft build() {
       return new ShoppingListDraftImpl(lineItems, anonymousId, textLineItems, deleteDaysAfterLastModification, custom, name, description, slug, key, customer);
   }
   
   public static ShoppingListDraftBuilder of() {
      return new ShoppingListDraftBuilder();
   }
   
   public static ShoppingListDraftBuilder of(final ShoppingListDraft template) {
      ShoppingListDraftBuilder builder = new ShoppingListDraftBuilder();
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