
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

    private com.commercetools.history.models.common.KeyReference associateRole;

    private com.commercetools.history.models.common.KeyReference source;

    /**
     * set the value to the associateRole using the builder function
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.associateRole = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the associateRole using the builder function
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withAssociateRole(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.associateRole = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the associateRole
     * @param associateRole value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder associateRole(
            final com.commercetools.history.models.common.KeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     * set the value to the source using the builder function
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.source = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the source using the builder function
     * @param builder function to build the source value
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder withSource(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.source = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the source
     * @param source value to be set
     * @return Builder
     */

    public InheritedAssociateRoleAssignmentBuilder source(
            final com.commercetools.history.models.common.KeyReference source) {
        this.source = source;
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
     * value of source}
     * @return source
     */

    public com.commercetools.history.models.common.KeyReference getSource() {
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
