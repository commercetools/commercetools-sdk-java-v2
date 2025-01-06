
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
 *  <p>Represents a warning related to the returned response.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     WarningObject warningObject = WarningObject.imageProcessingOngoingBuilder()
 *             message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.warning.ImageProcessingOngoingWarningImpl.class, name = ImageProcessingOngoingWarning.IMAGE_PROCESSING_ONGOING) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = WarningObjectImpl.class, visible = true)
@JsonDeserialize(as = WarningObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface WarningObject {

    /**
     *  <p>Identifier for the type of warning.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Contains information about the returned response.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains information about the returned response.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method to create a deep copy of WarningObject
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static WarningObject deepCopy(@Nullable final WarningObject template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.warning.ImageProcessingOngoingWarning) {
            return com.commercetools.api.models.warning.ImageProcessingOngoingWarning
                    .deepCopy((com.commercetools.api.models.warning.ImageProcessingOngoingWarning) template);
        }
        WarningObjectImpl instance = new WarningObjectImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder for imageProcessingOngoing subtype
     * @return builder
     */
    public static com.commercetools.api.models.warning.ImageProcessingOngoingWarningBuilder imageProcessingOngoingBuilder() {
        return com.commercetools.api.models.warning.ImageProcessingOngoingWarningBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withWarningObject(Function<WarningObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<WarningObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<WarningObject>() {
            @Override
            public String toString() {
                return "TypeReference<WarningObject>";
            }
        };
    }
}
