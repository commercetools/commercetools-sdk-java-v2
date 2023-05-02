
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InheritedAssociateRoleAssignmentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InheritedAssociateRoleAssignment inheritedAssociateRoleAssignment = InheritedAssociateRoleAssignment.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .source(sourceBuilder -> sourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InheritedAssociateRoleAssignmentBuilder implements Builder<InheritedAssociateRoleAssignment> {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference source;

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReference> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.source = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withSource(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.source = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param source value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference source) {
        this.source = source;
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @return source
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getSource() {
        return this.source;
    }

    /**
     * builds InheritedAssociateRoleAssignment with checking for non-null required values
     * @return InheritedAssociateRoleAssignment
     */
    public InheritedAssociateRoleAssignment build() {
        Objects.requireNonNull(associateRole, InheritedAssociateRoleAssignment.class + ": associateRole is missing");
        Objects.requireNonNull(source, InheritedAssociateRoleAssignment.class + ": source is missing");
        return new InheritedAssociateRoleAssignmentImpl(associateRole, source);
    }

    /**
     * builds InheritedAssociateRoleAssignment without checking for non-null required values
     * @return InheritedAssociateRoleAssignment
     */
    public InheritedAssociateRoleAssignment buildUnchecked() {
        return new InheritedAssociateRoleAssignmentImpl(associateRole, source);
    }

    /**
     * factory method for an instance of InheritedAssociateRoleAssignmentBuilder
     * @return builder
     */
    public static InheritedAssociateRoleAssignmentBuilder of() {
        return new InheritedAssociateRoleAssignmentBuilder();
    }

    /**
     * create builder for InheritedAssociateRoleAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InheritedAssociateRoleAssignmentBuilder of(final InheritedAssociateRoleAssignment template) {
        InheritedAssociateRoleAssignmentBuilder builder = new InheritedAssociateRoleAssignmentBuilder();
        builder.associateRole = template.getAssociateRole();
        builder.source = template.getSource();
        return builder;
    }

}
