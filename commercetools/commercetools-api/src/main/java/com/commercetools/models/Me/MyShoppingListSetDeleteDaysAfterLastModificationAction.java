package com.commercetools.models.me;

import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListSetDeleteDaysAfterLastModificationActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyShoppingListSetDeleteDaysAfterLastModificationAction extends MyShoppingListUpdateAction {

   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();

   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public static MyShoppingListSetDeleteDaysAfterLastModificationActionImpl of(){
      return new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
   }
   

   public static MyShoppingListSetDeleteDaysAfterLastModificationActionImpl of(final MyShoppingListSetDeleteDaysAfterLastModificationAction template) {
      MyShoppingListSetDeleteDaysAfterLastModificationActionImpl instance = new MyShoppingListSetDeleteDaysAfterLastModificationActionImpl();
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      return instance;
   }

}