package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.CartSetDeleteDaysAfterLastModificationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface CartSetDeleteDaysAfterLastModificationAction extends CartUpdateAction {

   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Integer getDeleteDaysAfterLastModification();

   public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);
   
   public static CartSetDeleteDaysAfterLastModificationActionImpl of(){
      return new CartSetDeleteDaysAfterLastModificationActionImpl();
   }
   

   public static CartSetDeleteDaysAfterLastModificationActionImpl of(final CartSetDeleteDaysAfterLastModificationAction template) {
      CartSetDeleteDaysAfterLastModificationActionImpl instance = new CartSetDeleteDaysAfterLastModificationActionImpl();
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      return instance;
   }

}