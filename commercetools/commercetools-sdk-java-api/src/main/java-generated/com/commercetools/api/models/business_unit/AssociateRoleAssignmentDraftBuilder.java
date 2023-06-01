package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier;
import com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode;
import com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleAssignmentDraftBuilder implements Builder<AssociateRoleAssignmentDraft> {

    
    
    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;
    
    
    @Nullable
    private com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode inheritance;

    
    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */
    
    public AssociateRoleAssignmentDraftBuilder associateRole(Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder> builder) {
        this.associateRole = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */
    
    public AssociateRoleAssignmentDraftBuilder withAssociateRole(Function<com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder, com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier> builder) {
        this.associateRole = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     * @return Builder
     */
    
    public AssociateRoleAssignmentDraftBuilder associateRole( final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
        return this;
    }
    
    
    
    
    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @param inheritance value to be set
     * @return Builder
     */
    
    public AssociateRoleAssignmentDraftBuilder inheritance(@Nullable final com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode inheritance) {
        this.inheritance = inheritance;
        return this;
    }
    
    

    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */
    
    
    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier getAssociateRole(){
        return this.associateRole;
    }
    
    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @return inheritance
     */
    
    @Nullable
    public com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode getInheritance(){
        return this.inheritance;
    }

    /**
     * builds AssociateRoleAssignmentDraft with checking for non-null required values
     * @return AssociateRoleAssignmentDraft
     */
    public AssociateRoleAssignmentDraft build() {
        Objects.requireNonNull(associateRole, AssociateRoleAssignmentDraft.class + ": associateRole is missing");
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
