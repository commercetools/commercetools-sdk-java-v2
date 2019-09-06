package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetResultRange;
import com.commercetools.models.Product.FacetTypes;
import com.commercetools.models.Product.RangeFacetResultImpl;

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
@JsonDeserialize(as = RangeFacetResultImpl.class)
public interface RangeFacetResult extends FacetResult {

   
   @NotNull
   @Valid
   @JsonProperty("ranges")
   public List<FacetResultRange> getRanges();

   public void setRanges(final List<FacetResultRange> ranges);
   
   public static RangeFacetResultImpl of(){
      return new RangeFacetResultImpl();
   }
   

   public static RangeFacetResultImpl of(final RangeFacetResult template) {
      RangeFacetResultImpl instance = new RangeFacetResultImpl();
      instance.setRanges(template.getRanges());
      return instance;
   }

}