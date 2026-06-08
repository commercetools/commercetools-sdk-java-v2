
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
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PatternComponentImpl.class)
public interface PatternComponent {

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
     * @return instance of PatternComponent
     */
    public static PatternComponent of() {
        return new PatternComponentImpl();
    }

    /**
     * factory method to create a shallow copy PatternComponent
     * @param template instance to be copied
     * @return copy instance
     */
    public static PatternComponent of(final PatternComponent template) {
        PatternComponentImpl instance = new PatternComponentImpl();
        instance.setType(template.getType());
        return instance;
    }

    public PatternComponent copyDeep();

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
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for PatternComponent
     * @return builder
     */
    public static PatternComponentBuilder builder() {
        return PatternComponentBuilder.of();
    }

    /**
     * create builder for PatternComponent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PatternComponentBuilder builder(final PatternComponent template) {
        return PatternComponentBuilder.of(template);
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
