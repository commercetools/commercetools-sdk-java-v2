
package com.commercetools.importapi.models.business_units;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleAssignmentDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleAssignmentDraft associateRoleAssignmentDraft = AssociateRoleAssignmentDraft.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .inheritance(AssociateRoleInheritanceMode.ENABLED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAssignmentDraftBuilder implements Builder<AssociateRoleAssignmentDraft> {

    private com.commercetools.importapi.models.common.AssociateRoleKeyReference associateRole;

    private com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode inheritance;

    /**
     *  <p>The role to assign to the Associate.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public AssociateRoleAssignmentDraftBuilder associateRole(
            Function<com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder, com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The role to assign to the Associate.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public AssociateRoleAssignmentDraftBuilder withAssociateRole(
            Function<com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder, com.commercetools.importapi.models.common.AssociateRoleKeyReference> builder) {
        this.associateRole = builder
                .apply(com.commercetools.importapi.models.common.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The role to assign to the Associate.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public AssociateRoleAssignmentDraftBuilder associateRole(
            final com.commercetools.importapi.models.common.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Determines whether the AssociateRole is inherited. If <code>Disabled</code>, the AssociateRole is not inherited from a parent Business Unit.</p>
     * @param inheritance value to be set
     * @return Builder
     */

    public AssociateRoleAssignmentDraftBuilder inheritance(
            final com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode inheritance) {
        this.inheritance = inheritance;
        return this;
    }

    /**
     *  <p>The role to assign to the Associate.</p>
     * @return associateRole
     */

    public com.commercetools.importapi.models.common.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Determines whether the AssociateRole is inherited. If <code>Disabled</code>, the AssociateRole is not inherited from a parent Business Unit.</p>
     * @return inheritance
     */

    public com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode getInheritance() {
        return this.inheritance;
    }

    /**
     * builds AssociateRoleAssignmentDraft with checking for non-null required values
     * @return AssociateRoleAssignmentDraft
     */
    public AssociateRoleAssignmentDraft build() {
        Objects.requireNonNull(associateRole, AssociateRoleAssignmentDraft.class + ": associateRole is missing");
        Objects.requireNonNull(inheritance, AssociateRoleAssignmentDraft.class + ": inheritance is missing");
        return new AssociateRoleAssignmentDraftImpl(associateRole, inheritance);
    }

    /**
     * builds AssociateRoleAssignmentDraft without checking for non-null required values
     * @return AssociateRoleAssignmentDraft
     */
    public AssociateRoleAssignmentDraft buildUnchecked() {
        return new AssociateRoleAssignmentDraftImpl(associateRole, inheritance);
    }

    /**
     * factory method for an instance of AssociateRoleAssignmentDraftBuilder
     * @return builder
     */
    public static AssociateRoleAssignmentDraftBuilder of() {
        return new AssociateRoleAssignmentDraftBuilder();
    }

    /**
     * create builder for AssociateRoleAssignmentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAssignmentDraftBuilder of(final AssociateRoleAssignmentDraft template) {
        AssociateRoleAssignmentDraftBuilder builder = new AssociateRoleAssignmentDraftBuilder();
        builder.associateRole = template.getAssociateRole();
        builder.inheritance = template.getInheritance();
        return builder;
    }

}
