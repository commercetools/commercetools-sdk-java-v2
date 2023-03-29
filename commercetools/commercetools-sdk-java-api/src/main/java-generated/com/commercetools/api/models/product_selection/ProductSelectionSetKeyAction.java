
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetKeyAction productSelectionSetKeyAction = ProductSelectionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetKeyActionImpl.class)
public interface ProductSelectionSetKeyAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductSelectionSetKeyAction
     */
    public static ProductSelectionSetKeyAction of() {
        return new ProductSelectionSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetKeyAction of(final ProductSelectionSetKeyAction template) {
        ProductSelectionSetKeyActionImpl instance = new ProductSelectionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetKeyAction deepCopy(@Nullable final ProductSelectionSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSetKeyActionImpl instance = new ProductSelectionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetKeyAction
     * @return builder
     */
    public static ProductSelectionSetKeyActionBuilder builder() {
        return ProductSelectionSetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetKeyActionBuilder builder(final ProductSelectionSetKeyAction template) {
        return ProductSelectionSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetKeyAction(Function<ProductSelectionSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSelectionSetKeyAction ofUnset() {
        return ProductSelectionSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetKeyAction>";
            }
        };
    }
}
