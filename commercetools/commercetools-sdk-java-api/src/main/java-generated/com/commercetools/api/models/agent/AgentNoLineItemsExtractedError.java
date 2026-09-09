
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
 *  <p>Returned by a <span>/responses</span> request when no Line Items could be extracted from the provided <code>prompt</code> or files.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentNoLineItemsExtractedError agentNoLineItemsExtractedError = AgentNoLineItemsExtractedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NoLineItemsExtracted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentNoLineItemsExtractedErrorImpl.class)
public interface AgentNoLineItemsExtractedError extends ErrorObject {

    /**
     * discriminator value for AgentNoLineItemsExtractedError
     */
    String NO_LINE_ITEMS_EXTRACTED = "NoLineItemsExtracted";

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
     * @return instance of AgentNoLineItemsExtractedError
     */
    public static AgentNoLineItemsExtractedError of() {
        return new AgentNoLineItemsExtractedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentNoLineItemsExtractedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentNoLineItemsExtractedError of(final AgentNoLineItemsExtractedError template) {
        AgentNoLineItemsExtractedErrorImpl instance = new AgentNoLineItemsExtractedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentNoLineItemsExtractedError copyDeep();

    /**
     * factory method to create a deep copy of AgentNoLineItemsExtractedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentNoLineItemsExtractedError deepCopy(@Nullable final AgentNoLineItemsExtractedError template) {
        if (template == null) {
            return null;
        }
        AgentNoLineItemsExtractedErrorImpl instance = new AgentNoLineItemsExtractedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentNoLineItemsExtractedError
     * @return builder
     */
    public static AgentNoLineItemsExtractedErrorBuilder builder() {
        return AgentNoLineItemsExtractedErrorBuilder.of();
    }

    /**
     * create builder for AgentNoLineItemsExtractedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentNoLineItemsExtractedErrorBuilder builder(final AgentNoLineItemsExtractedError template) {
        return AgentNoLineItemsExtractedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentNoLineItemsExtractedError(Function<AgentNoLineItemsExtractedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentNoLineItemsExtractedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentNoLineItemsExtractedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentNoLineItemsExtractedError>";
            }
        };
    }
}
