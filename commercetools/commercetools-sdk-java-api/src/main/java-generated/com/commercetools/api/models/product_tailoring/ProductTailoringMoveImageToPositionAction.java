
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
 *     ProductTailoringMoveImageToPositionAction productTailoringMoveImageToPositionAction = ProductTailoringMoveImageToPositionAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .position(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("moveImageToPosition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringMoveImageToPositionActionImpl.class)
public interface ProductTailoringMoveImageToPositionAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringMoveImageToPositionAction
     */
    String MOVE_IMAGE_TO_POSITION = "moveImageToPosition";

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
     *  <p>The URL of the image to update.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @return position
     */
    @NotNull
    @JsonProperty("position")
    public Long getPosition();

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
     *  <p>The URL of the image to update.</p>
     * @param imageUrl value to be set
     */

    public void setImageUrl(final String imageUrl);

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @param position value to be set
     */

    public void setPosition(final Long position);

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringMoveImageToPositionAction
     */
    public static ProductTailoringMoveImageToPositionAction of() {
        return new ProductTailoringMoveImageToPositionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringMoveImageToPositionAction of(
            final ProductTailoringMoveImageToPositionAction template) {
        ProductTailoringMoveImageToPositionActionImpl instance = new ProductTailoringMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringMoveImageToPositionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringMoveImageToPositionAction deepCopy(
            @Nullable final ProductTailoringMoveImageToPositionAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringMoveImageToPositionActionImpl instance = new ProductTailoringMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringMoveImageToPositionAction
     * @return builder
     */
    public static ProductTailoringMoveImageToPositionActionBuilder builder() {
        return ProductTailoringMoveImageToPositionActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringMoveImageToPositionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringMoveImageToPositionActionBuilder builder(
            final ProductTailoringMoveImageToPositionAction template) {
        return ProductTailoringMoveImageToPositionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringMoveImageToPositionAction(
            Function<ProductTailoringMoveImageToPositionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringMoveImageToPositionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringMoveImageToPositionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringMoveImageToPositionAction>";
            }
        };
    }
}
