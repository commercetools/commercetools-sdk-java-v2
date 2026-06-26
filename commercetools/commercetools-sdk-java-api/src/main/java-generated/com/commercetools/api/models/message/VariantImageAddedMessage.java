
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantAddExternalImageAction" rel="nofollow">Add External Image</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImageAddedMessage variantImageAddedMessage = VariantImageAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantImageAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImageAddedMessageImpl.class)
public interface VariantImageAddedMessage extends Message {

    /**
     * discriminator value for VariantImageAddedMessage
     */
    String VARIANT_IMAGE_ADDED = "VariantImageAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @return image
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Image</a> that was added.</p>
     * @param image value to be set
     */

    public void setImage(final Image image);

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantImageAddedMessage
     */
    public static VariantImageAddedMessage of() {
        return new VariantImageAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImageAddedMessage of(final VariantImageAddedMessage template) {
        VariantImageAddedMessageImpl instance = new VariantImageAddedMessageImpl();
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
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantImageAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImageAddedMessage deepCopy(@Nullable final VariantImageAddedMessage template) {
        if (template == null) {
            return null;
        }
        VariantImageAddedMessageImpl instance = new VariantImageAddedMessageImpl();
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
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantImageAddedMessage
     * @return builder
     */
    public static VariantImageAddedMessageBuilder builder() {
        return VariantImageAddedMessageBuilder.of();
    }

    /**
     * create builder for VariantImageAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImageAddedMessageBuilder builder(final VariantImageAddedMessage template) {
        return VariantImageAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImageAddedMessage(Function<VariantImageAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImageAddedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImageAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImageAddedMessage>";
            }
        };
    }
}
