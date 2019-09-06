package com.commercetools.models.Product;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.FacetResultRange;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FacetResultRangeBuilder {
   
   
   private java.lang.String toStr;
   
   
   private java.lang.Long total;
   
   
   private java.lang.Integer min;
   
   
   private java.lang.String fromStr;
   
   
   private java.lang.Integer max;
   
   
   private java.lang.Integer mean;
   
   
   private java.lang.Long count;
   
   
   private java.lang.Integer from;
   
   
   private java.lang.Integer to;
   
   @Nullable
   private java.lang.Long productCount;
   
   public FacetResultRangeBuilder toStr( final java.lang.String toStr) {
      this.toStr = toStr;
      return this;
   }
   
   public FacetResultRangeBuilder total( final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public FacetResultRangeBuilder min( final java.lang.Integer min) {
      this.min = min;
      return this;
   }
   
   public FacetResultRangeBuilder fromStr( final java.lang.String fromStr) {
      this.fromStr = fromStr;
      return this;
   }
   
   public FacetResultRangeBuilder max( final java.lang.Integer max) {
      this.max = max;
      return this;
   }
   
   public FacetResultRangeBuilder mean( final java.lang.Integer mean) {
      this.mean = mean;
      return this;
   }
   
   public FacetResultRangeBuilder count( final java.lang.Long count) {
      this.count = count;
      return this;
   }
   
   public FacetResultRangeBuilder from( final java.lang.Integer from) {
      this.from = from;
      return this;
   }
   
   public FacetResultRangeBuilder to( final java.lang.Integer to) {
      this.to = to;
      return this;
   }
   
   public FacetResultRangeBuilder productCount(@Nullable final java.lang.Long productCount) {
      this.productCount = productCount;
      return this;
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
   
   @Nullable
   public java.lang.Long getProductCount(){
      return this.productCount;
   }

   public FacetResultRange build() {
       return new FacetResultRangeImpl(toStr, total, min, fromStr, max, mean, count, from, to, productCount);
   }
   
   public static FacetResultRangeBuilder of() {
      return new FacetResultRangeBuilder();
   }
   
   public static FacetResultRangeBuilder of(final FacetResultRange template) {
      FacetResultRangeBuilder builder = new FacetResultRangeBuilder();
      builder.toStr = template.getToStr();
      builder.total = template.getTotal();
      builder.min = template.getMin();
      builder.fromStr = template.getFromStr();
      builder.max = template.getMax();
      builder.mean = template.getMean();
      builder.count = template.getCount();
      builder.from = template.getFrom();
      builder.to = template.getTo();
      builder.productCount = template.getProductCount();
      return builder;
   }
   
}