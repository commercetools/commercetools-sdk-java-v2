
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Contained in responses to an <span>Upload Product image</span> or an <span>Upload Product Tailoring image</span> request with response status code <code>202 Accepted</code>. Indicates that the API is still creating the remaining sizes of the uploaded image. They will be available on the Content Delivery Network (CDN) soon.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageProcessingOngoingWarning imageProcessingOngoingWarning = ImageProcessingOngoingWarning.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ImageProcessingOngoing")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageProcessingOngoingWarningImpl.class)
public interface ImageProcessingOngoingWarning extends WarningObject {

    /**
     * discriminator value for ImageProcessingOngoingWarning
     */
    String IMAGE_PROCESSING_ONGOING = "ImageProcessingOngoing";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The image processing is still ongoing."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The image processing is still ongoing."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ImageProcessingOngoingWarning
     */
    public static ImageProcessingOngoingWarning of() {
        return new ImageProcessingOngoingWarningImpl();
    }

    /**
     * factory method to create a shallow copy ImageProcessingOngoingWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImageProcessingOngoingWarning of(final ImageProcessingOngoingWarning template) {
        ImageProcessingOngoingWarningImpl instance = new ImageProcessingOngoingWarningImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public ImageProcessingOngoingWarning copyDeep();

    /**
     * factory method to create a deep copy of ImageProcessingOngoingWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImageProcessingOngoingWarning deepCopy(@Nullable final ImageProcessingOngoingWarning template) {
        if (template == null) {
            return null;
        }
        ImageProcessingOngoingWarningImpl instance = new ImageProcessingOngoingWarningImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ImageProcessingOngoingWarning
     * @return builder
     */
    public static ImageProcessingOngoingWarningBuilder builder() {
        return ImageProcessingOngoingWarningBuilder.of();
    }

    /**
     * create builder for ImageProcessingOngoingWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageProcessingOngoingWarningBuilder builder(final ImageProcessingOngoingWarning template) {
        return ImageProcessingOngoingWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImageProcessingOngoingWarning(Function<ImageProcessingOngoingWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImageProcessingOngoingWarning> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageProcessingOngoingWarning>() {
            @Override
            public String toString() {
                return "TypeReference<ImageProcessingOngoingWarning>";
            }
        };
    }
}
