package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountChangeSortOrderActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeSortOrderActionImpl.class)
public interface CartDiscountChangeSortOrderAction extends CartDiscountUpdateAction {

   
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();

   public void setSortOrder(final String sortOrder);
   
   public static CartDiscountChangeSortOrderActionImpl of(){
      return new CartDiscountChangeSortOrderActionImpl();
   }
   

   public static CartDiscountChangeSortOrderActionImpl of(final CartDiscountChangeSortOrderAction template) {
      CartDiscountChangeSortOrderActionImpl instance = new CartDiscountChangeSortOrderActionImpl();
      instance.setSortOrder(template.getSortOrder());
      return instance;
   }

}