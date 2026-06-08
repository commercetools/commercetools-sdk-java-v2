
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetKeyAction productDiscountSetKeyAction = ProductDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetKeyActionImpl.class)
public interface ProductDiscountSetKeyAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountSetKeyAction
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
     * @return instance of ProductDiscountSetKeyAction
     */
    public static ProductDiscountSetKeyAction of() {
        return new ProductDiscountSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountSetKeyAction of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductDiscountSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountSetKeyAction deepCopy(@Nullable final ProductDiscountSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountSetKeyAction
     * @return builder
     */
    public static ProductDiscountSetKeyActionBuilder builder() {
        return ProductDiscountSetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetKeyActionBuilder builder(final ProductDiscountSetKeyAction template) {
        return ProductDiscountSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountSetKeyAction(Function<ProductDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductDiscountSetKeyAction ofUnset() {
        return ProductDiscountSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetKeyAction>";
            }
        };
    }
}
