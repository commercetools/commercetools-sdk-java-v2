package com.commercetools.api.models.product;


import com.commercetools.api.models.product.SuggestionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * Suggestion
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Suggestion suggestion = Suggestion.builder()
 *             .text("{text}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SuggestionImpl.class)
public interface Suggestion  {


    /**
     *  <p>The suggested text.</p>
     * @return text
     */
    @NotNull
    @JsonProperty("text")
    public String getText();

    /**
     *  <p>The suggested text.</p>
     * @param text value to be set
     */
    
    public void setText(final String text);
    

    /**
     * factory method
     * @return instance of Suggestion
     */
    public static Suggestion of(){
        return new SuggestionImpl();
    }
    

    /**
     * factory method to create a shallow copy Suggestion
     * @param template instance to be copied
     * @return copy instance
     */
    public static Suggestion of(final Suggestion template) {
        SuggestionImpl instance = new SuggestionImpl();
        instance.setText(template.getText());
        return instance;
    }

    /**
     * factory method to create a deep copy of Suggestion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Suggestion deepCopy(@Nullable final Suggestion template) {
        if (template == null) {
            return null;
        }
        SuggestionImpl instance = new SuggestionImpl();
        instance.setText(template.getText());
        return instance;
    }

    /**
     * builder factory method for Suggestion
     * @return builder
     */
    public static SuggestionBuilder builder() {
        return SuggestionBuilder.of();
    }
    
    /**
     * create builder for Suggestion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestionBuilder builder(final Suggestion template) {
        return SuggestionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSuggestion(Function<Suggestion, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Suggestion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Suggestion>() {
            @Override
            public String toString() {
                return "TypeReference<Suggestion>";
            }
        };
    }
}
