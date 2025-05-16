
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveImageAction productTailoringRemoveImageAction = ProductTailoringRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeImage")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringRemoveImageActionImpl.class)
public interface ProductTailoringRemoveImageAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringRemoveImageAction
     */
    String REMOVE_IMAGE = "removeImage";

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
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
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
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
     * @return instance of ProductTailoringRemoveImageAction
     */
    public static ProductTailoringRemoveImageAction of() {
        return new ProductTailoringRemoveImageActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringRemoveImageAction of(final ProductTailoringRemoveImageAction template) {
        ProductTailoringRemoveImageActionImpl instance = new ProductTailoringRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringRemoveImageAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringRemoveImageAction deepCopy(
            @Nullable final ProductTailoringRemoveImageAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringRemoveImageActionImpl instance = new ProductTailoringRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringRemoveImageAction
     * @return builder
     */
    public static ProductTailoringRemoveImageActionBuilder builder() {
        return ProductTailoringRemoveImageActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveImageActionBuilder builder(final ProductTailoringRemoveImageAction template) {
        return ProductTailoringRemoveImageActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringRemoveImageAction(Function<ProductTailoringRemoveImageAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringRemoveImageAction>";
            }
        };
    }
}
