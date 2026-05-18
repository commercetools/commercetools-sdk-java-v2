
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates both Product Discounts and Cart Discounts apply to a Cart and Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Stacking stacking = Stacking.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Stacking")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StackingImpl.class)
public interface Stacking extends DiscountTypeCombination {

    /**
     * discriminator value for Stacking
     */
    String STACKING = "Stacking";

    /**
     * factory method
     * @return instance of Stacking
     */
    public static Stacking of() {
        return new StackingImpl();
    }

    /**
     * factory method to create a shallow copy Stacking
     * @param template instance to be copied
     * @return copy instance
     */
    public static Stacking of(final Stacking template) {
        StackingImpl instance = new StackingImpl();
        return instance;
    }

    public Stacking copyDeep();

    /**
     * factory method to create a deep copy of Stacking
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Stacking deepCopy(@Nullable final Stacking template) {
        if (template == null) {
            return null;
        }
        StackingImpl instance = new StackingImpl();
        return instance;
    }

    /**
     * builder factory method for Stacking
     * @return builder
     */
    public static StackingBuilder builder() {
        return StackingBuilder.of();
    }

    /**
     * create builder for Stacking instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StackingBuilder builder(final Stacking template) {
        return StackingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStacking(Function<Stacking, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Stacking> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Stacking>() {
            @Override
            public String toString() {
                return "TypeReference<Stacking>";
            }
        };
    }
}
