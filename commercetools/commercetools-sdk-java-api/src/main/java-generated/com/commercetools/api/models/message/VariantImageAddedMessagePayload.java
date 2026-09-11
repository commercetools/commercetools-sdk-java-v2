
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
 *     VariantImageAddedMessagePayload variantImageAddedMessagePayload = VariantImageAddedMessagePayload.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantImageAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImageAddedMessagePayloadImpl.class)
public interface VariantImageAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantImageAddedMessagePayload
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
     * @return instance of VariantImageAddedMessagePayload
     */
    public static VariantImageAddedMessagePayload of() {
        return new VariantImageAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImageAddedMessagePayload of(final VariantImageAddedMessagePayload template) {
        VariantImageAddedMessagePayloadImpl instance = new VariantImageAddedMessagePayloadImpl();
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantImageAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImageAddedMessagePayload deepCopy(@Nullable final VariantImageAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantImageAddedMessagePayloadImpl instance = new VariantImageAddedMessagePayloadImpl();
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantImageAddedMessagePayload
     * @return builder
     */
    public static VariantImageAddedMessagePayloadBuilder builder() {
        return VariantImageAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImageAddedMessagePayloadBuilder builder(final VariantImageAddedMessagePayload template) {
        return VariantImageAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImageAddedMessagePayload(Function<VariantImageAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImageAddedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImageAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImageAddedMessagePayload>";
            }
        };
    }
}
