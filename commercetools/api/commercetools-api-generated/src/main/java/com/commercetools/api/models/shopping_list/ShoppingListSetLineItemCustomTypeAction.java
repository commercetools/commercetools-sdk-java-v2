package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListSetLineItemCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetLineItemCustomTypeAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setLineItemId(final String lineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static ShoppingListSetLineItemCustomTypeActionImpl of(){
      return new ShoppingListSetLineItemCustomTypeActionImpl();
   }
   

   public static ShoppingListSetLineItemCustomTypeActionImpl of(final ShoppingListSetLineItemCustomTypeAction template) {
      ShoppingListSetLineItemCustomTypeActionImpl instance = new ShoppingListSetLineItemCustomTypeActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setType(template.getType());
      instance.setFields(template.getFields());
      return instance;
   }

}
