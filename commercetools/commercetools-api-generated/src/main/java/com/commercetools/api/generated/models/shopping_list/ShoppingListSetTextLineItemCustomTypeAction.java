package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetTextLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetTextLineItemCustomTypeAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static ShoppingListSetTextLineItemCustomTypeActionImpl of(){
      return new ShoppingListSetTextLineItemCustomTypeActionImpl();
   }
   

   public static ShoppingListSetTextLineItemCustomTypeActionImpl of(final ShoppingListSetTextLineItemCustomTypeAction template) {
      ShoppingListSetTextLineItemCustomTypeActionImpl instance = new ShoppingListSetTextLineItemCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}