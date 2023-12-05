
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowUpdate approvalFlowUpdate = ApprovalFlowUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowUpdateBuilder implements Builder<ApprovalFlowUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction> actions;

    /**
     *  <p>Expected version of the Approval Flow to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder actions(
            final com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder plusActions(
            final com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder plusActions(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionBuilder, Builder<? extends com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApprovalFlowUpdateBuilder withActions(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionBuilder, Builder<? extends com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Approval Flow to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Approval Flow.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ApprovalFlowUpdate with checking for non-null required values
     * @return ApprovalFlowUpdate
     */
    public ApprovalFlowUpdate build() {
        Objects.requireNonNull(version, ApprovalFlowUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ApprovalFlowUpdate.class + ": actions is missing");
        return new ApprovalFlowUpdateImpl(version, actions);
    }

    /**
     * builds ApprovalFlowUpdate without checking for non-null required values
     * @return ApprovalFlowUpdate
     */
    public ApprovalFlowUpdate buildUnchecked() {
        return new ApprovalFlowUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ApprovalFlowUpdateBuilder
     * @return builder
     */
    public static ApprovalFlowUpdateBuilder of() {
        return new ApprovalFlowUpdateBuilder();
    }

    /**
     * create builder for ApprovalFlowUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowUpdateBuilder of(final ApprovalFlowUpdate template) {
        ApprovalFlowUpdateBuilder builder = new ApprovalFlowUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
