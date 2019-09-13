package com.commercetools.models.product;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.FacetResultRangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = FacetResultRangeImpl.class)
public interface FacetResultRange  {

   
   @NotNull
   @JsonProperty("from")
   public Integer getFrom();
   
   @NotNull
   @JsonProperty("fromStr")
   public String getFromStr();
   
   @NotNull
   @JsonProperty("to")
   public Integer getTo();
   
   @NotNull
   @JsonProperty("toStr")
   public String getToStr();
   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("productCount")
   public Long getProductCount();
   
   @NotNull
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("min")
   public Integer getMin();
   
   @NotNull
   @JsonProperty("max")
   public Integer getMax();
   
   @NotNull
   @JsonProperty("mean")
   public Integer getMean();

   public void setFrom(final Integer from);
   
   public void setFromStr(final String fromStr);
   
   public void setTo(final Integer to);
   
   public void setToStr(final String toStr);
   
   public void setCount(final Long count);
   
   public void setProductCount(final Long productCount);
   
   public void setTotal(final Long total);
   
   public void setMin(final Integer min);
   
   public void setMax(final Integer max);
   
   public void setMean(final Integer mean);
   
   public static FacetResultRangeImpl of(){
      return new FacetResultRangeImpl();
   }
   

   public static FacetResultRangeImpl of(final FacetResultRange template) {
      FacetResultRangeImpl instance = new FacetResultRangeImpl();
      instance.setToStr(template.getToStr());
      instance.setTotal(template.getTotal());
      instance.setMin(template.getMin());
      instance.setFromStr(template.getFromStr());
      instance.setMax(template.getMax());
      instance.setMean(template.getMean());
      instance.setCount(template.getCount());
      instance.setFrom(template.getFrom());
      instance.setTo(template.getTo());
      instance.setProductCount(template.getProductCount());
      return instance;
   }

}