package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductRemovePriceActionImpl implements ProductRemovePriceAction {

   private String action;
   
   private Boolean staged;
   
   private String priceId;

   @JsonCreator
   ProductRemovePriceActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("priceId") final String priceId) {
      this.staged = staged;
      this.priceId = priceId;
      this.action = "removePrice";
   }
   public ProductRemovePriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   /**
   *  <p>ID of the <a href="#price">Price</a></p>
   */
   public String getPriceId(){
      return this.priceId;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }

}