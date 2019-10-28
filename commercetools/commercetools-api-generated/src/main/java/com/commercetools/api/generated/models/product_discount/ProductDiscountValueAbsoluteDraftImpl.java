package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
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
public final class ProductDiscountValueAbsoluteDraftImpl implements ProductDiscountValueAbsoluteDraft {

   private String type;
   
   private java.util.List<com.commercetools.api.generated.models.common.Money> money;

   @JsonCreator
   ProductDiscountValueAbsoluteDraftImpl(@JsonProperty("money") final java.util.List<com.commercetools.api.generated.models.common.Money> money) {
      this.money = money;
      this.type = "absolute";
   }
   public ProductDiscountValueAbsoluteDraftImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Money> getMoney(){
      return this.money;
   }

   public void setMoney(final java.util.List<com.commercetools.api.generated.models.common.Money> money){
      this.money = money;
   }

}