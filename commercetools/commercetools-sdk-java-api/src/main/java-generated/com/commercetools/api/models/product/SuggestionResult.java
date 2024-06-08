
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SuggestionResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestionResult suggestionResult = SuggestionResult.builder()
 *             .plus/searchKeywords.[a-z]{2}(-[A-Z]{2})?/(/searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder -> /searchKeywords.[a-z]{2}(-[A-Z]{2})?/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SuggestionResultImpl.class)
public interface SuggestionResult {

    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<Suggestion>> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, List<Suggestion> value);

    /**
     * factory method
     * @return instance of SuggestionResult
     */
    public static SuggestionResult of() {
        return new SuggestionResultImpl();
    }

    /**
     * factory method to create a shallow copy SuggestionResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static SuggestionResult of(final SuggestionResult template) {
        SuggestionResultImpl instance = new SuggestionResultImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of SuggestionResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SuggestionResult deepCopy(@Nullable final SuggestionResult template) {
        if (template == null) {
            return null;
        }
        SuggestionResultImpl instance = new SuggestionResultImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for SuggestionResult
     * @return builder
     */
    public static SuggestionResultBuilder builder() {
        return SuggestionResultBuilder.of();
    }

    /**
     * create builder for SuggestionResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestionResultBuilder builder(final SuggestionResult template) {
        return SuggestionResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSuggestionResult(Function<SuggestionResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SuggestionResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SuggestionResult>() {
            @Override
            public String toString() {
                return "TypeReference<SuggestionResult>";
            }
        };
    }
}
