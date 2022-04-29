
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FilteredFacetResultImpl.class)
public interface FilteredFacetResult extends FacetResult {

    String FILTER = "filter";

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("productCount")
    public Long getProductCount();

    public void setCount(final Long count);

    public void setProductCount(final Long productCount);

    public static FilteredFacetResult of() {
        return new FilteredFacetResultImpl();
    }

    public static FilteredFacetResult of(final FilteredFacetResult template) {
        FilteredFacetResultImpl instance = new FilteredFacetResultImpl();
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public static FilteredFacetResultBuilder builder() {
        return FilteredFacetResultBuilder.of();
    }

    public static FilteredFacetResultBuilder builder(final FilteredFacetResult template) {
        return FilteredFacetResultBuilder.of(template);
    }

    default <T> T withFilteredFacetResult(Function<FilteredFacetResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FilteredFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FilteredFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<FilteredFacetResult>";
            }
        };
    }
}
