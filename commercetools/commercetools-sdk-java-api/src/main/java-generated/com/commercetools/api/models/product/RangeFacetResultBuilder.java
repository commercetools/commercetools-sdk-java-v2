package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetRange;
import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.RangeFacetResult;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RangeFacetResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RangeFacetResult rangeFacetResult = RangeFacetResult.builder()
 *             .plusRanges(rangesBuilder -> rangesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RangeFacetResultBuilder implements Builder<RangeFacetResult> {

    
    
    private java.util.List<com.commercetools.api.models.product.FacetRange> ranges;

    /**
     * set values to the ranges
     * @param ranges value to be set
     * @return Builder
     */
    
    public RangeFacetResultBuilder ranges( final com.commercetools.api.models.product.FacetRange ...ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
        return this;
    }
    
    /**
     * set value to the ranges
     * @param ranges value to be set
     * @return Builder
     */
    
    public RangeFacetResultBuilder ranges( final java.util.List<com.commercetools.api.models.product.FacetRange> ranges) {
        this.ranges = ranges;
        return this;
    }
    
    /**
     * add values to the ranges
     * @param ranges value to be set
     * @return Builder
     */
    
    public RangeFacetResultBuilder plusRanges( final com.commercetools.api.models.product.FacetRange ...ranges) {
        if (this.ranges == null) {
            this.ranges = new ArrayList<>();
        }
        this.ranges.addAll(Arrays.asList(ranges));
        return this;
    }
    
    
    
    /**
     * add the value to the ranges using the builder function
     * @param builder function to build the ranges value
     * @return Builder
     */
    
    public RangeFacetResultBuilder plusRanges(Function<com.commercetools.api.models.product.FacetRangeBuilder, com.commercetools.api.models.product.FacetRangeBuilder> builder) {
        if (this.ranges == null) {
            this.ranges = new ArrayList<>();
        }
        this.ranges.add(builder.apply(com.commercetools.api.models.product.FacetRangeBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the ranges using the builder function
     * @param builder function to build the ranges value
     * @return Builder
     */
    
    public RangeFacetResultBuilder withRanges(Function<com.commercetools.api.models.product.FacetRangeBuilder, com.commercetools.api.models.product.FacetRangeBuilder> builder) {
        this.ranges = new ArrayList<>();
        this.ranges.add(builder.apply(com.commercetools.api.models.product.FacetRangeBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the ranges using the builder function
     * @param builder function to build the ranges value
     * @return Builder
     */
    
    public RangeFacetResultBuilder addRanges(Function<com.commercetools.api.models.product.FacetRangeBuilder, com.commercetools.api.models.product.FacetRange> builder) {
        return plusRanges(builder.apply(com.commercetools.api.models.product.FacetRangeBuilder.of()));
    }
    
    /**
     * set the value to the ranges using the builder function
     * @param builder function to build the ranges value
     * @return Builder
     */
    
    public RangeFacetResultBuilder setRanges(Function<com.commercetools.api.models.product.FacetRangeBuilder, com.commercetools.api.models.product.FacetRange> builder) {
        return ranges(builder.apply(com.commercetools.api.models.product.FacetRangeBuilder.of()));
    }
                    

    /**
     * value of ranges}
     * @return ranges
     */
    
    
    public java.util.List<com.commercetools.api.models.product.FacetRange> getRanges(){
        return this.ranges;
    }

    /**
     * builds RangeFacetResult with checking for non-null required values
     * @return RangeFacetResult
     */
    public RangeFacetResult build() {
        Objects.requireNonNull(ranges, RangeFacetResult.class + ": ranges is missing");
        return new RangeFacetResultImpl(ranges);
    }
    
    /**
     * builds RangeFacetResult without checking for non-null required values
     * @return RangeFacetResult
     */
    public RangeFacetResult buildUnchecked() {
        return new RangeFacetResultImpl(ranges);
    }

    /**
     * factory method for an instance of RangeFacetResultBuilder
     * @return builder 
     */
    public static RangeFacetResultBuilder of() {
        return new RangeFacetResultBuilder();
    }

    /**
     * create builder for RangeFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RangeFacetResultBuilder of(final RangeFacetResult template) {
        RangeFacetResultBuilder builder = new RangeFacetResultBuilder();
        builder.ranges = template.getRanges();
        return builder;
    }

}
