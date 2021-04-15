
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.FilteredFacetResultImpl.class, name = FilteredFacetResult.FILTER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.RangeFacetResultImpl.class, name = RangeFacetResult.RANGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.TermFacetResultImpl.class, name = TermFacetResult.TERMS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = FacetResultImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FacetResult {

    @NotNull
    @JsonProperty("type")
    public FacetTypes getType();

    default <T> T withFacetResult(Function<FacetResult, T> helper) {
        return helper.apply(this);
    }
}
