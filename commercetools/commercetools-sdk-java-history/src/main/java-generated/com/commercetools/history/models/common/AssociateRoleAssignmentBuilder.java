
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleAssignmentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleAssignment associateRoleAssignment = AssociateRoleAssignment.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .inheritance(AssociateRoleInheritanceMode.ENABLED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAssignmentBuilder implements Builder<AssociateRoleAssignment> {

    private com.commercetools.history.models.common.KeyReference associateRole;

    private com.commercetools.history.models.common.AssociateRoleInheritanceMode inheritance;

    /**
     * set the value to the associateRole using the builder function
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public AssociateRoleAssignmentBuilder associateRole(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.associateRole = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the associateRole using the builder function
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public AssociateRoleAssignmentBuilder withAssociateRole(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.associateRole = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the associateRole
     * @param associateRole value to be set
     * @return Builder
     */

    public AssociateRoleAssignmentBuilder associateRole(
            final com.commercetools.history.models.common.KeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Determines whether an AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @param inheritance value to be set
     * @return Builder
     */

    public AssociateRoleAssignmentBuilder inheritance(
            final com.commercetools.history.models.common.AssociateRoleInheritanceMode inheritance) {
        this.inheritance = inheritance;
        return this;
    }

    /**
     * value of associateRole}
     * @return associateRole
     */

    public com.commercetools.history.models.common.KeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Determines whether an AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @return inheritance
     */

    public com.commercetools.history.models.common.AssociateRoleInheritanceMode getInheritance() {
        return this.inheritance;
    }

    /**
     * builds AssociateRoleAssignment with checking for non-null required values
     * @return AssociateRoleAssignment
     */
    public AssociateRoleAssignment build() {
        Objects.requireNonNull(associateRole, AssociateRoleAssignment.class + ": associateRole is missing");
        Objects.requireNonNull(inheritance, AssociateRoleAssignment.class + ": inheritance is missing");
        return new AssociateRoleAssignmentImpl(associateRole, inheritance);
    }

    /**
     * builds AssociateRoleAssignment without checking for non-null required values
     * @return AssociateRoleAssignment
     */
    public AssociateRoleAssignment buildUnchecked() {
        return new AssociateRoleAssignmentImpl(associateRole, inheritance);
    }

    /**
     * factory method for an instance of AssociateRoleAssignmentBuilder
     * @return builder
     */
    public static AssociateRoleAssignmentBuilder of() {
        return new AssociateRoleAssignmentBuilder();
    }

    /**
     * create builder for AssociateRoleAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAssignmentBuilder of(final AssociateRoleAssignment template) {
        AssociateRoleAssignmentBuilder builder = new AssociateRoleAssignmentBuilder();
        builder.associateRole = template.getAssociateRole();
        builder.inheritance = template.getInheritance();
        return builder;
    }

}
