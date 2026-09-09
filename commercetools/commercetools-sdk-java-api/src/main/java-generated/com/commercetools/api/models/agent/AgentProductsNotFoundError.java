
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
 *  <p>Returned by a <span>/responses</span> request when none of the requested products could be matched to the catalog.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentProductsNotFoundError agentProductsNotFoundError = AgentProductsNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductsNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentProductsNotFoundErrorImpl.class)
public interface AgentProductsNotFoundError extends ErrorObject {

    /**
     * discriminator value for AgentProductsNotFoundError
     */
    String PRODUCTS_NOT_FOUND = "ProductsNotFound";

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
     * @return instance of AgentProductsNotFoundError
     */
    public static AgentProductsNotFoundError of() {
        return new AgentProductsNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentProductsNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentProductsNotFoundError of(final AgentProductsNotFoundError template) {
        AgentProductsNotFoundErrorImpl instance = new AgentProductsNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentProductsNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of AgentProductsNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentProductsNotFoundError deepCopy(@Nullable final AgentProductsNotFoundError template) {
        if (template == null) {
            return null;
        }
        AgentProductsNotFoundErrorImpl instance = new AgentProductsNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentProductsNotFoundError
     * @return builder
     */
    public static AgentProductsNotFoundErrorBuilder builder() {
        return AgentProductsNotFoundErrorBuilder.of();
    }

    /**
     * create builder for AgentProductsNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductsNotFoundErrorBuilder builder(final AgentProductsNotFoundError template) {
        return AgentProductsNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentProductsNotFoundError(Function<AgentProductsNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentProductsNotFoundError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentProductsNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentProductsNotFoundError>";
            }
        };
    }
}
