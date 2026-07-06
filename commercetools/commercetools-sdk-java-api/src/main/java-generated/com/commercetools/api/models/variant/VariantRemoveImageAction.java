
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
 *  <p>Removes a Variant's image.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveImageAction variantRemoveImageAction = VariantRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeImage")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantRemoveImageActionImpl.class)
public interface VariantRemoveImageAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantRemoveImageAction
     */
    String REMOVE_IMAGE = "removeImage";

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
     * @return instance of VariantRemoveImageAction
     */
    public static VariantRemoveImageAction of() {
        return new VariantRemoveImageActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantRemoveImageAction of(final VariantRemoveImageAction template) {
        VariantRemoveImageActionImpl instance = new VariantRemoveImageActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantRemoveImageAction copyDeep();

    /**
     * factory method to create a deep copy of VariantRemoveImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantRemoveImageAction deepCopy(@Nullable final VariantRemoveImageAction template) {
        if (template == null) {
            return null;
        }
        VariantRemoveImageActionImpl instance = new VariantRemoveImageActionImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantRemoveImageAction
     * @return builder
     */
    public static VariantRemoveImageActionBuilder builder() {
        return VariantRemoveImageActionBuilder.of();
    }

    /**
     * create builder for VariantRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveImageActionBuilder builder(final VariantRemoveImageAction template) {
        return VariantRemoveImageActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantRemoveImageAction(Function<VariantRemoveImageAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantRemoveImageAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantRemoveImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantRemoveImageAction>";
            }
        };
    }
}
