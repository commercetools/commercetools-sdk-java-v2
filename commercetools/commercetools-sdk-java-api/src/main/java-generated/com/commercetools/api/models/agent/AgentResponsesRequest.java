
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>JSON body for an <code>application/json</code> <span>/responses</span> request to the Intake Agent. <code>prompt</code> is required.</p>
 *  <p>To attach files, send a <code>multipart/form-data</code> request with an <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a> as the <code>payload</code> part.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesRequest agentResponsesRequest = AgentResponsesRequest.builder()
 *             .outputType(AgentResponsesOutputType.CART)
 *             .locale("{locale}")
 *             .prompt("{prompt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesRequestImpl.class)
public interface AgentResponsesRequest {

    /**
     *  <p>The entity to create.</p>
     * @return outputType
     */
    @NotNull
    @JsonProperty("outputType")
    public AgentResponsesOutputType getOutputType();

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @return locale
     */
    @NotNull
    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Natural-language description of the desired Cart or Quote Request, such as the body of an email or a note.</p>
     * @return prompt
     */
    @NotNull
    @JsonProperty("prompt")
    public String getPrompt();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>The entity to create.</p>
     * @param outputType value to be set
     */

    public void setOutputType(final AgentResponsesOutputType outputType);

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Natural-language description of the desired Cart or Quote Request, such as the body of an email or a note.</p>
     * @param prompt value to be set
     */

    public void setPrompt(final String prompt);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of AgentResponsesRequest
     */
    public static AgentResponsesRequest of() {
        return new AgentResponsesRequestImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesRequest of(final AgentResponsesRequest template) {
        AgentResponsesRequestImpl instance = new AgentResponsesRequestImpl();
        instance.setOutputType(template.getOutputType());
        instance.setLocale(template.getLocale());
        instance.setPrompt(template.getPrompt());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        return instance;
    }

    public AgentResponsesRequest copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesRequest deepCopy(@Nullable final AgentResponsesRequest template) {
        if (template == null) {
            return null;
        }
        AgentResponsesRequestImpl instance = new AgentResponsesRequestImpl();
        instance.setOutputType(template.getOutputType());
        instance.setLocale(template.getLocale());
        instance.setPrompt(template.getPrompt());
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for AgentResponsesRequest
     * @return builder
     */
    public static AgentResponsesRequestBuilder builder() {
        return AgentResponsesRequestBuilder.of();
    }

    /**
     * create builder for AgentResponsesRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesRequestBuilder builder(final AgentResponsesRequest template) {
        return AgentResponsesRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesRequest(Function<AgentResponsesRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesRequest> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesRequest>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesRequest>";
            }
        };
    }
}
