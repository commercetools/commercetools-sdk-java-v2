package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListLineItemDraft;
import com.commercetools.models.ShoppingList.TextLineItemDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import com.commercetools.models.Me.MyShoppingListDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public MyShoppingListDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyShoppingListDraftBuilder textLineItems(@Nullable final java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public MyShoppingListDraftBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public MyShoppingListDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyShoppingListDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
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

   public MyShoppingListDraft build() {
       return new MyShoppingListDraftImpl(lineItems, textLineItems, deleteDaysAfterLastModification, custom, name, description);
   }
   
   public static MyShoppingListDraftBuilder of() {
      return new MyShoppingListDraftBuilder();
   }
   
   public static MyShoppingListDraftBuilder of(final MyShoppingListDraft template) {
      MyShoppingListDraftBuilder builder = new MyShoppingListDraftBuilder();
      builder.lineItems = template.getLineItems();
      builder.textLineItems = template.getTextLineItems();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      return builder;
   }
   
}