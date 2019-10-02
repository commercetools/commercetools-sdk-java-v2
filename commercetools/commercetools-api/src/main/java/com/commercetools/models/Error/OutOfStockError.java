package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.OutOfStockErrorImpl;

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
@JsonDeserialize(as = OutOfStockErrorImpl.class)
public interface OutOfStockError extends ErrorObject {

   
   @NotNull
   @JsonProperty("lineItems")
   public List<String> getLineItems();
   
   @NotNull
   @JsonProperty("skus")
   public List<String> getSkus();

   public void setLineItems(final List<String> lineItems);
   
   public void setSkus(final List<String> skus);
   
   public static OutOfStockErrorImpl of(){
      return new OutOfStockErrorImpl();
   }
   

   public static OutOfStockErrorImpl of(final OutOfStockError template) {
      OutOfStockErrorImpl instance = new OutOfStockErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setLineItems(template.getLineItems());
      instance.setSkus(template.getSkus());
      return instance;
   }

}