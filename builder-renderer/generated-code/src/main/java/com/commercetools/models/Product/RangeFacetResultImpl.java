package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetResultRange;
import com.commercetools.models.Product.FacetTypes;
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
public final class RangeFacetResultImpl implements RangeFacetResult {

   private com.commercetools.models.Product.FacetTypes type;
   
   private java.util.List<com.commercetools.models.Product.FacetResultRange> ranges;

   @JsonCreator
   RangeFacetResultImpl(@JsonProperty("ranges") final java.util.List<com.commercetools.models.Product.FacetResultRange> ranges) {
      this.ranges = ranges;
      this.type = FacetTypes.findEnumViaJsonName("range").get();
   }
   public RangeFacetResultImpl() {
      
   }
   
   
   public com.commercetools.models.Product.FacetTypes getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.Product.FacetResultRange> getRanges(){
      return this.ranges;
   }

   public void setRanges(final java.util.List<com.commercetools.models.Product.FacetResultRange> ranges){
      this.ranges = ranges;
   }

}