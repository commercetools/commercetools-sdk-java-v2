
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.warning.WarningObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Successful <code>201</code> response from a <span>/responses</span> request. Returns the created entity in commercetools REST representation, together with any non-fatal <code>warnings</code>.</p>
 *  <p>The concrete type depends on <code>entityType</code>:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesCartSuccess" rel="nofollow">AgentResponsesCartSuccess</a> when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> was created</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesQuoteRequestSuccess" rel="nofollow">AgentResponsesQuoteRequestSuccess</a> when a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> was created</li>
 *  </ul>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesSuccess agentResponsesSuccess = AgentResponsesSuccess.cartBuilder()
 *             threadId("{threadId}")
 *             entity(entityBuilder -> entityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "entityType", defaultImpl = AgentResponsesSuccessImpl.class, visible = true)
@JsonDeserialize(as = AgentResponsesSuccessImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AgentResponsesSuccess {

    /**
     *  <p>The entity that was created. Determines the concrete response type.</p>
     * @return entityType
     */
    @NotNull
    @JsonProperty("entityType")
    public AgentResponsesOutputType getEntityType();

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @return warnings
     */
    @Valid
    @JsonProperty("warnings")
    public List<WarningObject> getWarnings();

    /**
     *  <p>Identifier of the workflow run that produced this response.</p>
     * @return threadId
     */
    @NotNull
    @JsonProperty("threadId")
    public String getThreadId();

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings values to be set
     */

    @JsonIgnore
    public void setWarnings(final WarningObject... warnings);

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings values to be set
     */

    public void setWarnings(final List<WarningObject> warnings);

    /**
     *  <p>Identifier of the workflow run that produced this response.</p>
     * @param threadId value to be set
     */

    public void setThreadId(final String threadId);

    public AgentResponsesSuccess copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesSuccess deepCopy(@Nullable final AgentResponsesSuccess template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof AgentResponsesSuccessImpl)) {
            return template.copyDeep();
        }
        AgentResponsesSuccessImpl instance = new AgentResponsesSuccessImpl();
        instance.setWarnings(Optional.ofNullable(template.getWarnings())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.warning.WarningObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setThreadId(template.getThreadId());
        return instance;
    }

    /**
     * builder for cart subtype
     * @return builder
     */
    public static com.commercetools.api.models.agent.AgentResponsesCartSuccessBuilder cartBuilder() {
        return com.commercetools.api.models.agent.AgentResponsesCartSuccessBuilder.of();
    }

    /**
     * builder for quoteRequest subtype
     * @return builder
     */
    public static com.commercetools.api.models.agent.AgentResponsesQuoteRequestSuccessBuilder quoteRequestBuilder() {
        return com.commercetools.api.models.agent.AgentResponsesQuoteRequestSuccessBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesSuccess(Function<AgentResponsesSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesSuccess> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesSuccess>";
            }
        };
    }
}
