
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Adds an image to existing variant's images. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantImageAddedMessage" rel="nofollow">VariantImageAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAddExternalImageAction variantAddExternalImageAction = VariantAddExternalImageAction.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addExternalImage")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAddExternalImageActionImpl.class)
public interface VariantAddExternalImageAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantAddExternalImageAction
     */
    String ADD_EXTERNAL_IMAGE = "addExternalImage";

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
     * @return instance of VariantAddExternalImageAction
     */
    public static VariantAddExternalImageAction of() {
        return new VariantAddExternalImageActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAddExternalImageAction of(final VariantAddExternalImageAction template) {
        VariantAddExternalImageActionImpl instance = new VariantAddExternalImageActionImpl();
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantAddExternalImageAction copyDeep();

    /**
     * factory method to create a deep copy of VariantAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAddExternalImageAction deepCopy(@Nullable final VariantAddExternalImageAction template) {
        if (template == null) {
            return null;
        }
        VariantAddExternalImageActionImpl instance = new VariantAddExternalImageActionImpl();
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantAddExternalImageAction
     * @return builder
     */
    public static VariantAddExternalImageActionBuilder builder() {
        return VariantAddExternalImageActionBuilder.of();
    }

    /**
     * create builder for VariantAddExternalImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAddExternalImageActionBuilder builder(final VariantAddExternalImageAction template) {
        return VariantAddExternalImageActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAddExternalImageAction(Function<VariantAddExternalImageAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAddExternalImageAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAddExternalImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAddExternalImageAction>";
            }
        };
    }
}
