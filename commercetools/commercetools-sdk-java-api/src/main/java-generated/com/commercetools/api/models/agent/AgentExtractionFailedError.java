
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when the input could not be processed due to an internal error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentExtractionFailedError agentExtractionFailedError = AgentExtractionFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtractionFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentExtractionFailedErrorImpl.class)
public interface AgentExtractionFailedError extends ErrorObject {

    /**
     * discriminator value for AgentExtractionFailedError
     */
    String EXTRACTION_FAILED = "ExtractionFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of AgentExtractionFailedError
     */
    public static AgentExtractionFailedError of() {
        return new AgentExtractionFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentExtractionFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentExtractionFailedError of(final AgentExtractionFailedError template) {
        AgentExtractionFailedErrorImpl instance = new AgentExtractionFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentExtractionFailedError copyDeep();

    /**
     * factory method to create a deep copy of AgentExtractionFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentExtractionFailedError deepCopy(@Nullable final AgentExtractionFailedError template) {
        if (template == null) {
            return null;
        }
        AgentExtractionFailedErrorImpl instance = new AgentExtractionFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentExtractionFailedError
     * @return builder
     */
    public static AgentExtractionFailedErrorBuilder builder() {
        return AgentExtractionFailedErrorBuilder.of();
    }

    /**
     * create builder for AgentExtractionFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentExtractionFailedErrorBuilder builder(final AgentExtractionFailedError template) {
        return AgentExtractionFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentExtractionFailedError(Function<AgentExtractionFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentExtractionFailedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentExtractionFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentExtractionFailedError>";
            }
        };
    }
}
