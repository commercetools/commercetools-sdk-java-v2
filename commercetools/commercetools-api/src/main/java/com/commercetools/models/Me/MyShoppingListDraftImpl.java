package com.commercetools.models.Me;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListLineItemDraft;
import com.commercetools.models.ShoppingList.TextLineItemDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
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
public final class MyShoppingListDraftImpl implements MyShoppingListDraft {

   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems;
   
   private java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems;
   
   private java.lang.Long deleteDaysAfterLastModification;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;

   @JsonCreator
   MyShoppingListDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems, @JsonProperty("textLineItems") final java.util.List<com.commercetools.models.ShoppingList.TextLineItemDraft> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final java.lang.Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description) {
      this.lineItems = lineItems;
      this.textLineItems = textLineItems;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.name = name;
      this.description = description;
   }
   public MyShoppingListDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
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

   public void setLineItems(final java.util.List<com.commercetools.models.ShoppingList.ShoppingListLineItemDraft> lineItems){
      this.lineItems = lineItems;
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

}