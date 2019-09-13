package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionImpl;

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
@JsonDeserialize(as = ShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface ShoppingListSetDeleteDaysAfterLastModificationAction extends ShoppingListUpdateAction {

   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();

   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public static ShoppingListSetDeleteDaysAfterLastModificationActionImpl of(){
      return new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
   }
   

   public static ShoppingListSetDeleteDaysAfterLastModificationActionImpl of(final ShoppingListSetDeleteDaysAfterLastModificationAction template) {
      ShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new ShoppingListSetDeleteDaysAfterLastModificationActionImpl();
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      return instance;
   }

}