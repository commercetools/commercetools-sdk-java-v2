package com.commercetools.models.product;

import com.commercetools.models.product.FacetResult;
import com.commercetools.models.product.FacetTypes;
import java.lang.Long;
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
public final class FilteredFacetResultImpl implements FilteredFacetResult {

   private com.commercetools.models.product.FacetTypes type;
   
   private java.lang.Long count;
   
   private java.lang.Long productCount;

   @JsonCreator
   FilteredFacetResultImpl(@JsonProperty("count") final java.lang.Long count, @JsonProperty("productCount") final java.lang.Long productCount) {
      this.count = count;
      this.productCount = productCount;
      this.type = FacetTypes.findEnumViaJsonName("filter").get();
   }
   public FilteredFacetResultImpl() {
      
   }
   
   
   public com.commercetools.models.product.FacetTypes getType(){
      return this.type;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.lang.Long getProductCount(){
      return this.productCount;
   }

   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setProductCount(final java.lang.Long productCount){
      this.productCount = productCount;
   }

}