package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import javax.annotation.Generated;
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
public final class ProductDiscountChangeSortOrderActionImpl implements ProductDiscountChangeSortOrderAction {

   private String action;
   
   private String sortOrder;

   @JsonCreator
   ProductDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final String sortOrder) {
      this.sortOrder = sortOrder;
      this.action = "changeSortOrder";
   }
   public ProductDiscountChangeSortOrderActionImpl() {
      
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