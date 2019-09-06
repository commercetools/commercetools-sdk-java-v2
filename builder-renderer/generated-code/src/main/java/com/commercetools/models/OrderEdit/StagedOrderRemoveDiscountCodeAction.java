package com.commercetools.models.OrderEdit;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderRemoveDiscountCodeActionImpl;

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
@JsonDeserialize(as = StagedOrderRemoveDiscountCodeActionImpl.class)
public interface StagedOrderRemoveDiscountCodeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static StagedOrderRemoveDiscountCodeActionImpl of(){
      return new StagedOrderRemoveDiscountCodeActionImpl();
   }
   

   public static StagedOrderRemoveDiscountCodeActionImpl of(final StagedOrderRemoveDiscountCodeAction template) {
      StagedOrderRemoveDiscountCodeActionImpl instance = new StagedOrderRemoveDiscountCodeActionImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}