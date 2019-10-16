package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.FacetResultRange;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FacetResultRangeBuilder {
   
   
   private String toStr;
   
   
   private Long total;
   
   
   private Integer min;
   
   
   private String fromStr;
   
   
   private Integer max;
   
   
   private Integer mean;
   
   
   private Long count;
   
   
   private Integer from;
   
   
   private Integer to;
   
   @Nullable
   private Long productCount;
   
   public FacetResultRangeBuilder toStr( final String toStr) {
      this.toStr = toStr;
      return this;
   }
   
   public FacetResultRangeBuilder total( final Long total) {
      this.total = total;
      return this;
   }
   
   public FacetResultRangeBuilder min( final Integer min) {
      this.min = min;
      return this;
   }
   
   public FacetResultRangeBuilder fromStr( final String fromStr) {
      this.fromStr = fromStr;
      return this;
   }
   
   public FacetResultRangeBuilder max( final Integer max) {
      this.max = max;
      return this;
   }
   
   public FacetResultRangeBuilder mean( final Integer mean) {
      this.mean = mean;
      return this;
   }
   
   public FacetResultRangeBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public FacetResultRangeBuilder from( final Integer from) {
      this.from = from;
      return this;
   }
   
   public FacetResultRangeBuilder to( final Integer to) {
      this.to = to;
      return this;
   }
   
   public FacetResultRangeBuilder productCount(@Nullable final Long productCount) {
      this.productCount = productCount;
      return this;
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
   
   @Nullable
   public Long getProductCount(){
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