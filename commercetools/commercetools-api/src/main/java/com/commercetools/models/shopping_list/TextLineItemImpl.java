package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class TextLineItemImpl implements TextLineItem {

   private java.time.ZonedDateTime addedAt;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.lang.String id;

   @JsonCreator
   TextLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("id") final java.lang.String id) {
      this.addedAt = addedAt;
      this.quantity = quantity;
      this.custom = custom;
      this.name = name;
      this.description = description;
      this.id = id;
   }
   public TextLineItemImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }

}