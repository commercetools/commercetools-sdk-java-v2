package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListAddTextLineItemActionImpl implements MyShoppingListAddTextLineItemAction {

   private String action;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private com.commercetools.api.models.common.LocalizedString description;
   
   private Long quantity;
   
   private java.time.ZonedDateTime addedAt;
   
   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   @JsonCreator
   MyShoppingListAddTextLineItemActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("quantity") final Long quantity, @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.name = name;
      this.description = description;
      this.quantity = quantity;
      this.addedAt = addedAt;
      this.custom = custom;
      this.action = "addTextLineItem";
   }
   public MyShoppingListAddTextLineItemActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

}
