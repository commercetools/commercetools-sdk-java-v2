
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the images of the Variant. Existing images will be replaced with the new ones. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantImagesSetMessage" rel="nofollow">VariantImagesSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetImagesAction variantSetImagesAction = VariantSetImagesAction.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setImages")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetImagesActionImpl.class)
public interface VariantSetImagesAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetImagesAction
     */
    String SET_IMAGES = "setImages";

    /**
     *  <p>Images to set for the Variant.</p>
     * @return images
     */
    @NotNull
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>If <code>true</code>, only the staged images are updated. If <code>false</code>, both the current and staged images are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Images to set for the Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images to set for the Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>If <code>true</code>, only the staged images are updated. If <code>false</code>, both the current and staged images are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSetImagesAction
     */
    public static VariantSetImagesAction of() {
        return new VariantSetImagesActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetImagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetImagesAction of(final VariantSetImagesAction template) {
        VariantSetImagesActionImpl instance = new VariantSetImagesActionImpl();
        instance.setImages(template.getImages());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSetImagesAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetImagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetImagesAction deepCopy(@Nullable final VariantSetImagesAction template) {
        if (template == null) {
            return null;
        }
        VariantSetImagesActionImpl instance = new VariantSetImagesActionImpl();
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSetImagesAction
     * @return builder
     */
    public static VariantSetImagesActionBuilder builder() {
        return VariantSetImagesActionBuilder.of();
    }

    /**
     * create builder for VariantSetImagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetImagesActionBuilder builder(final VariantSetImagesAction template) {
        return VariantSetImagesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetImagesAction(Function<VariantSetImagesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetImagesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetImagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetImagesAction>";
            }
        };
    }
}
