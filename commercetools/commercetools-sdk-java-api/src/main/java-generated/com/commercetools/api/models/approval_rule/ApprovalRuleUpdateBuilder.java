
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleUpdate approvalRuleUpdate = ApprovalRuleUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleUpdateBuilder implements Builder<ApprovalRuleUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction> actions;

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder actions(
            final com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder plusActions(
            final com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder plusActions(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionBuilder, Builder<? extends com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApprovalRuleUpdateBuilder withActions(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionBuilder, Builder<? extends com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a>.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ApprovalRuleUpdate with checking for non-null required values
     * @return ApprovalRuleUpdate
     */
    public ApprovalRuleUpdate build() {
        Objects.requireNonNull(version, ApprovalRuleUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ApprovalRuleUpdate.class + ": actions is missing");
        return new ApprovalRuleUpdateImpl(version, actions);
    }

    /**
     * builds ApprovalRuleUpdate without checking for non-null required values
     * @return ApprovalRuleUpdate
     */
    public ApprovalRuleUpdate buildUnchecked() {
        return new ApprovalRuleUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ApprovalRuleUpdateBuilder
     * @return builder
     */
    public static ApprovalRuleUpdateBuilder of() {
        return new ApprovalRuleUpdateBuilder();
    }

    /**
     * create builder for ApprovalRuleUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleUpdateBuilder of(final ApprovalRuleUpdate template) {
        ApprovalRuleUpdateBuilder builder = new ApprovalRuleUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
