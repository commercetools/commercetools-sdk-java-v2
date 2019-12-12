package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetKeyActionImpl implements ProductDiscountSetKeyAction {

   private String action;
   
   private String key;

   @JsonCreator
   ProductDiscountSetKeyActionImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.action = "setKey";
   }
   public ProductDiscountSetKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>The key to set.
   *  If you provide a <code>null</code> value or do not set this field at all, the existing <code>key</code> field is removed.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}