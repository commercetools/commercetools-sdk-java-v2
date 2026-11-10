
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesQuoteRequestSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesQuoteRequestSuccess agentResponsesQuoteRequestSuccess = AgentResponsesQuoteRequestSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesQuoteRequestSuccessBuilder implements Builder<AgentResponsesQuoteRequestSuccess> {

    @Nullable
    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    private String threadId;

    private com.commercetools.api.models.quote_request.QuoteRequest entity;

    private String cartId;

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder warnings(
            @Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder warnings(
            @Nullable final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder plusWarnings(
            @Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.addAll(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param builder function to build the warnings value
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder plusWarnings(
            Function<com.commercetools.api.models.warning.WarningObjectBuilder, Builder<? extends com.commercetools.api.models.warning.WarningObject>> builder) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(builder.apply(com.commercetools.api.models.warning.WarningObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param builder function to build the warnings value
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder withWarnings(
            Function<com.commercetools.api.models.warning.WarningObjectBuilder, Builder<? extends com.commercetools.api.models.warning.WarningObject>> builder) {
        this.warnings = new ArrayList<>();
        this.warnings.add(builder.apply(com.commercetools.api.models.warning.WarningObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifier of the workflow run that produced this response.</p>
     * @param threadId value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder threadId(final String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder entity(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequestBuilder> builder) {
        this.entity = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder withEntity(
            Function<com.commercetools.api.models.quote_request.QuoteRequestBuilder, com.commercetools.api.models.quote_request.QuoteRequest> builder) {
        this.entity = builder.apply(com.commercetools.api.models.quote_request.QuoteRequestBuilder.of());
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder entity(
            final com.commercetools.api.models.quote_request.QuoteRequest entity) {
        this.entity = entity;
        return this;
    }

    /**
     *  <p><code>id</code> of the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public AgentResponsesQuoteRequestSuccessBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @return warnings
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.warning.WarningObject> getWarnings() {
        return this.warnings;
    }

    /**
     *  <p>Identifier of the workflow run that produced this response.</p>
     * @return threadId
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> in full commercetools REST representation.</p>
     * @return entity
     */

    public com.commercetools.api.models.quote_request.QuoteRequest getEntity() {
        return this.entity;
    }

    /**
     *  <p><code>id</code> of the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     * builds AgentResponsesQuoteRequestSuccess with checking for non-null required values
     * @return AgentResponsesQuoteRequestSuccess
     */
    public AgentResponsesQuoteRequestSuccess build() {
        Objects.requireNonNull(threadId, AgentResponsesQuoteRequestSuccess.class + ": threadId is missing");
        Objects.requireNonNull(entity, AgentResponsesQuoteRequestSuccess.class + ": entity is missing");
        Objects.requireNonNull(cartId, AgentResponsesQuoteRequestSuccess.class + ": cartId is missing");
        return new AgentResponsesQuoteRequestSuccessImpl(warnings, threadId, entity, cartId);
    }

    /**
     * builds AgentResponsesQuoteRequestSuccess without checking for non-null required values
     * @return AgentResponsesQuoteRequestSuccess
     */
    public AgentResponsesQuoteRequestSuccess buildUnchecked() {
        return new AgentResponsesQuoteRequestSuccessImpl(warnings, threadId, entity, cartId);
    }

    /**
     * factory method for an instance of AgentResponsesQuoteRequestSuccessBuilder
     * @return builder
     */
    public static AgentResponsesQuoteRequestSuccessBuilder of() {
        return new AgentResponsesQuoteRequestSuccessBuilder();
    }

    /**
     * create builder for AgentResponsesQuoteRequestSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesQuoteRequestSuccessBuilder of(final AgentResponsesQuoteRequestSuccess template) {
        AgentResponsesQuoteRequestSuccessBuilder builder = new AgentResponsesQuoteRequestSuccessBuilder();
        builder.warnings = template.getWarnings();
        builder.threadId = template.getThreadId();
        builder.entity = template.getEntity();
        builder.cartId = template.getCartId();
        return builder;
    }

}
