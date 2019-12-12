package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResult;
import com.commercetools.api.generated.models.product.FacetResultRange;
import com.commercetools.api.generated.models.product.FacetTypes;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class RangeFacetResultImpl implements RangeFacetResult {

   private com.commercetools.api.generated.models.product.FacetTypes type;
   
   private java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> ranges;

   @JsonCreator
   RangeFacetResultImpl(@JsonProperty("ranges") final java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> ranges) {
      this.ranges = ranges;
      this.type = FacetTypes.findEnumViaJsonName("range").get();
   }
   public RangeFacetResultImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.product.FacetTypes getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> getRanges(){
      return this.ranges;
   }

   public void setRanges(final java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> ranges){
      this.ranges = ranges;
   }

}