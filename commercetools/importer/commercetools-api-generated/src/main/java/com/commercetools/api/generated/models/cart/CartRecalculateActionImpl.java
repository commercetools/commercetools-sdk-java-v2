package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
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
   
   /**
   *  <p>If set to <code>true</code>, the line item product data (<code>name</code>, <code>variant</code> and <code>productType</code>) will also be updated.
   *  If set to <code>false</code>,
   *  only the prices and tax rates of the line item will be updated.
   *  The updated price of a line item may not correspond to a price in <code>variant.prices</code> anymore.</p>
   */
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public void setUpdateProductData(final Boolean updateProductData){
      this.updateProductData = updateProductData;
   }

}