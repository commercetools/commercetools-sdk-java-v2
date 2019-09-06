package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Boolean;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRecalculateActionImpl implements CartRecalculateAction {

   private java.lang.String action;
   
   private java.lang.Boolean updateProductData;

   @JsonCreator
   CartRecalculateActionImpl(@JsonProperty("updateProductData") final java.lang.Boolean updateProductData) {
      this.updateProductData = updateProductData;
      this.action = "recalculate";
   }
   public CartRecalculateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public void setUpdateProductData(final java.lang.Boolean updateProductData){
      this.updateProductData = updateProductData;
   }

}