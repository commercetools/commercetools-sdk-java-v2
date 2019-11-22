package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
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
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private String id;

   @JsonCreator
   TextLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("quantity") final Integer quantity, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("id") final String id) {
      this.addedAt = addedAt;
      this.quantity = quantity;
      this.custom = custom;
      this.name = name;
      this.description = description;
      this.id = id;
   }
   public TextLineItemImpl() {
      
   }
   
   /**
   	<p>When the text line item was added to the shopping list.</p>
   */
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   /**
   	
   */
   public Integer getQuantity(){
      return this.quantity;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   	<p>The unique ID of this TextLineItem.</p>
   */
   public String getId(){
      return this.id;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setId(final String id){
      this.id = id;
   }

}