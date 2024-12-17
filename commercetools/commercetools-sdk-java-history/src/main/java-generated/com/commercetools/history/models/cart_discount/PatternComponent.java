
package com.commercetools.history.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PatternComponent
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PatternComponent patternComponent = PatternComponent.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PatternComponent {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of PatternComponent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PatternComponent deepCopy(@Nullable final PatternComponent template) {
        if (template == null) {
            return null;
        }
        PatternComponentImpl instance = new PatternComponentImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPatternComponent(Function<PatternComponent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PatternComponent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PatternComponent>() {
            @Override
            public String toString() {
                return "TypeReference<PatternComponent>";
            }
        };
    }
}
