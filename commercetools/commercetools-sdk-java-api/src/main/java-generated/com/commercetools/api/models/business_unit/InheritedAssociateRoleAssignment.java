package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignmentImpl;

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
 * InheritedAssociateRoleAssignment
 *
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = InheritedAssociateRoleAssignmentImpl.class)
public interface InheritedAssociateRoleAssignment  {


    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleKeyReference getAssociateRole();
    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @return source
     */
    @NotNull
    @Valid
    @JsonProperty("source")
    public BusinessUnitKeyReference getSource();

    /**
     *  <p>Inherited role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     */
    
    public void setAssociateRole(final AssociateRoleKeyReference associateRole);
    
    
    /**
     *  <p>Reference to the parent Business Unit where the assignment is defined explicitly.</p>
     * @param source value to be set
     */
    
    public void setSource(final BusinessUnitKeyReference source);
    

    /**
     * factory method
     * @return instance of InheritedAssociateRoleAssignment
     */
    public static InheritedAssociateRoleAssignment of(){
        return new InheritedAssociateRoleAssignmentImpl();
    }
    

    /**
     * factory method to create a shallow copy InheritedAssociateRoleAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    public static InheritedAssociateRoleAssignment of(final InheritedAssociateRoleAssignment template) {
        InheritedAssociateRoleAssignmentImpl instance = new InheritedAssociateRoleAssignmentImpl();
        instance.setAssociateRole(template.getAssociateRole());
        instance.setSource(template.getSource());
        return instance;
    }

    /**
     * factory method to create a deep copy of InheritedAssociateRoleAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InheritedAssociateRoleAssignment deepCopy(@Nullable final InheritedAssociateRoleAssignment template) {
        if (template == null) {
            return null;
        }
        InheritedAssociateRoleAssignmentImpl instance = new InheritedAssociateRoleAssignmentImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleKeyReference.deepCopy(template.getAssociateRole()));
        instance.setSource(com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getSource()));
        return instance;
    }

    /**
     * builder factory method for InheritedAssociateRoleAssignment
     * @return builder
     */
    public static InheritedAssociateRoleAssignmentBuilder builder() {
        return InheritedAssociateRoleAssignmentBuilder.of();
    }
    
    /**
     * create builder for InheritedAssociateRoleAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InheritedAssociateRoleAssignmentBuilder builder(final InheritedAssociateRoleAssignment template) {
        return InheritedAssociateRoleAssignmentBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInheritedAssociateRoleAssignment(Function<InheritedAssociateRoleAssignment, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InheritedAssociateRoleAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InheritedAssociateRoleAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<InheritedAssociateRoleAssignment>";
            }
        };
    }
}
