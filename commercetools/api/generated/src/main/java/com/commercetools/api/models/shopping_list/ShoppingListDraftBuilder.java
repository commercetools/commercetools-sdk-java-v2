package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems;
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString slug;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
   
   public ShoppingListDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public ShoppingListDraftBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public ShoppingListDraftBuilder textLineItems(@Nullable final java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public ShoppingListDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public ShoppingListDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ShoppingListDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ShoppingListDraftBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ShoppingListDraftBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   public ShoppingListDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ShoppingListDraftBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.shopping_list.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
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
