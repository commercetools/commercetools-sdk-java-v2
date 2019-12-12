package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResults;
import com.commercetools.api.generated.models.product.ProductProjection;
import com.commercetools.api.generated.models.product.ProductProjectionPagedSearchResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ProductProjectionPagedSearchResponseImpl.class)
public interface ProductProjectionPagedSearchResponse  {

   
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
   public List<ProductProjection> getResults();
   
   @NotNull
   @Valid
   @JsonProperty("facets")
   public FacetResults getFacets();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<ProductProjection> results);
   
   public void setFacets(final FacetResults facets);
   
   public static ProductProjectionPagedSearchResponseImpl of(){
      return new ProductProjectionPagedSearchResponseImpl();
   }
   

   public static ProductProjectionPagedSearchResponseImpl of(final ProductProjectionPagedSearchResponse template) {
      ProductProjectionPagedSearchResponseImpl instance = new ProductProjectionPagedSearchResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setResults(template.getResults());
      instance.setFacets(template.getFacets());
      return instance;
   }

}