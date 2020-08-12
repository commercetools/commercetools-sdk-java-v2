package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class CartDiscountSetCustomFieldActionImpl implements CartDiscountSetCustomFieldAction {

   private String action;
   
   private String name;
   
   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   CartDiscountSetCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.name = name;
      this.value = value;
      this.action = "setCustomField";
   }
   public CartDiscountSetCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   /**
   *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
   *  Trying to remove a field that does not exist will fail with an <code>InvalidOperation</code> error.
   *  If <code>value</code> is provided, set the <code>value</code> of the field defined by the <code>name</code>.
   *  The FieldDefinition determines the format for the <code>value</code> to be provided.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}
