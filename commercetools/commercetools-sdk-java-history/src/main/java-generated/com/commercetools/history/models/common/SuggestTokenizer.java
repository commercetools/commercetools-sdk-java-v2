
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SuggestTokenizer
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestTokenizer suggestTokenizer = SuggestTokenizer.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SuggestTokenizerImpl.class)
public interface SuggestTokenizer {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * factory method
     * @return instance of SuggestTokenizer
     */
    public static SuggestTokenizer of() {
        return new SuggestTokenizerImpl();
    }

    /**
     * factory method to create a shallow copy SuggestTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    public static SuggestTokenizer of(final SuggestTokenizer template) {
        SuggestTokenizerImpl instance = new SuggestTokenizerImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * factory method to create a deep copy of SuggestTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SuggestTokenizer deepCopy(@Nullable final SuggestTokenizer template) {
        if (template == null) {
            return null;
        }
        SuggestTokenizerImpl instance = new SuggestTokenizerImpl();
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for SuggestTokenizer
     * @return builder
     */
    public static SuggestTokenizerBuilder builder() {
        return SuggestTokenizerBuilder.of();
    }

    /**
     * create builder for SuggestTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestTokenizerBuilder builder(final SuggestTokenizer template) {
        return SuggestTokenizerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSuggestTokenizer(Function<SuggestTokenizer, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SuggestTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SuggestTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<SuggestTokenizer>";
            }
        };
    }
}
