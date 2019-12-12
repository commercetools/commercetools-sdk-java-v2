package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.generated.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListDraftImpl implements MyShoppingListDraft {

   private java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> lineItems;
   
   private java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> textLineItems;
   
   private Long deleteDaysAfterLastModification;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;

   @JsonCreator
   MyShoppingListDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> lineItems, @JsonProperty("textLineItems") final java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> textLineItems, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.lineItems = lineItems;
      this.textLineItems = textLineItems;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.name = name;
      this.description = description;
   }
   public MyShoppingListDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> getTextLineItems(){
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
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setTextLineItems(final java.util.List<com.commercetools.api.generated.models.shopping_list.TextLineItemDraft> textLineItems){
      this.textLineItems = textLineItems;
   }
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }

}