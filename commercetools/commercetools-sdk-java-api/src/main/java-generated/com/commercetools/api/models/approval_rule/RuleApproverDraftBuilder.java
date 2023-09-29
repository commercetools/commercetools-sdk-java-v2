
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RuleApproverDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleApproverDraft ruleApproverDraft = RuleApproverDraft.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleApproverDraftBuilder implements Builder<RuleApproverDraft> {

    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleApproverDraftBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleApproverDraftBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public RuleApproverDraftBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier getAssociateRole() {
        return this.associateRole;
    }

    /**
     * builds RuleApproverDraft with checking for non-null required values
     * @return RuleApproverDraft
     */
    public RuleApproverDraft build() {
        Objects.requireNonNull(associateRole, RuleApproverDraft.class + ": associateRole is missing");
        return new RuleApproverDraftImpl(associateRole);
    }

    /**
     * builds RuleApproverDraft without checking for non-null required values
     * @return RuleApproverDraft
     */
    public RuleApproverDraft buildUnchecked() {
        return new RuleApproverDraftImpl(associateRole);
    }

    /**
     * factory method for an instance of RuleApproverDraftBuilder
     * @return builder
     */
    public static RuleApproverDraftBuilder of() {
        return new RuleApproverDraftBuilder();
    }

    /**
     * create builder for RuleApproverDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleApproverDraftBuilder of(final RuleApproverDraft template) {
        RuleApproverDraftBuilder builder = new RuleApproverDraftBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
