package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.generated.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.me.MyShoppingListDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> lineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> textLineItems;
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public MyShoppingListDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyShoppingListDraftBuilder textLineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> textLineItems) {
      this.textLineItems = textLineItems;
      return this;
   }
   
   public MyShoppingListDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public MyShoppingListDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyShoppingListDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public MyShoppingListDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> getTextLineItems(){
      return this.textLineItems;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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