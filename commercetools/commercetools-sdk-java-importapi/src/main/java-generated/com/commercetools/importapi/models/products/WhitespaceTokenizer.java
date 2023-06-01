package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SuggestTokenizer;
import com.commercetools.importapi.models.products.WhitespaceTokenizerImpl;

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
 * WhitespaceTokenizer
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     WhitespaceTokenizer whitespaceTokenizer = WhitespaceTokenizer.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = WhitespaceTokenizerImpl.class)
public interface WhitespaceTokenizer extends SuggestTokenizer {

    /**
     * discriminator value for WhitespaceTokenizer
     */
    String WHITESPACE = "whitespace";



    /**
     * factory method
     * @return instance of WhitespaceTokenizer
     */
    public static WhitespaceTokenizer of(){
        return new WhitespaceTokenizerImpl();
    }
    

    /**
     * factory method to create a shallow copy WhitespaceTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    public static WhitespaceTokenizer of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of WhitespaceTokenizer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static WhitespaceTokenizer deepCopy(@Nullable final WhitespaceTokenizer template) {
        if (template == null) {
            return null;
        }
        WhitespaceTokenizerImpl instance = new WhitespaceTokenizerImpl();
        return instance;
    }

    /**
     * builder factory method for WhitespaceTokenizer
     * @return builder
     */
    public static WhitespaceTokenizerBuilder builder() {
        return WhitespaceTokenizerBuilder.of();
    }
    
    /**
     * create builder for WhitespaceTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static WhitespaceTokenizerBuilder builder(final WhitespaceTokenizer template) {
        return WhitespaceTokenizerBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withWhitespaceTokenizer(Function<WhitespaceTokenizer, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<WhitespaceTokenizer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<WhitespaceTokenizer>() {
            @Override
            public String toString() {
                return "TypeReference<WhitespaceTokenizer>";
            }
        };
    }
}
