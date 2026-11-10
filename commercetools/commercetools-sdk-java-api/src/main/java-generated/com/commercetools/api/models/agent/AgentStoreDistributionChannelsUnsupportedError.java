
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
 *  <p>Returned by a <span>/responses</span> request when the resolved <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> has more than one entry in the <code>distributionChannels</code> array, which is not supported. To resolve this error, choose a Store with zero or one distribution channel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreDistributionChannelsUnsupportedError agentStoreDistributionChannelsUnsupportedError = AgentStoreDistributionChannelsUnsupportedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreDistributionChannelsUnsupported")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentStoreDistributionChannelsUnsupportedErrorImpl.class)
public interface AgentStoreDistributionChannelsUnsupportedError extends ErrorObject {

    /**
     * discriminator value for AgentStoreDistributionChannelsUnsupportedError
     */
    String STORE_DISTRIBUTION_CHANNELS_UNSUPPORTED = "StoreDistributionChannelsUnsupported";

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
     * @return instance of AgentStoreDistributionChannelsUnsupportedError
     */
    public static AgentStoreDistributionChannelsUnsupportedError of() {
        return new AgentStoreDistributionChannelsUnsupportedErrorImpl();
    }

    /**
     * factory method to create a shallow copy AgentStoreDistributionChannelsUnsupportedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentStoreDistributionChannelsUnsupportedError of(
            final AgentStoreDistributionChannelsUnsupportedError template) {
        AgentStoreDistributionChannelsUnsupportedErrorImpl instance = new AgentStoreDistributionChannelsUnsupportedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public AgentStoreDistributionChannelsUnsupportedError copyDeep();

    /**
     * factory method to create a deep copy of AgentStoreDistributionChannelsUnsupportedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentStoreDistributionChannelsUnsupportedError deepCopy(
            @Nullable final AgentStoreDistributionChannelsUnsupportedError template) {
        if (template == null) {
            return null;
        }
        AgentStoreDistributionChannelsUnsupportedErrorImpl instance = new AgentStoreDistributionChannelsUnsupportedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for AgentStoreDistributionChannelsUnsupportedError
     * @return builder
     */
    public static AgentStoreDistributionChannelsUnsupportedErrorBuilder builder() {
        return AgentStoreDistributionChannelsUnsupportedErrorBuilder.of();
    }

    /**
     * create builder for AgentStoreDistributionChannelsUnsupportedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreDistributionChannelsUnsupportedErrorBuilder builder(
            final AgentStoreDistributionChannelsUnsupportedError template) {
        return AgentStoreDistributionChannelsUnsupportedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentStoreDistributionChannelsUnsupportedError(
            Function<AgentStoreDistributionChannelsUnsupportedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentStoreDistributionChannelsUnsupportedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentStoreDistributionChannelsUnsupportedError>() {
            @Override
            public String toString() {
                return "TypeReference<AgentStoreDistributionChannelsUnsupportedError>";
            }
        };
    }
}
