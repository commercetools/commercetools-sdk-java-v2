
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
@JsonDeserialize(as = FacetResultImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FacetResult {

    @NotNull
    @JsonProperty("type")
    public FacetTypes getType();

    public static com.commercetools.api.models.product.FilteredFacetResultBuilder filterBuilder() {
        return com.commercetools.api.models.product.FilteredFacetResultBuilder.of();
    }

    public static com.commercetools.api.models.product.RangeFacetResultBuilder rangeBuilder() {
        return com.commercetools.api.models.product.RangeFacetResultBuilder.of();
    }

    public static com.commercetools.api.models.product.TermFacetResultBuilder termsBuilder() {
        return com.commercetools.api.models.product.TermFacetResultBuilder.of();
    }

    default <T> T withFacetResult(Function<FacetResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<FacetResult>";
            }
        };
    }
}
