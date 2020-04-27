package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.ProductReference;
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
public final class MissingPricesImpl implements MissingPrices {

   private com.commercetools.api.ml.generated.models.common.ProductReference product;
   
   private Long variantId;

   @JsonCreator
   MissingPricesImpl(@JsonProperty("product") final com.commercetools.api.ml.generated.models.common.ProductReference product, @JsonProperty("variantId") final Long variantId) {
      this.product = product;
      this.variantId = variantId;
   }
   public MissingPricesImpl() {
      
   }
   
   
   public com.commercetools.api.ml.generated.models.common.ProductReference getProduct(){
      return this.product;
   }
   
   /**
   *  <p>Id of the <code>ProductVariant</code>.</p>
   */
   public Long getVariantId(){
      return this.variantId;
   }

   public void setProduct(final com.commercetools.api.ml.generated.models.common.ProductReference product){
      this.product = product;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }

}
