package com.commercetools.api.generated.models.product;


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
public final class FacetResultRangeImpl implements FacetResultRange {

   private String toStr;
   
   private Long total;
   
   private Integer min;
   
   private String fromStr;
   
   private Integer max;
   
   private Integer mean;
   
   private Long count;
   
   private Integer from;
   
   private Integer to;
   
   private Long productCount;

   @JsonCreator
   FacetResultRangeImpl(@JsonProperty("toStr") final String toStr, @JsonProperty("total") final Long total, @JsonProperty("min") final Integer min, @JsonProperty("fromStr") final String fromStr, @JsonProperty("max") final Integer max, @JsonProperty("mean") final Integer mean, @JsonProperty("count") final Long count, @JsonProperty("from") final Integer from, @JsonProperty("to") final Integer to, @JsonProperty("productCount") final Long productCount) {
      this.toStr = toStr;
      this.total = total;
      this.min = min;
      this.fromStr = fromStr;
      this.max = max;
      this.mean = mean;
      this.count = count;
      this.from = from;
      this.to = to;
      this.productCount = productCount;
   }
   public FacetResultRangeImpl() {
      
   }
   
   
   public String getToStr(){
      return this.toStr;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public Integer getMin(){
      return this.min;
   }
   
   
   public String getFromStr(){
      return this.fromStr;
   }
   
   
   public Integer getMax(){
      return this.max;
   }
   
   
   public Integer getMean(){
      return this.mean;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Integer getFrom(){
      return this.from;
   }
   
   
   public Integer getTo(){
      return this.to;
   }
   
   
   public Long getProductCount(){
      return this.productCount;
   }

   public void setToStr(final String toStr){
      this.toStr = toStr;
   }
   
   public void setTotal(final Long total){
      this.total = total;
   }
   
   public void setMin(final Integer min){
      this.min = min;
   }
   
   public void setFromStr(final String fromStr){
      this.fromStr = fromStr;
   }
   
   public void setMax(final Integer max){
      this.max = max;
   }
   
   public void setMean(final Integer mean){
      this.mean = mean;
   }
   
   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setFrom(final Integer from){
      this.from = from;
   }
   
   public void setTo(final Integer to){
      this.to = to;
   }
   
   public void setProductCount(final Long productCount){
      this.productCount = productCount;
   }

}