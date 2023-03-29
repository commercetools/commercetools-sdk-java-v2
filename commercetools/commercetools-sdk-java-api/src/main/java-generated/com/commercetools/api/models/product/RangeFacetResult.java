
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RangeFacetResult
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RangeFacetResultImpl.class)
public interface RangeFacetResult extends FacetResult {

    /**
     * discriminator value for RangeFacetResult
     */
    String RANGE = "range";

    /**
     *
     * @return ranges
     */
    @NotNull
    @Valid
    @JsonProperty("ranges")
    public List<FacetRange> getRanges();

    /**
     * set ranges
     * @param ranges values to be set
     */

    @JsonIgnore
    public void setRanges(final FacetRange... ranges);

    /**
     * set ranges
     * @param ranges values to be set
     */

    public void setRanges(final List<FacetRange> ranges);

    /**
     * factory method
     * @return instance of RangeFacetResult
     */
    public static RangeFacetResult of() {
        return new RangeFacetResultImpl();
    }

    /**
     * factory method to create a shallow copy RangeFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static RangeFacetResult of(final RangeFacetResult template) {
        RangeFacetResultImpl instance = new RangeFacetResultImpl();
        instance.setRanges(template.getRanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of RangeFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RangeFacetResult deepCopy(@Nullable final RangeFacetResult template) {
        if (template == null) {
            return null;
        }
        RangeFacetResultImpl instance = new RangeFacetResultImpl();
        instance.setRanges(Optional.ofNullable(template.getRanges())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.FacetRange::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RangeFacetResult
     * @return builder
     */
    public static RangeFacetResultBuilder builder() {
        return RangeFacetResultBuilder.of();
    }

    /**
     * create builder for RangeFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RangeFacetResultBuilder builder(final RangeFacetResult template) {
        return RangeFacetResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRangeFacetResult(Function<RangeFacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RangeFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RangeFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<RangeFacetResult>";
            }
        };
    }
}
