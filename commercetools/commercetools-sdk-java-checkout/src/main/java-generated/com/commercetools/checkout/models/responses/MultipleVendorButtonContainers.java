
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when multiple containers for <span>vendor payment buttons</span> are found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultipleVendorButtonContainers multipleVendorButtonContainers = MultipleVendorButtonContainers.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("multiple_vendor_button_containers")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MultipleVendorButtonContainersImpl.class)
public interface MultipleVendorButtonContainers extends Message {

    /**
     * discriminator value for MultipleVendorButtonContainers
     */
    String MULTIPLE_VENDOR_BUTTON_CONTAINERS = "multiple_vendor_button_containers";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`warn`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Multiple vendor button containers detected, this may cause issues.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Multiple vendor button containers detected, this may cause issues.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of MultipleVendorButtonContainers
     */
    public static MultipleVendorButtonContainers of() {
        return new MultipleVendorButtonContainersImpl();
    }

    /**
     * factory method to create a shallow copy MultipleVendorButtonContainers
     * @param template instance to be copied
     * @return copy instance
     */
    public static MultipleVendorButtonContainers of(final MultipleVendorButtonContainers template) {
        MultipleVendorButtonContainersImpl instance = new MultipleVendorButtonContainersImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public MultipleVendorButtonContainers copyDeep();

    /**
     * factory method to create a deep copy of MultipleVendorButtonContainers
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MultipleVendorButtonContainers deepCopy(@Nullable final MultipleVendorButtonContainers template) {
        if (template == null) {
            return null;
        }
        MultipleVendorButtonContainersImpl instance = new MultipleVendorButtonContainersImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for MultipleVendorButtonContainers
     * @return builder
     */
    public static MultipleVendorButtonContainersBuilder builder() {
        return MultipleVendorButtonContainersBuilder.of();
    }

    /**
     * create builder for MultipleVendorButtonContainers instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultipleVendorButtonContainersBuilder builder(final MultipleVendorButtonContainers template) {
        return MultipleVendorButtonContainersBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMultipleVendorButtonContainers(Function<MultipleVendorButtonContainers, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MultipleVendorButtonContainers> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MultipleVendorButtonContainers>() {
            @Override
            public String toString() {
                return "TypeReference<MultipleVendorButtonContainers>";
            }
        };
    }
}
