
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesRequestBuilder
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
public class AgentResponsesRequestBuilder implements Builder<AgentResponsesRequest> {

    private com.commercetools.api.models.agent.AgentResponsesOutputType outputType;

    private String locale;

    private String prompt;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>The entity to create.</p>
     * @param outputType value to be set
     * @return Builder
     */

    public AgentResponsesRequestBuilder outputType(
            final com.commercetools.api.models.agent.AgentResponsesOutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @param locale value to be set
     * @return Builder
     */

    public AgentResponsesRequestBuilder locale(final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Natural-language description of the desired Cart or Quote Request, such as the body of an email or a note.</p>
     * @param prompt value to be set
     * @return Builder
     */

    public AgentResponsesRequestBuilder prompt(final String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public AgentResponsesRequestBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public AgentResponsesRequestBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public AgentResponsesRequestBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public AgentResponsesRequestBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public AgentResponsesRequestBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @param store value to be set
     * @return Builder
     */

    public AgentResponsesRequestBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>The entity to create.</p>
     * @return outputType
     */

    public com.commercetools.api.models.agent.AgentResponsesOutputType getOutputType() {
        return this.outputType;
    }

    /**
     *  <p>A valid BCP 47 language tag, for example <code>en-US</code>.</p>
     * @return locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Natural-language description of the desired Cart or Quote Request, such as the body of an email or a note.</p>
     * @return prompt
     */

    public String getPrompt() {
        return this.prompt;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> to use for the request. If omitted, the Intake Agent resolves it from <code>prompt</code>.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds AgentResponsesRequest with checking for non-null required values
     * @return AgentResponsesRequest
     */
    public AgentResponsesRequest build() {
        Objects.requireNonNull(outputType, AgentResponsesRequest.class + ": outputType is missing");
        Objects.requireNonNull(locale, AgentResponsesRequest.class + ": locale is missing");
        Objects.requireNonNull(prompt, AgentResponsesRequest.class + ": prompt is missing");
        return new AgentResponsesRequestImpl(outputType, locale, prompt, businessUnit, store);
    }

    /**
     * builds AgentResponsesRequest without checking for non-null required values
     * @return AgentResponsesRequest
     */
    public AgentResponsesRequest buildUnchecked() {
        return new AgentResponsesRequestImpl(outputType, locale, prompt, businessUnit, store);
    }

    /**
     * factory method for an instance of AgentResponsesRequestBuilder
     * @return builder
     */
    public static AgentResponsesRequestBuilder of() {
        return new AgentResponsesRequestBuilder();
    }

    /**
     * create builder for AgentResponsesRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesRequestBuilder of(final AgentResponsesRequest template) {
        AgentResponsesRequestBuilder builder = new AgentResponsesRequestBuilder();
        builder.outputType = template.getOutputType();
        builder.locale = template.getLocale();
        builder.prompt = template.getPrompt();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        return builder;
    }

}
