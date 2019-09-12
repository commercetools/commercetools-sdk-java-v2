package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.String;
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
public final class CartDiscountChangeSortOrderActionImpl implements CartDiscountChangeSortOrderAction {

   private java.lang.String action;
   
   private java.lang.String sortOrder;

   @JsonCreator
   CartDiscountChangeSortOrderActionImpl(@JsonProperty("sortOrder") final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      this.action = "changeSortOrder";
   }
   public CartDiscountChangeSortOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }

   public void setSortOrder(final java.lang.String sortOrder){
      this.sortOrder = sortOrder;
   }

}