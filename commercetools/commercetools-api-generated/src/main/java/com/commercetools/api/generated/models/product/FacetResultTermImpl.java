package com.commercetools.api.generated.models.product;


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
public final class FacetResultTermImpl implements FacetResultTerm {

   private Long count;
   
   private Object term;
   
   private Long productCount;

   @JsonCreator
   FacetResultTermImpl(@JsonProperty("count") final Long count, @JsonProperty("term") final Object term, @JsonProperty("productCount") final Long productCount) {
      this.count = count;
      this.term = term;
      this.productCount = productCount;
   }
   public FacetResultTermImpl() {
      
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Object getTerm(){
      return this.term;
   }
   
   
   public Long getProductCount(){
      return this.productCount;
   }

   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setTerm(final Object term){
      this.term = term;
   }
   
   public void setProductCount(final Long productCount){
      this.productCount = productCount;
   }

}