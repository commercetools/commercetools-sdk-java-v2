
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantSetImagesAction" rel="nofollow">Set Images</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImagesSetMessagePayload variantImagesSetMessagePayload = VariantImagesSetMessagePayload.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .plusOldImages(oldImagesBuilder -> oldImagesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantImagesSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImagesSetMessagePayloadImpl.class)
public interface VariantImagesSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantImagesSetMessagePayload
     */
    String VARIANT_IMAGES_SET = "VariantImagesSet";

    /**
     *  <p>The images that were set on the Variant.</p>
     * @return images
     */
    @NotNull
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>The previous images of the Variant.</p>
     * @return oldImages
     */
    @NotNull
    @Valid
    @JsonProperty("oldImages")
    public List<Image> getOldImages();

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>The images that were set on the Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>The previous images of the Variant.</p>
     * @param oldImages values to be set
     */

    @JsonIgnore
    public void setOldImages(final Image... oldImages);

    /**
     *  <p>The previous images of the Variant.</p>
     * @param oldImages values to be set
     */

    public void setOldImages(final List<Image> oldImages);

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantImagesSetMessagePayload
     */
    public static VariantImagesSetMessagePayload of() {
        return new VariantImagesSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantImagesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImagesSetMessagePayload of(final VariantImagesSetMessagePayload template) {
        VariantImagesSetMessagePayloadImpl instance = new VariantImagesSetMessagePayloadImpl();
        instance.setImages(template.getImages());
        instance.setOldImages(template.getOldImages());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantImagesSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantImagesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImagesSetMessagePayload deepCopy(@Nullable final VariantImagesSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantImagesSetMessagePayloadImpl instance = new VariantImagesSetMessagePayloadImpl();
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldImages(Optional.ofNullable(template.getOldImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantImagesSetMessagePayload
     * @return builder
     */
    public static VariantImagesSetMessagePayloadBuilder builder() {
        return VariantImagesSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantImagesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImagesSetMessagePayloadBuilder builder(final VariantImagesSetMessagePayload template) {
        return VariantImagesSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImagesSetMessagePayload(Function<VariantImagesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImagesSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImagesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImagesSetMessagePayload>";
            }
        };
    }
}
