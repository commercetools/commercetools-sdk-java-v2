
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
 *  <p>Returned by a <span>/responses</span> request when the Intake Agent is not enabled for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentFeatureDisabledError agentFeatureDisabledError = AgentFeatureDisabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("FeatureDisabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentFeatureDisabledErrorImpl.class)
public interface AgentFeatureDisabledError extends ErrorObject {

    /**
     * discriminator value for AgentFeatureDisabledError
     */
    String FEATURE_DISABLED = "FeatureDisabled";

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
     * @return instance of AgentFeatureDisabledError
     */
    public static AgentFeatureDisabledError of() {
        return new AgentFeatureDisabledErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentFeatureDisabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentFeatureDisabledError of(final AgentFeatureDisabledError template) {
        AgentFeatureDisabledErrorImpl instance = new AgentFeatureDisabledErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentFeatureDisabledError copyDeep();

    /**
     * factory method to create a deep copy of AgentFeatureDisabledError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentFeatureDisabledError deepCopy(@Nullable final AgentFeatureDisabledError template) {
        if (template == null) {
            return null;
        }
        AgentFeatureDisabledErrorImpl instance = new AgentFeatureDisabledErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentFeatureDisabledError
     * @return builder
     */
    public static AgentFeatureDisabledErrorBuilder builder() {
        return AgentFeatureDisabledErrorBuilder.of();
    }

    /**
     * create builder for AgentFeatureDisabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentFeatureDisabledErrorBuilder builder(final AgentFeatureDisabledError template) {
        return AgentFeatureDisabledErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentFeatureDisabledError(Function<AgentFeatureDisabledError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentFeatureDisabledError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentFeatureDisabledError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentFeatureDisabledError>";
            }
        };
    }
}
