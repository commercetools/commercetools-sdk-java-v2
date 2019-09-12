package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import com.commercetools.models.ProductDiscount.ProductDiscountValue;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeValueActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangeValueActionImpl.class)
public interface ProductDiscountChangeValueAction extends ProductDiscountUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public ProductDiscountValue getValue();

   public void setValue(final ProductDiscountValue value);
   
   public static ProductDiscountChangeValueActionImpl of(){
      return new ProductDiscountChangeValueActionImpl();
   }
   

   public static ProductDiscountChangeValueActionImpl of(final ProductDiscountChangeValueAction template) {
      ProductDiscountChangeValueActionImpl instance = new ProductDiscountChangeValueActionImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}