
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RangeFacetResultImpl.class)
public interface RangeFacetResult extends FacetResult {

    String RANGE = "range";

    @NotNull
    @Valid
    @JsonProperty("ranges")
    public List<FacetRange> getRanges();

    @JsonIgnore
    public void setRanges(final FacetRange... ranges);

    public void setRanges(final List<FacetRange> ranges);

    public static RangeFacetResult of() {
        return new RangeFacetResultImpl();
    }

    public static RangeFacetResult of(final RangeFacetResult template) {
        RangeFacetResultImpl instance = new RangeFacetResultImpl();
        instance.setRanges(template.getRanges());
        return instance;
    }

    public static RangeFacetResultBuilder builder() {
        return RangeFacetResultBuilder.of();
    }

    public static RangeFacetResultBuilder builder(final RangeFacetResult template) {
        return RangeFacetResultBuilder.of(template);
    }

    default <T> T withRangeFacetResult(Function<RangeFacetResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RangeFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RangeFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<RangeFacetResult>";
            }
        };
    }
}
