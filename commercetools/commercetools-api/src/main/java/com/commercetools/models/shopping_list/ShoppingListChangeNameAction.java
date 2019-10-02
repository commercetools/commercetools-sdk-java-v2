package com.commercetools.models.shopping_list;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ShoppingListChangeNameActionImpl.class)
public interface ShoppingListChangeNameAction extends ShoppingListUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static ShoppingListChangeNameActionImpl of(){
      return new ShoppingListChangeNameActionImpl();
   }
   

   public static ShoppingListChangeNameActionImpl of(final ShoppingListChangeNameAction template) {
      ShoppingListChangeNameActionImpl instance = new ShoppingListChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}