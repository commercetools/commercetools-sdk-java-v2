package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResult;
import com.commercetools.api.generated.models.product.FacetResultRange;
import com.commercetools.api.generated.models.product.FacetTypes;
import com.commercetools.api.generated.models.product.RangeFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class RangeFacetResultBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> ranges;
   
   public RangeFacetResultBuilder ranges( final java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> ranges) {
      this.ranges = ranges;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.FacetResultRange> getRanges(){
      return this.ranges;
   }

   public RangeFacetResult build() {
       return new RangeFacetResultImpl(ranges);
   }
   
   public static RangeFacetResultBuilder of() {
      return new RangeFacetResultBuilder();
   }
   
   public static RangeFacetResultBuilder of(final RangeFacetResult template) {
      RangeFacetResultBuilder builder = new RangeFacetResultBuilder();
      builder.ranges = template.getRanges();
      return builder;
   }
   
}