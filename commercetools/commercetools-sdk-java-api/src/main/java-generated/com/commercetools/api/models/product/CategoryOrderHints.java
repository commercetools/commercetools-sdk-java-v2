
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>JSON object where the key is a Category <code>id</code> and the value is an order hint: a string representing a number between 0 and 1 that must start with <code>0.</code> and cannot end with <code>0</code>. Allows controlling the order of Products and how they appear in Categories. Products with no order hint have an order score below <code>0</code>. Order hints are non-unique. If a subset of Products have the same value for order hint in a specific category, the behavior is undetermined.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryOrderHintsImpl.class)
public interface CategoryOrderHints {

    public static CategoryOrderHints of() {
        return new CategoryOrderHintsImpl();
    }

    public static CategoryOrderHints of(final CategoryOrderHints template) {
        CategoryOrderHintsImpl instance = new CategoryOrderHintsImpl();
        return instance;
    }

    public static CategoryOrderHintsBuilder builder() {
        return CategoryOrderHintsBuilder.of();
    }

    public static CategoryOrderHintsBuilder builder(final CategoryOrderHints template) {
        return CategoryOrderHintsBuilder.of(template);
    }

    default <T> T withCategoryOrderHints(Function<CategoryOrderHints, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryOrderHints>";
            }
        };
    }
}
