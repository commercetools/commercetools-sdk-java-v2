package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier;
import com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode;
import com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * AssociateRoleAssignmentDraft
 *
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
@JsonDeserialize(as = AssociateRoleAssignmentDraftImpl.class)
public interface AssociateRoleAssignmentDraft extends io.vrap.rmf.base.client.Draft<AssociateRoleAssignmentDraft> {


    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleResourceIdentifier getAssociateRole();
    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @return inheritance
     */
    
    @JsonProperty("inheritance")
    public AssociateRoleInheritanceMode getInheritance();

    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     */
    
    public void setAssociateRole(final AssociateRoleResourceIdentifier associateRole);
    
    
    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @param inheritance value to be set
     */
    
    public void setInheritance(final AssociateRoleInheritanceMode inheritance);
    

    /**
     * factory method
     * @return instance of AssociateRoleAssignmentDraft
     */
    public static AssociateRoleAssignmentDraft of(){
        return new AssociateRoleAssignmentDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleAssignmentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleAssignmentDraft of(final AssociateRoleAssignmentDraft template) {
        AssociateRoleAssignmentDraftImpl instance = new AssociateRoleAssignmentDraftImpl();
        instance.setAssociateRole(template.getAssociateRole());
        instance.setInheritance(template.getInheritance());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleAssignmentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleAssignmentDraft deepCopy(@Nullable final AssociateRoleAssignmentDraft template) {
        if (template == null) {
            return null;
        }
        AssociateRoleAssignmentDraftImpl instance = new AssociateRoleAssignmentDraftImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier.deepCopy(template.getAssociateRole()));
        instance.setInheritance(template.getInheritance());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleAssignmentDraft
     * @return builder
     */
    public static AssociateRoleAssignmentDraftBuilder builder() {
        return AssociateRoleAssignmentDraftBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleAssignmentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAssignmentDraftBuilder builder(final AssociateRoleAssignmentDraft template) {
        return AssociateRoleAssignmentDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleAssignmentDraft(Function<AssociateRoleAssignmentDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAssignmentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAssignmentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleAssignmentDraft>";
            }
        };
    }
}
