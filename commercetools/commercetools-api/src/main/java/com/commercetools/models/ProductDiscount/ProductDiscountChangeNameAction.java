package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeNameActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangeNameActionImpl.class)
public interface ProductDiscountChangeNameAction extends ProductDiscountUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static ProductDiscountChangeNameActionImpl of(){
      return new ProductDiscountChangeNameActionImpl();
   }
   

   public static ProductDiscountChangeNameActionImpl of(final ProductDiscountChangeNameAction template) {
      ProductDiscountChangeNameActionImpl instance = new ProductDiscountChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}