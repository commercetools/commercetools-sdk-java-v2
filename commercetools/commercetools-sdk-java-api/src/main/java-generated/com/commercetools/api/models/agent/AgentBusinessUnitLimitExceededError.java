
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
 *  <p>Returned by a <span>/responses</span> request when the customer is associated with more <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a> than can be resolved automatically. To resolve this error, specify an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitLimitExceededError agentBusinessUnitLimitExceededError = AgentBusinessUnitLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitLimitExceeded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentBusinessUnitLimitExceededErrorImpl.class)
public interface AgentBusinessUnitLimitExceededError extends ErrorObject {

    /**
     * discriminator value for AgentBusinessUnitLimitExceededError
     */
    String BUSINESS_UNIT_LIMIT_EXCEEDED = "BusinessUnitLimitExceeded";

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
     * @return instance of AgentBusinessUnitLimitExceededError
     */
    public static AgentBusinessUnitLimitExceededError of() {
        return new AgentBusinessUnitLimitExceededErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentBusinessUnitLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentBusinessUnitLimitExceededError of(final AgentBusinessUnitLimitExceededError template) {
        AgentBusinessUnitLimitExceededErrorImpl instance = new AgentBusinessUnitLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentBusinessUnitLimitExceededError copyDeep();

    /**
     * factory method to create a deep copy of AgentBusinessUnitLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentBusinessUnitLimitExceededError deepCopy(
            @Nullable final AgentBusinessUnitLimitExceededError template) {
        if (template == null) {
            return null;
        }
        AgentBusinessUnitLimitExceededErrorImpl instance = new AgentBusinessUnitLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentBusinessUnitLimitExceededError
     * @return builder
     */
    public static AgentBusinessUnitLimitExceededErrorBuilder builder() {
        return AgentBusinessUnitLimitExceededErrorBuilder.of();
    }

    /**
     * create builder for AgentBusinessUnitLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitLimitExceededErrorBuilder builder(
            final AgentBusinessUnitLimitExceededError template) {
        return AgentBusinessUnitLimitExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentBusinessUnitLimitExceededError(Function<AgentBusinessUnitLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentBusinessUnitLimitExceededError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentBusinessUnitLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentBusinessUnitLimitExceededError>";
            }
        };
    }
}
