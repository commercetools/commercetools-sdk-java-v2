
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
 *  <p>Sets the label of a Variant's image.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetImageLabelAction variantSetImageLabelAction = VariantSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setImageLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetImageLabelActionImpl.class)
public interface VariantSetImageLabelAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetImageLabelAction
     */
    String SET_IMAGE_LABEL = "setImageLabel";

    /**
     *  <p>The URL of the image to set the label.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */

    @JsonProperty("label")
    public String getLabel();

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The URL of the image to set the label.</p>
     * @param imageUrl value to be set
     */

    public void setImageUrl(final String imageUrl);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     */

    public void setLabel(final String label);

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSetImageLabelAction
     */
    public static VariantSetImageLabelAction of() {
        return new VariantSetImageLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetImageLabelAction of(final VariantSetImageLabelAction template) {
        VariantSetImageLabelActionImpl instance = new VariantSetImageLabelActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSetImageLabelAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetImageLabelAction deepCopy(@Nullable final VariantSetImageLabelAction template) {
        if (template == null) {
            return null;
        }
        VariantSetImageLabelActionImpl instance = new VariantSetImageLabelActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSetImageLabelAction
     * @return builder
     */
    public static VariantSetImageLabelActionBuilder builder() {
        return VariantSetImageLabelActionBuilder.of();
    }

    /**
     * create builder for VariantSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetImageLabelActionBuilder builder(final VariantSetImageLabelAction template) {
        return VariantSetImageLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetImageLabelAction(Function<VariantSetImageLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetImageLabelAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetImageLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetImageLabelAction>";
            }
        };
    }
}
