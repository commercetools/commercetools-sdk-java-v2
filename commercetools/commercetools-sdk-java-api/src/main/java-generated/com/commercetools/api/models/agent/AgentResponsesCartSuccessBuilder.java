
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesCartSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesCartSuccess agentResponsesCartSuccess = AgentResponsesCartSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesCartSuccessBuilder implements Builder<AgentResponsesCartSuccess> {

    @Nullable
    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    private String threadId;

    private com.commercetools.api.models.cart.Cart entity;

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder warnings(
            @Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder warnings(
            @Nullable final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder plusWarnings(
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

    public AgentResponsesCartSuccessBuilder plusWarnings(
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

    public AgentResponsesCartSuccessBuilder withWarnings(
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

    public AgentResponsesCartSuccessBuilder threadId(final String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder entity(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.entity = builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder withEntity(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.Cart> builder) {
        this.entity = builder.apply(com.commercetools.api.models.cart.CartBuilder.of());
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     * @return Builder
     */

    public AgentResponsesCartSuccessBuilder entity(final com.commercetools.api.models.cart.Cart entity) {
        this.entity = entity;
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
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> in full commercetools REST representation.</p>
     * @return entity
     */

    public com.commercetools.api.models.cart.Cart getEntity() {
        return this.entity;
    }

    /**
     * builds AgentResponsesCartSuccess with checking for non-null required values
     * @return AgentResponsesCartSuccess
     */
    public AgentResponsesCartSuccess build() {
        Objects.requireNonNull(threadId, AgentResponsesCartSuccess.class + ": threadId is missing");
        Objects.requireNonNull(entity, AgentResponsesCartSuccess.class + ": entity is missing");
        return new AgentResponsesCartSuccessImpl(warnings, threadId, entity);
    }

    /**
     * builds AgentResponsesCartSuccess without checking for non-null required values
     * @return AgentResponsesCartSuccess
     */
    public AgentResponsesCartSuccess buildUnchecked() {
        return new AgentResponsesCartSuccessImpl(warnings, threadId, entity);
    }

    /**
     * factory method for an instance of AgentResponsesCartSuccessBuilder
     * @return builder
     */
    public static AgentResponsesCartSuccessBuilder of() {
        return new AgentResponsesCartSuccessBuilder();
    }

    /**
     * create builder for AgentResponsesCartSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesCartSuccessBuilder of(final AgentResponsesCartSuccess template) {
        AgentResponsesCartSuccessBuilder builder = new AgentResponsesCartSuccessBuilder();
        builder.warnings = template.getWarnings();
        builder.threadId = template.getThreadId();
        builder.entity = template.getEntity();
        return builder;
    }

}
