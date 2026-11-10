
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> could not be resolved from the input. Pin it with an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitUnresolvedError agentBusinessUnitUnresolvedError = AgentBusinessUnitUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentBusinessUnitUnresolvedErrorImpl.class)
public interface AgentBusinessUnitUnresolvedError extends ErrorObject {

    /**
     * discriminator value for AgentBusinessUnitUnresolvedError
     */
    String BUSINESS_UNIT_UNRESOLVED = "BusinessUnitUnresolved";

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
     * @return instance of AgentBusinessUnitUnresolvedError
     */
    public static AgentBusinessUnitUnresolvedError of() {
        return new AgentBusinessUnitUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentBusinessUnitUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentBusinessUnitUnresolvedError of(final AgentBusinessUnitUnresolvedError template) {
        AgentBusinessUnitUnresolvedErrorImpl instance = new AgentBusinessUnitUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentBusinessUnitUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of AgentBusinessUnitUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentBusinessUnitUnresolvedError deepCopy(@Nullable final AgentBusinessUnitUnresolvedError template) {
        if (template == null) {
            return null;
        }
        AgentBusinessUnitUnresolvedErrorImpl instance = new AgentBusinessUnitUnresolvedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentBusinessUnitUnresolvedError
     * @return builder
     */
    public static AgentBusinessUnitUnresolvedErrorBuilder builder() {
        return AgentBusinessUnitUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for AgentBusinessUnitUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitUnresolvedErrorBuilder builder(final AgentBusinessUnitUnresolvedError template) {
        return AgentBusinessUnitUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentBusinessUnitUnresolvedError(Function<AgentBusinessUnitUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentBusinessUnitUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentBusinessUnitUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentBusinessUnitUnresolvedError>";
            }
        };
    }
}
