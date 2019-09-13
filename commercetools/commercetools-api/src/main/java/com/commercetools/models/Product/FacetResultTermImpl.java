package com.commercetools.models.product;

import java.lang.Long;
import java.lang.Object;
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
public final class FacetResultTermImpl implements FacetResultTerm {

   private java.lang.Long count;
   
   private java.lang.Object term;
   
   private java.lang.Long productCount;

   @JsonCreator
   FacetResultTermImpl(@JsonProperty("count") final java.lang.Long count, @JsonProperty("term") final java.lang.Object term, @JsonProperty("productCount") final java.lang.Long productCount) {
      this.count = count;
      this.term = term;
      this.productCount = productCount;
   }
   public FacetResultTermImpl() {
      
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.lang.Object getTerm(){
      return this.term;
   }
   
   
   public java.lang.Long getProductCount(){
      return this.productCount;
   }

   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setTerm(final java.lang.Object term){
      this.term = term;
   }
   
   public void setProductCount(final java.lang.Long productCount){
      this.productCount = productCount;
   }

}