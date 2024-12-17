
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The pattern component it used to define a set of units based on some criteria. The criteria depends on the type of component used.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PatternComponent patternComponent = PatternComponent.countOnCustomLineItemUnitsBuilder()
 *             predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnitsImpl.class, name = CountOnCustomLineItemUnits.COUNT_ON_CUSTOM_LINE_ITEM_UNITS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CountOnLineItemUnitsImpl.class, name = CountOnLineItemUnits.COUNT_ON_LINE_ITEM_UNITS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = PatternComponentImpl.class, visible = true)
@JsonDeserialize(as = PatternComponentImpl.class)
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
        if (template instanceof com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnits) {
            return com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnits
                    .deepCopy((com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnits) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CountOnLineItemUnits) {
            return com.commercetools.api.models.cart_discount.CountOnLineItemUnits
                    .deepCopy((com.commercetools.api.models.cart_discount.CountOnLineItemUnits) template);
        }
        PatternComponentImpl instance = new PatternComponentImpl();
        return instance;
    }

    /**
     * builder for countOnCustomLineItemUnits subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnitsBuilder countOnCustomLineItemUnitsBuilder() {
        return com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnitsBuilder.of();
    }

    /**
     * builder for countOnLineItemUnits subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CountOnLineItemUnitsBuilder countOnLineItemUnitsBuilder() {
        return com.commercetools.api.models.cart_discount.CountOnLineItemUnitsBuilder.of();
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
