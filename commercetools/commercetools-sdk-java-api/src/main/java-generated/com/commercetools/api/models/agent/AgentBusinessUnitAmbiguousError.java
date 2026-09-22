
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
 *  <p>Returned by a <span>/responses</span> request when the customer is associated with multiple <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a> and none could be automatically selected. To resolve this error, specify an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitAmbiguousError agentBusinessUnitAmbiguousError = AgentBusinessUnitAmbiguousError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAmbiguous")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentBusinessUnitAmbiguousErrorImpl.class)
public interface AgentBusinessUnitAmbiguousError extends ErrorObject {

    /**
     * discriminator value for AgentBusinessUnitAmbiguousError
     */
    String BUSINESS_UNIT_AMBIGUOUS = "BusinessUnitAmbiguous";

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
     * @return instance of AgentBusinessUnitAmbiguousError
     */
    public static AgentBusinessUnitAmbiguousError of() {
        return new AgentBusinessUnitAmbiguousErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentBusinessUnitAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentBusinessUnitAmbiguousError of(final AgentBusinessUnitAmbiguousError template) {
        AgentBusinessUnitAmbiguousErrorImpl instance = new AgentBusinessUnitAmbiguousErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentBusinessUnitAmbiguousError copyDeep();

    /**
     * factory method to create a deep copy of AgentBusinessUnitAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentBusinessUnitAmbiguousError deepCopy(@Nullable final AgentBusinessUnitAmbiguousError template) {
        if (template == null) {
            return null;
        }
        AgentBusinessUnitAmbiguousErrorImpl instance = new AgentBusinessUnitAmbiguousErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentBusinessUnitAmbiguousError
     * @return builder
     */
    public static AgentBusinessUnitAmbiguousErrorBuilder builder() {
        return AgentBusinessUnitAmbiguousErrorBuilder.of();
    }

    /**
     * create builder for AgentBusinessUnitAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitAmbiguousErrorBuilder builder(final AgentBusinessUnitAmbiguousError template) {
        return AgentBusinessUnitAmbiguousErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentBusinessUnitAmbiguousError(Function<AgentBusinessUnitAmbiguousError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentBusinessUnitAmbiguousError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentBusinessUnitAmbiguousError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentBusinessUnitAmbiguousError>";
            }
        };
    }
}
