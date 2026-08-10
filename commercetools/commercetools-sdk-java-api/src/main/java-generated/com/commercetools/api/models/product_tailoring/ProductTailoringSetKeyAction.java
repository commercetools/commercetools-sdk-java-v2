
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringKeySetMessage" rel="nofollow">ProductTailoringKeySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetKeyAction productTailoringSetKeyAction = ProductTailoringSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetKeyActionImpl.class)
public interface ProductTailoringSetKeyAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductTailoringSetKeyAction
     */
    public static ProductTailoringSetKeyAction of() {
        return new ProductTailoringSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetKeyAction of(final ProductTailoringSetKeyAction template) {
        ProductTailoringSetKeyActionImpl instance = new ProductTailoringSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductTailoringSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetKeyAction deepCopy(@Nullable final ProductTailoringSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetKeyActionImpl instance = new ProductTailoringSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetKeyAction
     * @return builder
     */
    public static ProductTailoringSetKeyActionBuilder builder() {
        return ProductTailoringSetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetKeyActionBuilder builder(final ProductTailoringSetKeyAction template) {
        return ProductTailoringSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetKeyAction(Function<ProductTailoringSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductTailoringSetKeyAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductTailoringSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetKeyAction>";
            }
        };
    }
}
