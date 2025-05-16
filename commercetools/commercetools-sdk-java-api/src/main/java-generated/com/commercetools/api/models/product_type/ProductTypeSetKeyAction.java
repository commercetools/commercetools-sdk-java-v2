
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetKeyAction productTypeSetKeyAction = ProductTypeSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetKeyActionImpl.class)
public interface ProductTypeSetKeyAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductTypeSetKeyAction
     */
    public static ProductTypeSetKeyAction of() {
        return new ProductTypeSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeSetKeyAction of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionImpl instance = new ProductTypeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductTypeSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeSetKeyAction deepCopy(@Nullable final ProductTypeSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeSetKeyActionImpl instance = new ProductTypeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductTypeSetKeyAction
     * @return builder
     */
    public static ProductTypeSetKeyActionBuilder builder() {
        return ProductTypeSetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductTypeSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetKeyActionBuilder builder(final ProductTypeSetKeyAction template) {
        return ProductTypeSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeSetKeyAction(Function<ProductTypeSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductTypeSetKeyAction ofUnset() {
        return ProductTypeSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeSetKeyAction>";
            }
        };
    }
}
