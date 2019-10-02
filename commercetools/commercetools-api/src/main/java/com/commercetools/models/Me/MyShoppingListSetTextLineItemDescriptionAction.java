package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyShoppingListUpdateAction;
import com.commercetools.models.me.MyShoppingListSetTextLineItemDescriptionActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface MyShoppingListSetTextLineItemDescriptionAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setDescription(final LocalizedString description);
   
   public static MyShoppingListSetTextLineItemDescriptionActionImpl of(){
      return new MyShoppingListSetTextLineItemDescriptionActionImpl();
   }
   

   public static MyShoppingListSetTextLineItemDescriptionActionImpl of(final MyShoppingListSetTextLineItemDescriptionAction template) {
      MyShoppingListSetTextLineItemDescriptionActionImpl instance = new MyShoppingListSetTextLineItemDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}