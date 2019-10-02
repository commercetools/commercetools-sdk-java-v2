package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
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
public final class CartRecalculateActionImpl implements CartRecalculateAction {

   private String action;
   
   private Boolean updateProductData;

   @JsonCreator
   CartRecalculateActionImpl(@JsonProperty("updateProductData") final Boolean updateProductData) {
      this.updateProductData = updateProductData;
      this.action = "recalculate";
   }
   public CartRecalculateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public void setUpdateProductData(final Boolean updateProductData){
      this.updateProductData = updateProductData;
   }

}