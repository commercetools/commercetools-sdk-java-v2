
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RuleApproverBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleApprover ruleApprover = RuleApprover.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleApproverBuilder implements Builder<RuleApprover> {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleApproverBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleApproverBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReference> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public RuleApproverBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     * builds RuleApprover with checking for non-null required values
     * @return RuleApprover
     */
    public RuleApprover build() {
        Objects.requireNonNull(associateRole, RuleApprover.class + ": associateRole is missing");
        return new RuleApproverImpl(associateRole);
    }

    /**
     * builds RuleApprover without checking for non-null required values
     * @return RuleApprover
     */
    public RuleApprover buildUnchecked() {
        return new RuleApproverImpl(associateRole);
    }

    /**
     * factory method for an instance of RuleApproverBuilder
     * @return builder
     */
    public static RuleApproverBuilder of() {
        return new RuleApproverBuilder();
    }

    /**
     * create builder for RuleApprover instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleApproverBuilder of(final RuleApprover template) {
        RuleApproverBuilder builder = new RuleApproverBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
