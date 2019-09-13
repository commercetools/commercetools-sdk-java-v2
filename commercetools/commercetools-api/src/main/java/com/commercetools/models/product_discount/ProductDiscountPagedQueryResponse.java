package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscount;
import java.lang.Long;
import com.commercetools.models.product_discount.ProductDiscountPagedQueryResponseImpl;

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
@JsonDeserialize(as = ProductDiscountPagedQueryResponseImpl.class)
public interface ProductDiscountPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<ProductDiscount> getResults();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<ProductDiscount> results);
   
   public static ProductDiscountPagedQueryResponseImpl of(){
      return new ProductDiscountPagedQueryResponseImpl();
   }
   

   public static ProductDiscountPagedQueryResponseImpl of(final ProductDiscountPagedQueryResponse template) {
      ProductDiscountPagedQueryResponseImpl instance = new ProductDiscountPagedQueryResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setResults(template.getResults());
      return instance;
   }

}