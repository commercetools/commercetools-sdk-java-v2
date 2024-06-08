
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
 * CustomTokenizer
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomTokenizer customTokenizer = CustomTokenizer.builder()
 *             .plusInputs(inputsBuilder -> inputsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomTokenizerImpl.class)
public interface CustomTokenizer extends SuggestTokenizer {

    /**
     * discriminator value for CustomTokenizer
     */
    String CUSTOM = "custom";

    /**
     *
     * @return inputs
     */
    @NotNull
    @JsonProperty("inputs")
    public List<String> getInputs();

    /**
     * set inputs
     * @param inputs values to be set
     */

    @JsonIgnore
    public void setInputs(final String... inputs);

    /**
     * set inputs
     * @param inputs values to be set
     */

    public void setInputs(final List<String> inputs);

    /**
     * factory method
     * @return instance of CustomTokenizer
     */
    public static CustomTokenizer of() {
        return new CustomTokenizerImpl();
    }

    /**
     * factory method to create a shallow copy CustomTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomTokenizer of(final CustomTokenizer template) {
        CustomTokenizerImpl instance = new CustomTokenizerImpl();
        instance.setInputs(template.getInputs());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomTokenizer deepCopy(@Nullable final CustomTokenizer template) {
        if (template == null) {
            return null;
        }
        CustomTokenizerImpl instance = new CustomTokenizerImpl();
        instance.setInputs(Optional.ofNullable(template.getInputs()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomTokenizer
     * @return builder
     */
    public static CustomTokenizerBuilder builder() {
        return CustomTokenizerBuilder.of();
    }

    /**
     * create builder for CustomTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomTokenizerBuilder builder(final CustomTokenizer template) {
        return CustomTokenizerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomTokenizer(Function<CustomTokenizer, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<CustomTokenizer>";
            }
        };
    }
}
