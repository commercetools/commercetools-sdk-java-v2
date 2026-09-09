
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
 *  <p>Returned by a <span>/responses</span> request when a shipping country was not provided and could not be inferred from the input.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCountryError agentMissingCountryError = AgentMissingCountryError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentMissingCountryErrorImpl.class)
public interface AgentMissingCountryError extends ErrorObject {

    /**
     * discriminator value for AgentMissingCountryError
     */
    String MISSING_COUNTRY = "MissingCountry";

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
     * @return instance of AgentMissingCountryError
     */
    public static AgentMissingCountryError of() {
        return new AgentMissingCountryErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentMissingCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentMissingCountryError of(final AgentMissingCountryError template) {
        AgentMissingCountryErrorImpl instance = new AgentMissingCountryErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentMissingCountryError copyDeep();

    /**
     * factory method to create a deep copy of AgentMissingCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentMissingCountryError deepCopy(@Nullable final AgentMissingCountryError template) {
        if (template == null) {
            return null;
        }
        AgentMissingCountryErrorImpl instance = new AgentMissingCountryErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentMissingCountryError
     * @return builder
     */
    public static AgentMissingCountryErrorBuilder builder() {
        return AgentMissingCountryErrorBuilder.of();
    }

    /**
     * create builder for AgentMissingCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCountryErrorBuilder builder(final AgentMissingCountryError template) {
        return AgentMissingCountryErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentMissingCountryError(Function<AgentMissingCountryError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentMissingCountryError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentMissingCountryError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentMissingCountryError>";
            }
        };
    }
}
