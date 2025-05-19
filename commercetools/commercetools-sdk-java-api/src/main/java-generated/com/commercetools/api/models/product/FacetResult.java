
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * FacetResult
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetResult facetResult = FacetResult.filterBuilder()
 *             count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = FacetResultImpl.class, visible = true)
@JsonDeserialize(as = FacetResultImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface FacetResult {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public FacetTypes getType();

    public FacetResult copyDeep();

    /**
     * factory method to create a deep copy of FacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FacetResult deepCopy(@Nullable final FacetResult template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof FacetResultImpl)) {
            return template.copyDeep();
        }
        FacetResultImpl instance = new FacetResultImpl();
        return instance;
    }

    /**
     * builder for filter subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.FilteredFacetResultBuilder filterBuilder() {
        return com.commercetools.api.models.product.FilteredFacetResultBuilder.of();
    }

    /**
     * builder for range subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.RangeFacetResultBuilder rangeBuilder() {
        return com.commercetools.api.models.product.RangeFacetResultBuilder.of();
    }

    /**
     * builder for terms subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.TermFacetResultBuilder termsBuilder() {
        return com.commercetools.api.models.product.TermFacetResultBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFacetResult(Function<FacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<FacetResult>";
            }
        };
    }
}
