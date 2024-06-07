
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetKeyAction productSetKeyAction = ProductSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetKeyActionImpl.class)
public interface ProductSetKeyAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>To update a Product using the Import API, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>To update a Product using the Import API, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductSetKeyAction
     */
    public static ProductSetKeyAction of() {
        return new ProductSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetKeyAction of(final ProductSetKeyAction template) {
        ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetKeyAction deepCopy(@Nullable final ProductSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductSetKeyAction
     * @return builder
     */
    public static ProductSetKeyActionBuilder builder() {
        return ProductSetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetKeyActionBuilder builder(final ProductSetKeyAction template) {
        return ProductSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetKeyAction(Function<ProductSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetKeyAction ofUnset() {
        return ProductSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetKeyAction>";
            }
        };
    }
}
