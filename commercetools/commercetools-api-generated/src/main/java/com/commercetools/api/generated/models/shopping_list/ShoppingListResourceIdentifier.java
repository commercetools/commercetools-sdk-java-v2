package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.shopping_list.ShoppingListResourceIdentifierImpl;

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
@JsonDeserialize(as = ShoppingListResourceIdentifierImpl.class)
public interface ShoppingListResourceIdentifier extends ResourceIdentifier {


   
   public static ShoppingListResourceIdentifierImpl of(){
      return new ShoppingListResourceIdentifierImpl();
   }
   

   public static ShoppingListResourceIdentifierImpl of(final ShoppingListResourceIdentifier template) {
      ShoppingListResourceIdentifierImpl instance = new ShoppingListResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}