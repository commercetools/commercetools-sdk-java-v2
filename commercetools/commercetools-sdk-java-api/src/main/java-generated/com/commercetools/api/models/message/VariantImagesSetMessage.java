
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
 *     VariantImagesSetMessage variantImagesSetMessage = VariantImagesSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .plusOldImages(oldImagesBuilder -> oldImagesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantImagesSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImagesSetMessageImpl.class)
public interface VariantImagesSetMessage extends Message {

    /**
     * discriminator value for VariantImagesSetMessage
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
     * @return instance of VariantImagesSetMessage
     */
    public static VariantImagesSetMessage of() {
        return new VariantImagesSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantImagesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImagesSetMessage of(final VariantImagesSetMessage template) {
        VariantImagesSetMessageImpl instance = new VariantImagesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setImages(template.getImages());
        instance.setOldImages(template.getOldImages());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantImagesSetMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantImagesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImagesSetMessage deepCopy(@Nullable final VariantImagesSetMessage template) {
        if (template == null) {
            return null;
        }
        VariantImagesSetMessageImpl instance = new VariantImagesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
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
     * builder factory method for VariantImagesSetMessage
     * @return builder
     */
    public static VariantImagesSetMessageBuilder builder() {
        return VariantImagesSetMessageBuilder.of();
    }

    /**
     * create builder for VariantImagesSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImagesSetMessageBuilder builder(final VariantImagesSetMessage template) {
        return VariantImagesSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImagesSetMessage(Function<VariantImagesSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImagesSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImagesSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImagesSetMessage>";
            }
        };
    }
}
