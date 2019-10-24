package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountChangeSortOrderActionImpl implements CartDiscountChangeSortOrderAction {

   private String action;
   
   private String sortOrder;

   @JsonCreator
   CartDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
      this.sortOrder = sortOrder;
      this.action = "changeSortOrder";
   }
   public CartDiscountChangeSortOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getSortOrder(){
      return this.sortOrder;
   }

   public void setSortOrder(final String sortOrder){
      this.sortOrder = sortOrder;
   }

}