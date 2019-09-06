package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetTypes;
import java.lang.Long;
import com.commercetools.models.Product.FilteredFacetResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = FilteredFacetResultImpl.class)
public interface FilteredFacetResult extends FacetResult {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("productCount")
   public Long getProductCount();

   public void setCount(final Long count);
   
   public void setProductCount(final Long productCount);
   
   public static FilteredFacetResultImpl of(){
      return new FilteredFacetResultImpl();
   }
   

   public static FilteredFacetResultImpl of(final FilteredFacetResult template) {
      FilteredFacetResultImpl instance = new FilteredFacetResultImpl();
      instance.setCount(template.getCount());
      instance.setProductCount(template.getProductCount());
      return instance;
   }

}