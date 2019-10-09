package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListSetDescriptionActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetDescriptionActionImpl.class)
public interface MyShoppingListSetDescriptionAction extends MyShoppingListUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static MyShoppingListSetDescriptionActionImpl of(){
      return new MyShoppingListSetDescriptionActionImpl();
   }
   

   public static MyShoppingListSetDescriptionActionImpl of(final MyShoppingListSetDescriptionAction template) {
      MyShoppingListSetDescriptionActionImpl instance = new MyShoppingListSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}