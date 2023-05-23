
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleAssignment
 *
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
@JsonDeserialize(as = AssociateRoleAssignmentImpl.class)
public interface AssociateRoleAssignment {

    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleKeyReference getAssociateRole();

    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @return inheritance
     */
    @NotNull
    @JsonProperty("inheritance")
    public AssociateRoleInheritanceMode getInheritance();

    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleKeyReference associateRole);

    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     * @param inheritance value to be set
     */

    public void setInheritance(final AssociateRoleInheritanceMode inheritance);

    /**
     * factory method
     * @return instance of AssociateRoleAssignment
     */
    public static AssociateRoleAssignment of() {
        return new AssociateRoleAssignmentImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleAssignment of(final AssociateRoleAssignment template) {
        AssociateRoleAssignmentImpl instance = new AssociateRoleAssignmentImpl();
        instance.setAssociateRole(template.getAssociateRole());
        instance.setInheritance(template.getInheritance());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleAssignment deepCopy(@Nullable final AssociateRoleAssignment template) {
        if (template == null) {
            return null;
        }
        AssociateRoleAssignmentImpl instance = new AssociateRoleAssignmentImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleKeyReference
                .deepCopy(template.getAssociateRole()));
        instance.setInheritance(template.getInheritance());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleAssignment
     * @return builder
     */
    public static AssociateRoleAssignmentBuilder builder() {
        return AssociateRoleAssignmentBuilder.of();
    }

    /**
     * create builder for AssociateRoleAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAssignmentBuilder builder(final AssociateRoleAssignment template) {
        return AssociateRoleAssignmentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleAssignment(Function<AssociateRoleAssignment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleAssignment>";
            }
        };
    }
}
