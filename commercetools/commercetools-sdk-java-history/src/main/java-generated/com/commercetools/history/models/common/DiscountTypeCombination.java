
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * DiscountTypeCombination
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountTypeCombination discountTypeCombination = DiscountTypeCombination.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountTypeCombination {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public DiscountTypeCombination copyDeep();

    /**
     * factory method to create a deep copy of DiscountTypeCombination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountTypeCombination deepCopy(@Nullable final DiscountTypeCombination template) {
        if (template == null) {
            return null;
        }
        DiscountTypeCombinationImpl instance = new DiscountTypeCombinationImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountTypeCombination(Function<DiscountTypeCombination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountTypeCombination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountTypeCombination>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountTypeCombination>";
            }
        };
    }
}
