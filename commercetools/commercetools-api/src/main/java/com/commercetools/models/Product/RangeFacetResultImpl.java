package com.commercetools.models.product;

import com.commercetools.models.product.FacetResult;
import com.commercetools.models.product.FacetResultRange;
import com.commercetools.models.product.FacetTypes;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class RangeFacetResultImpl implements RangeFacetResult {

   private com.commercetools.models.product.FacetTypes type;
   
   private java.util.List<com.commercetools.models.product.FacetResultRange> ranges;

   @JsonCreator
   RangeFacetResultImpl(@JsonProperty("ranges") final java.util.List<com.commercetools.models.product.FacetResultRange> ranges) {
      this.ranges = ranges;
      this.type = FacetTypes.findEnumViaJsonName("range").get();
   }
   public RangeFacetResultImpl() {
      
   }
   
   
   public com.commercetools.models.product.FacetTypes getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.product.FacetResultRange> getRanges(){
      return this.ranges;
   }

   public void setRanges(final java.util.List<com.commercetools.models.product.FacetResultRange> ranges){
      this.ranges = ranges;
   }

}