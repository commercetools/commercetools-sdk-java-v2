
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesShoppingListSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesShoppingListSuccess agentResponsesShoppingListSuccess = AgentResponsesShoppingListSuccess.builder()
 *             .threadId("{threadId}")
 *             .entity(entityBuilder -> entityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesShoppingListSuccessBuilder implements Builder<AgentResponsesShoppingListSuccess> {

    @Nullable
    private java.util.List<com.commercetools.api.models.warning.WarningObject> warnings;

    private String threadId;

    private com.commercetools.api.models.shopping_list.ShoppingList entity;

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder warnings(
            @Nullable final com.commercetools.api.models.warning.WarningObject... warnings) {
        this.warnings = new ArrayList<>(Arrays.asList(warnings));
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder warnings(
            @Nullable final java.util.List<com.commercetools.api.models.warning.WarningObject> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     *  <p>Non-fatal issues encountered while processing the request. Present only when at least one warning is returned.</p>
     * @param warnings value to be set
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder plusWarnings(
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

    public AgentResponsesShoppingListSuccessBuilder plusWarnings(
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

    public AgentResponsesShoppingListSuccessBuilder withWarnings(
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

    public AgentResponsesShoppingListSuccessBuilder threadId(final String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder entity(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingListBuilder> builder) {
        this.entity = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @param builder function to build the entity value
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder withEntity(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingList> builder) {
        this.entity = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of());
        return this;
    }

    /**
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @param entity value to be set
     * @return Builder
     */

    public AgentResponsesShoppingListSuccessBuilder entity(
            final com.commercetools.api.models.shopping_list.ShoppingList entity) {
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
     *  <p>The created <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in full commercetools REST representation.</p>
     * @return entity
     */

    public com.commercetools.api.models.shopping_list.ShoppingList getEntity() {
        return this.entity;
    }

    /**
     * builds AgentResponsesShoppingListSuccess with checking for non-null required values
     * @return AgentResponsesShoppingListSuccess
     */
    public AgentResponsesShoppingListSuccess build() {
        Objects.requireNonNull(threadId, AgentResponsesShoppingListSuccess.class + ": threadId is missing");
        Objects.requireNonNull(entity, AgentResponsesShoppingListSuccess.class + ": entity is missing");
        return new AgentResponsesShoppingListSuccessImpl(warnings, threadId, entity);
    }

    /**
     * builds AgentResponsesShoppingListSuccess without checking for non-null required values
     * @return AgentResponsesShoppingListSuccess
     */
    public AgentResponsesShoppingListSuccess buildUnchecked() {
        return new AgentResponsesShoppingListSuccessImpl(warnings, threadId, entity);
    }

    /**
     * factory method for an instance of AgentResponsesShoppingListSuccessBuilder
     * @return builder
     */
    public static AgentResponsesShoppingListSuccessBuilder of() {
        return new AgentResponsesShoppingListSuccessBuilder();
    }

    /**
     * create builder for AgentResponsesShoppingListSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesShoppingListSuccessBuilder of(final AgentResponsesShoppingListSuccess template) {
        AgentResponsesShoppingListSuccessBuilder builder = new AgentResponsesShoppingListSuccessBuilder();
        builder.warnings = template.getWarnings();
        builder.threadId = template.getThreadId();
        builder.entity = template.getEntity();
        return builder;
    }

}
