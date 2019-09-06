package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetResultRange;
import com.commercetools.models.Product.FacetTypes;
import com.commercetools.models.Product.RangeFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class RangeFacetResultBuilder {
   
   
   private java.util.List<com.commercetools.models.Product.FacetResultRange> ranges;
   
   public RangeFacetResultBuilder ranges( final java.util.List<com.commercetools.models.Product.FacetResultRange> ranges) {
      this.ranges = ranges;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Product.FacetResultRange> getRanges(){
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