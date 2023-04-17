
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizer
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestTokenizer suggestTokenizer = SuggestTokenizer.customBuilder()
 *             plusInputs(inputsBuilder -> inputsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.CustomTokenizerImpl.class, name = CustomTokenizer.CUSTOM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.WhitespaceTokenizerImpl.class, name = WhitespaceTokenizer.WHITESPACE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = SuggestTokenizerImpl.class, visible = true)
@JsonDeserialize(as = SuggestTokenizerImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SuggestTokenizer {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

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
        if (template instanceof com.commercetools.api.models.product.CustomTokenizer) {
            return com.commercetools.api.models.product.CustomTokenizer
                    .deepCopy((com.commercetools.api.models.product.CustomTokenizer) template);
        }
        if (template instanceof com.commercetools.api.models.product.WhitespaceTokenizer) {
            return com.commercetools.api.models.product.WhitespaceTokenizer
                    .deepCopy((com.commercetools.api.models.product.WhitespaceTokenizer) template);
        }
        SuggestTokenizerImpl instance = new SuggestTokenizerImpl();
        return instance;
    }

    /**
     * builder for custom subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.api.models.product.CustomTokenizerBuilder.of();
    }

    /**
     * builder for whitespace subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.api.models.product.WhitespaceTokenizerBuilder.of();
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
