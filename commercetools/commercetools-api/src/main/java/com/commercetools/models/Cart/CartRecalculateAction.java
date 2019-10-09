package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.CartRecalculateActionImpl;

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
@JsonDeserialize(as = CartRecalculateActionImpl.class)
public interface CartRecalculateAction extends CartUpdateAction {

   
   
   @JsonProperty("updateProductData")
   public Boolean getUpdateProductData();

   public void setUpdateProductData(final Boolean updateProductData);
   
   public static CartRecalculateActionImpl of(){
      return new CartRecalculateActionImpl();
   }
   

   public static CartRecalculateActionImpl of(final CartRecalculateAction template) {
      CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
      instance.setUpdateProductData(template.getUpdateProductData());
      return instance;
   }

}