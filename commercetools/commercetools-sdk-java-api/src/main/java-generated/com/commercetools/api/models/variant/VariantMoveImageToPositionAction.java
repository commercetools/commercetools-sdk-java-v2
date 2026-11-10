
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Moves a Variant's image to a new position.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantMoveImageToPositionAction variantMoveImageToPositionAction = VariantMoveImageToPositionAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .position(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("moveImageToPosition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantMoveImageToPositionActionImpl.class)
public interface VariantMoveImageToPositionAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantMoveImageToPositionAction
     */
    String MOVE_IMAGE_TO_POSITION = "moveImageToPosition";

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
     * @return instance of VariantMoveImageToPositionAction
     */
    public static VariantMoveImageToPositionAction of() {
        return new VariantMoveImageToPositionActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantMoveImageToPositionAction of(final VariantMoveImageToPositionAction template) {
        VariantMoveImageToPositionActionImpl instance = new VariantMoveImageToPositionActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantMoveImageToPositionAction copyDeep();

    /**
     * factory method to create a deep copy of VariantMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantMoveImageToPositionAction deepCopy(@Nullable final VariantMoveImageToPositionAction template) {
        if (template == null) {
            return null;
        }
        VariantMoveImageToPositionActionImpl instance = new VariantMoveImageToPositionActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantMoveImageToPositionAction
     * @return builder
     */
    public static VariantMoveImageToPositionActionBuilder builder() {
        return VariantMoveImageToPositionActionBuilder.of();
    }

    /**
     * create builder for VariantMoveImageToPositionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantMoveImageToPositionActionBuilder builder(final VariantMoveImageToPositionAction template) {
        return VariantMoveImageToPositionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantMoveImageToPositionAction(Function<VariantMoveImageToPositionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantMoveImageToPositionAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantMoveImageToPositionAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantMoveImageToPositionAction>";
            }
        };
    }
}
