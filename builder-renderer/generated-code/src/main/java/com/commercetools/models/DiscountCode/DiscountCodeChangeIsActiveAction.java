package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeChangeIsActiveActionImpl;

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
@JsonDeserialize(as = DiscountCodeChangeIsActiveActionImpl.class)
public interface DiscountCodeChangeIsActiveAction extends DiscountCodeUpdateAction {

   
   @NotNull
   @JsonProperty("isActive")
   public Boolean getIsActive();

   public void setIsActive(final Boolean isActive);
   
   public static DiscountCodeChangeIsActiveActionImpl of(){
      return new DiscountCodeChangeIsActiveActionImpl();
   }
   

   public static DiscountCodeChangeIsActiveActionImpl of(final DiscountCodeChangeIsActiveAction template) {
      DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
      instance.setIsActive(template.getIsActive());
      return instance;
   }

}