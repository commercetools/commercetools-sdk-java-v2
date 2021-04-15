
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
    public List<FacetResultRange> getRanges();

    @JsonIgnore
    public void setRanges(final FacetResultRange... ranges);

    public void setRanges(final List<FacetResultRange> ranges);

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
}
