package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ShoppingList.ShoppingList;
import com.commercetools.models.ShoppingList.ShoppingListReferenceImpl;

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
@JsonDeserialize(as = ShoppingListReferenceImpl.class)
public interface ShoppingListReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public ShoppingList getObj();

   public void setObj(final ShoppingList obj);
   
   public static ShoppingListReferenceImpl of(){
      return new ShoppingListReferenceImpl();
   }
   

   public static ShoppingListReferenceImpl of(final ShoppingListReference template) {
      ShoppingListReferenceImpl instance = new ShoppingListReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}