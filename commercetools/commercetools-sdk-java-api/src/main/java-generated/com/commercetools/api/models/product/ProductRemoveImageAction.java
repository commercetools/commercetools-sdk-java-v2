
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
 *  <p>Removes a Product image and deletes it from the Content Delivery Network (external images are not deleted). Deletion from the CDN is not instant, which means the image file itself will stay available for some time after the deletion. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveImageAction productRemoveImageAction = ProductRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveImageActionImpl.class)
public interface ProductRemoveImageAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRemoveImageAction
     */
    String REMOVE_IMAGE = "removeImage";

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
     *  <p>The URL of the image to remove.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
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
     *  <p>The URL of the image to remove.</p>
     * @param imageUrl value to be set
     */

    public void setImageUrl(final String imageUrl);

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductRemoveImageAction
     */
    public static ProductRemoveImageAction of() {
        return new ProductRemoveImageActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemoveImageAction of(final ProductRemoveImageAction template) {
        ProductRemoveImageActionImpl instance = new ProductRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemoveImageAction deepCopy(@Nullable final ProductRemoveImageAction template) {
        if (template == null) {
            return null;
        }
        ProductRemoveImageActionImpl instance = new ProductRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemoveImageAction
     * @return builder
     */
    public static ProductRemoveImageActionBuilder builder() {
        return ProductRemoveImageActionBuilder.of();
    }

    /**
     * create builder for ProductRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveImageActionBuilder builder(final ProductRemoveImageAction template) {
        return ProductRemoveImageActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemoveImageAction(Function<ProductRemoveImageAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveImageAction>";
            }
        };
    }
}
