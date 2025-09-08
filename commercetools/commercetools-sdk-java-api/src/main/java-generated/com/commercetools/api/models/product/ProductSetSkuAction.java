
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>SKU cannot be changed or removed if it is associated with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>. If the SKU to set or unset is part of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAssignment" rel="nofollow">ProductSelectionAssignment</a> it will be automatically added or removed from the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantSelection" rel="nofollow">ProductVariantSelection</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSkuAction productSetSkuAction = ProductSetSkuAction.builder()
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSku")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetSkuActionImpl.class)
public interface ProductSetSkuAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetSkuAction
     */
    String SET_SKU = "setSku";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
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
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetSkuAction
     */
    public static ProductSetSkuAction of() {
        return new ProductSetSkuActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetSkuAction of(final ProductSetSkuAction template) {
        ProductSetSkuActionImpl instance = new ProductSetSkuActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductSetSkuAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetSkuAction deepCopy(@Nullable final ProductSetSkuAction template) {
        if (template == null) {
            return null;
        }
        ProductSetSkuActionImpl instance = new ProductSetSkuActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetSkuAction
     * @return builder
     */
    public static ProductSetSkuActionBuilder builder() {
        return ProductSetSkuActionBuilder.of();
    }

    /**
     * create builder for ProductSetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSkuActionBuilder builder(final ProductSetSkuAction template) {
        return ProductSetSkuActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetSkuAction(Function<ProductSetSkuAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSkuAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSkuAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSkuAction>";
            }
        };
    }
}
