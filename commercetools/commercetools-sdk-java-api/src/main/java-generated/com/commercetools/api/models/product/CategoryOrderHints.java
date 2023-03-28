
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>JSON object where the key is a Category <code>id</code> and the value is an order hint. Allows controlling the order of Products and how they appear in Categories. Products with no order hint have an order score below <code>0</code>. Order hints are non-unique. If a subset of Products have the same value for order hint in a specific category, the behavior is undetermined.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
 *             ./[0-9].[0-9]*[1-9]/("{/[0-9].[0-9]*[1-9]/}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryOrderHintsImpl.class)
public interface CategoryOrderHints {

    /**
     *  <p>A string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    /**
     *  <p>A string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, String value);

    /**
     * factory method
     * @return instance of CategoryOrderHints
     */
    public static CategoryOrderHints of() {
        return new CategoryOrderHintsImpl();
    }

    /**
     * factory method to copy an instance of CategoryOrderHints
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryOrderHints of(final CategoryOrderHints template) {
        CategoryOrderHintsImpl instance = new CategoryOrderHintsImpl();
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for CategoryOrderHints
     * @return builder
     */
    public static CategoryOrderHintsBuilder builder() {
        return CategoryOrderHintsBuilder.of();
    }

    /**
     * create builder for CategoryOrderHints instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryOrderHintsBuilder builder(final CategoryOrderHints template) {
        return CategoryOrderHintsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryOrderHints(Function<CategoryOrderHints, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryOrderHints>";
            }
        };
    }
}
