
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. Produces the ProductTailoringImageAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringAddExternalImageAction productTailoringAddExternalImageAction = ProductTailoringAddExternalImageAction.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringAddExternalImageActionImpl.class)
public interface ProductTailoringAddExternalImageAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringAddExternalImageAction
     */
    String ADD_EXTERNAL_IMAGE = "addExternalImage";

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
     *  <p>Value to add to <code>images</code>.</p>
     * @return image
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
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
     *  <p>Value to add to <code>images</code>.</p>
     * @param image value to be set
     */

    public void setImage(final Image image);

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringAddExternalImageAction
     */
    public static ProductTailoringAddExternalImageAction of() {
        return new ProductTailoringAddExternalImageActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringAddExternalImageAction of(final ProductTailoringAddExternalImageAction template) {
        ProductTailoringAddExternalImageActionImpl instance = new ProductTailoringAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringAddExternalImageAction deepCopy(
            @Nullable final ProductTailoringAddExternalImageAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringAddExternalImageActionImpl instance = new ProductTailoringAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringAddExternalImageAction
     * @return builder
     */
    public static ProductTailoringAddExternalImageActionBuilder builder() {
        return ProductTailoringAddExternalImageActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringAddExternalImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAddExternalImageActionBuilder builder(
            final ProductTailoringAddExternalImageAction template) {
        return ProductTailoringAddExternalImageActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringAddExternalImageAction(
            Function<ProductTailoringAddExternalImageAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAddExternalImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAddExternalImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringAddExternalImageAction>";
            }
        };
    }
}
