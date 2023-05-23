
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetBusinessUnitAssociateRoleOnCreationAction projectSetBusinessUnitAssociateRoleOnCreationAction = ProjectSetBusinessUnitAssociateRoleOnCreationAction.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder
        implements Builder<ProjectSetBusinessUnitAssociateRoleOnCreationAction> {

    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier getAssociateRole() {
        return this.associateRole;
    }

    /**
     * builds ProjectSetBusinessUnitAssociateRoleOnCreationAction with checking for non-null required values
     * @return ProjectSetBusinessUnitAssociateRoleOnCreationAction
     */
    public ProjectSetBusinessUnitAssociateRoleOnCreationAction build() {
        Objects.requireNonNull(associateRole,
            ProjectSetBusinessUnitAssociateRoleOnCreationAction.class + ": associateRole is missing");
        return new ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl(associateRole);
    }

    /**
     * builds ProjectSetBusinessUnitAssociateRoleOnCreationAction without checking for non-null required values
     * @return ProjectSetBusinessUnitAssociateRoleOnCreationAction
     */
    public ProjectSetBusinessUnitAssociateRoleOnCreationAction buildUnchecked() {
        return new ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl(associateRole);
    }

    /**
     * factory method for an instance of ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder
     * @return builder
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder of() {
        return new ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder();
    }

    /**
     * create builder for ProjectSetBusinessUnitAssociateRoleOnCreationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder of(
            final ProjectSetBusinessUnitAssociateRoleOnCreationAction template) {
        ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder builder = new ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
