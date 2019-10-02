package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.models.product_discount.ProductDiscountChangeSortOrderActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangeSortOrderActionImpl.class)
public interface ProductDiscountChangeSortOrderAction extends ProductDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();

   public void setSortOrder(final String sortOrder);
   
   public static ProductDiscountChangeSortOrderActionImpl of(){
      return new ProductDiscountChangeSortOrderActionImpl();
   }
   

   public static ProductDiscountChangeSortOrderActionImpl of(final ProductDiscountChangeSortOrderAction template) {
      ProductDiscountChangeSortOrderActionImpl instance = new ProductDiscountChangeSortOrderActionImpl();
      instance.setSortOrder(template.getSortOrder());
      return instance;
   }

}