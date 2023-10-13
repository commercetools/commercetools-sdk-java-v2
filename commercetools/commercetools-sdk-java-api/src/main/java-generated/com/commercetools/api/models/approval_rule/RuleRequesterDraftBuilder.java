
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RuleRequesterDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleRequesterDraft ruleRequesterDraft = RuleRequesterDraft.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleRequesterDraftBuilder implements Builder<RuleRequesterDraft> {

    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;

    /**
     *  <p>The Associate Role that an Associate must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleRequesterDraftBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Associate Role that an Associate must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleRequesterDraftBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Associate Role that an Associate must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public RuleRequesterDraftBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>The Associate Role that an Associate must hold for the Approval Rule to apply to the Orders they create.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier getAssociateRole() {
        return this.associateRole;
    }

    /**
     * builds RuleRequesterDraft with checking for non-null required values
     * @return RuleRequesterDraft
     */
    public RuleRequesterDraft build() {
        Objects.requireNonNull(associateRole, RuleRequesterDraft.class + ": associateRole is missing");
        return new RuleRequesterDraftImpl(associateRole);
    }

    /**
     * builds RuleRequesterDraft without checking for non-null required values
     * @return RuleRequesterDraft
     */
    public RuleRequesterDraft buildUnchecked() {
        return new RuleRequesterDraftImpl(associateRole);
    }

    /**
     * factory method for an instance of RuleRequesterDraftBuilder
     * @return builder
     */
    public static RuleRequesterDraftBuilder of() {
        return new RuleRequesterDraftBuilder();
    }

    /**
     * create builder for RuleRequesterDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleRequesterDraftBuilder of(final RuleRequesterDraft template) {
        RuleRequesterDraftBuilder builder = new RuleRequesterDraftBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
