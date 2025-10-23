
package com.commercetools.history.models.common;

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

    private com.commercetools.history.models.common.AssociateRoleKeyReference associateRole;

    private com.commercetools.history.models.common.BusinessUnitKeyReference source;

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            Function<com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder, com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withAssociateRole(
            Function<com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder, com.commercetools.history.models.common.AssociateRoleKeyReference> builder) {
        this.associateRole = builder
                .apply(com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            final com.commercetools.history.models.common.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            Function<com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder, com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder> builder) {
        this.source = builder.apply(com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withSource(
            Function<com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder, com.commercetools.history.models.common.BusinessUnitKeyReference> builder) {
        this.source = builder.apply(com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param source value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            final com.commercetools.history.models.common.BusinessUnitKeyReference source) {
        this.source = source;
        return this;
    }

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */

    public com.commercetools.history.models.common.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @return source
     */

    public com.commercetools.history.models.common.BusinessUnitKeyReference getSource() {
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
