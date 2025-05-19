
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
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

    public SuggestTokenizer copyDeep();

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

        if (!(template instanceof SuggestTokenizerImpl)) {
            return template.copyDeep();
        }
        SuggestTokenizerImpl instance = new SuggestTokenizerImpl();
        return instance;
    }

    /**
     * builder for custom subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.products.CustomTokenizerBuilder customBuilder() {
        return com.commercetools.importapi.models.products.CustomTokenizerBuilder.of();
    }

    /**
     * builder for whitespace subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder whitespaceBuilder() {
        return com.commercetools.importapi.models.products.WhitespaceTokenizerBuilder.of();
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
