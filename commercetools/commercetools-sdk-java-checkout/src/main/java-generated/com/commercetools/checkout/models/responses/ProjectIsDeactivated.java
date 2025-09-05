
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the Checkout <span><code>projectKey</code></span> is deactivated and cannot be initialized. To activate it, contact the <span>Checkout support team</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectIsDeactivated projectIsDeactivated = ProjectIsDeactivated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("project_deactivated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectIsDeactivatedImpl.class)
public interface ProjectIsDeactivated extends ResponseMessage {

    /**
     * discriminator value for ProjectIsDeactivated
     */
    String PROJECT_DEACTIVATED = "project_deactivated";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Project <code>{projectKey}</code> is deactivated.</p>
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
     *  <p>Contains the <code>project</code> object with the <code>key</code> property.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Project <code>{projectKey}</code> is deactivated.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>project</code> object with the <code>key</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of ProjectIsDeactivated
     */
    public static ProjectIsDeactivated of() {
        return new ProjectIsDeactivatedImpl();
    }

    /**
     * factory method to create a shallow copy ProjectIsDeactivated
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectIsDeactivated of(final ProjectIsDeactivated template) {
        ProjectIsDeactivatedImpl instance = new ProjectIsDeactivatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ProjectIsDeactivated copyDeep();

    /**
     * factory method to create a deep copy of ProjectIsDeactivated
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectIsDeactivated deepCopy(@Nullable final ProjectIsDeactivated template) {
        if (template == null) {
            return null;
        }
        ProjectIsDeactivatedImpl instance = new ProjectIsDeactivatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ProjectIsDeactivated
     * @return builder
     */
    public static ProjectIsDeactivatedBuilder builder() {
        return ProjectIsDeactivatedBuilder.of();
    }

    /**
     * create builder for ProjectIsDeactivated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectIsDeactivatedBuilder builder(final ProjectIsDeactivated template) {
        return ProjectIsDeactivatedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectIsDeactivated(Function<ProjectIsDeactivated, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectIsDeactivated> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectIsDeactivated>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectIsDeactivated>";
            }
        };
    }
}
