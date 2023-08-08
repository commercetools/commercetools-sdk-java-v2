
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionType productSelectionType = ProductSelectionType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public interface ProductSelectionType {

    /**
     * factory method to create a deep copy of ProductSelectionType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionType deepCopy(@Nullable final ProductSelectionType template) {
        if (template == null) {
            return null;
        }
        ProductSelectionTypeImpl instance = new ProductSelectionTypeImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionType(Function<ProductSelectionType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionType>";
            }
        };
    }
}
