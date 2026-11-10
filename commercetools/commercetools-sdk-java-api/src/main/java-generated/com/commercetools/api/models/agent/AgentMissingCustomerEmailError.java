
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
 *  <p>Returned by a <span>/responses</span> request when the customer's email address was not provided and could not be inferred from the input.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCustomerEmailError agentMissingCustomerEmailError = AgentMissingCustomerEmailError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCustomerEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentMissingCustomerEmailErrorImpl.class)
public interface AgentMissingCustomerEmailError extends ErrorObject {

    /**
     * discriminator value for AgentMissingCustomerEmailError
     */
    String MISSING_CUSTOMER_EMAIL = "MissingCustomerEmail";

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
     * @return instance of AgentMissingCustomerEmailError
     */
    public static AgentMissingCustomerEmailError of() {
        return new AgentMissingCustomerEmailErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentMissingCustomerEmailError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentMissingCustomerEmailError of(final AgentMissingCustomerEmailError template) {
        AgentMissingCustomerEmailErrorImpl instance = new AgentMissingCustomerEmailErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentMissingCustomerEmailError copyDeep();

    /**
     * factory method to create a deep copy of AgentMissingCustomerEmailError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentMissingCustomerEmailError deepCopy(@Nullable final AgentMissingCustomerEmailError template) {
        if (template == null) {
            return null;
        }
        AgentMissingCustomerEmailErrorImpl instance = new AgentMissingCustomerEmailErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentMissingCustomerEmailError
     * @return builder
     */
    public static AgentMissingCustomerEmailErrorBuilder builder() {
        return AgentMissingCustomerEmailErrorBuilder.of();
    }

    /**
     * create builder for AgentMissingCustomerEmailError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCustomerEmailErrorBuilder builder(final AgentMissingCustomerEmailError template) {
        return AgentMissingCustomerEmailErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentMissingCustomerEmailError(Function<AgentMissingCustomerEmailError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentMissingCustomerEmailError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentMissingCustomerEmailError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentMissingCustomerEmailError>";
            }
        };
    }
}
