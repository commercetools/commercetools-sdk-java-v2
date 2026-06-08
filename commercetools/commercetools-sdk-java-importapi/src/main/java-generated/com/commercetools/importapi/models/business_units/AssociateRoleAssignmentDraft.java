
package com.commercetools.importapi.models.business_units;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.AssociateRoleKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The role of an Associate in a Business Unit.</p>
 *
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
@JsonDeserialize(as = AssociateRoleAssignmentDraftImpl.class)
public interface AssociateRoleAssignmentDraft extends io.vrap.rmf.base.client.Draft<AssociateRoleAssignmentDraft> {

    /**
     *  <p>The role to assign to the Associate.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleKeyReference getAssociateRole();

    /**
     *  <p>Determines whether the AssociateRole is inherited. If <code>Disabled</code>, the AssociateRole is not inherited from a parent Business Unit.</p>
     * @return inheritance
     */
    @NotNull
    @JsonProperty("inheritance")
    public AssociateRoleInheritanceMode getInheritance();

    /**
     *  <p>The role to assign to the Associate.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleKeyReference associateRole);

    /**
     *  <p>Determines whether the AssociateRole is inherited. If <code>Disabled</code>, the AssociateRole is not inherited from a parent Business Unit.</p>
     * @param inheritance value to be set
     */

    public void setInheritance(final AssociateRoleInheritanceMode inheritance);

    /**
     * factory method
     * @return instance of AssociateRoleAssignmentDraft
     */
    public static AssociateRoleAssignmentDraft of() {
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

    public AssociateRoleAssignmentDraft copyDeep();

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
        instance.setAssociateRole(
            com.commercetools.importapi.models.common.AssociateRoleKeyReference.deepCopy(template.getAssociateRole()));
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
