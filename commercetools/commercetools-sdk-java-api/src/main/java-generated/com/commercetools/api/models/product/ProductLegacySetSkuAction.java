
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductLegacySetSkuAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductLegacySetSkuAction productLegacySetSkuAction = ProductLegacySetSkuAction.builder()
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductLegacySetSkuActionImpl.class)
public interface ProductLegacySetSkuAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductLegacySetSkuAction
     */
    String LEGACY_SET_SKU = "legacySetSku";

    /**
     *
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     * set sku
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     * factory method
     * @return instance of ProductLegacySetSkuAction
     */
    public static ProductLegacySetSkuAction of() {
        return new ProductLegacySetSkuActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductLegacySetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductLegacySetSkuAction of(final ProductLegacySetSkuAction template) {
        ProductLegacySetSkuActionImpl instance = new ProductLegacySetSkuActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductLegacySetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductLegacySetSkuAction deepCopy(@Nullable final ProductLegacySetSkuAction template) {
        if (template == null) {
            return null;
        }
        ProductLegacySetSkuActionImpl instance = new ProductLegacySetSkuActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    /**
     * builder factory method for ProductLegacySetSkuAction
     * @return builder
     */
    public static ProductLegacySetSkuActionBuilder builder() {
        return ProductLegacySetSkuActionBuilder.of();
    }

    /**
     * create builder for ProductLegacySetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductLegacySetSkuActionBuilder builder(final ProductLegacySetSkuAction template) {
        return ProductLegacySetSkuActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductLegacySetSkuAction(Function<ProductLegacySetSkuAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductLegacySetSkuAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductLegacySetSkuAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductLegacySetSkuAction>";
            }
        };
    }
}
