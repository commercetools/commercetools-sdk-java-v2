
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductVariantKeyAction productSetProductVariantKeyAction = ProductSetProductVariantKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetProductVariantKeyActionImpl.class)
public interface ProductSetProductVariantKeyAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetProductVariantKeyAction
     */
    String SET_PRODUCT_VARIANT_KEY = "setProductVariantKey";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>true</code>, only the staged <code>key</code> is set. If <code>false</code>, both the current and staged <code>key</code> are set.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>If <code>true</code>, only the staged <code>key</code> is set. If <code>false</code>, both the current and staged <code>key</code> are set.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetProductVariantKeyAction
     */
    public static ProductSetProductVariantKeyAction of() {
        return new ProductSetProductVariantKeyActionImpl();
    }

    /**
     * factory method to copy an instance of ProductSetProductVariantKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetProductVariantKeyAction of(final ProductSetProductVariantKeyAction template) {
        ProductSetProductVariantKeyActionImpl instance = new ProductSetProductVariantKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetProductVariantKeyAction
     * @return builder
     */
    public static ProductSetProductVariantKeyActionBuilder builder() {
        return ProductSetProductVariantKeyActionBuilder.of();
    }

    /**
     * create builder for ProductSetProductVariantKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductVariantKeyActionBuilder builder(final ProductSetProductVariantKeyAction template) {
        return ProductSetProductVariantKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetProductVariantKeyAction(Function<ProductSetProductVariantKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductVariantKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductVariantKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductVariantKeyAction>";
            }
        };
    }
}
