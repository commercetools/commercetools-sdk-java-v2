package com.commercetools.models.Product;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FacetResultRangeImpl implements FacetResultRange {

   private java.lang.String toStr;
   
   private java.lang.Long total;
   
   private java.lang.Integer min;
   
   private java.lang.String fromStr;
   
   private java.lang.Integer max;
   
   private java.lang.Integer mean;
   
   private java.lang.Long count;
   
   private java.lang.Integer from;
   
   private java.lang.Integer to;
   
   private java.lang.Long productCount;

   @JsonCreator
   FacetResultRangeImpl(@JsonProperty("toStr") final java.lang.String toStr, @JsonProperty("total") final java.lang.Long total, @JsonProperty("min") final java.lang.Integer min, @JsonProperty("fromStr") final java.lang.String fromStr, @JsonProperty("max") final java.lang.Integer max, @JsonProperty("mean") final java.lang.Integer mean, @JsonProperty("count") final java.lang.Long count, @JsonProperty("from") final java.lang.Integer from, @JsonProperty("to") final java.lang.Integer to, @JsonProperty("productCount") final java.lang.Long productCount) {
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
   
   
   public java.lang.String getToStr(){
      return this.toStr;
   }
   
   
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.lang.Integer getMin(){
      return this.min;
   }
   
   
   public java.lang.String getFromStr(){
      return this.fromStr;
   }
   
   
   public java.lang.Integer getMax(){
      return this.max;
   }
   
   
   public java.lang.Integer getMean(){
      return this.mean;
   }
   
   
   public java.lang.Long getCount(){
      return this.count;
   }
   
   
   public java.lang.Integer getFrom(){
      return this.from;
   }
   
   
   public java.lang.Integer getTo(){
      return this.to;
   }
   
   
   public java.lang.Long getProductCount(){
      return this.productCount;
   }

   public void setToStr(final java.lang.String toStr){
      this.toStr = toStr;
   }
   
   public void setTotal(final java.lang.Long total){
      this.total = total;
   }
   
   public void setMin(final java.lang.Integer min){
      this.min = min;
   }
   
   public void setFromStr(final java.lang.String fromStr){
      this.fromStr = fromStr;
   }
   
   public void setMax(final java.lang.Integer max){
      this.max = max;
   }
   
   public void setMean(final java.lang.Integer mean){
      this.mean = mean;
   }
   
   public void setCount(final java.lang.Long count){
      this.count = count;
   }
   
   public void setFrom(final java.lang.Integer from){
      this.from = from;
   }
   
   public void setTo(final java.lang.Integer to){
      this.to = to;
   }
   
   public void setProductCount(final java.lang.Long productCount){
      this.productCount = productCount;
   }

}