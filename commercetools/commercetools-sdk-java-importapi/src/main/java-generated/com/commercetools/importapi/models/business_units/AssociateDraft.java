
package com.commercetools.importapi.models.business_units;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Draft for an Associate in a Business Unit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateDraft associateDraft = AssociateDraft.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateDraftImpl.class)
public interface AssociateDraft extends io.vrap.rmf.base.client.Draft<AssociateDraft> {

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerKeyReference getCustomer();

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<AssociateRoleAssignmentDraft> getAssociateRoleAssignments();

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerKeyReference customer);

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param associateRoleAssignments values to be set
     */

    @JsonIgnore
    public void setAssociateRoleAssignments(final AssociateRoleAssignmentDraft... associateRoleAssignments);

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<AssociateRoleAssignmentDraft> associateRoleAssignments);

    /**
     * factory method
     * @return instance of AssociateDraft
     */
    public static AssociateDraft of() {
        return new AssociateDraftImpl();
    }

    /**
     * factory method to create a shallow copy AssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateDraft of(final AssociateDraft template) {
        AssociateDraftImpl instance = new AssociateDraftImpl();
        instance.setCustomer(template.getCustomer());
        instance.setAssociateRoleAssignments(template.getAssociateRoleAssignments());
        return instance;
    }

    public AssociateDraft copyDeep();

    /**
     * factory method to create a deep copy of AssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateDraft deepCopy(@Nullable final AssociateDraft template) {
        if (template == null) {
            return null;
        }
        AssociateDraftImpl instance = new AssociateDraftImpl();
        instance.setCustomer(
            com.commercetools.importapi.models.common.CustomerKeyReference.deepCopy(template.getCustomer()));
        instance.setAssociateRoleAssignments(Optional.ofNullable(template.getAssociateRoleAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateDraft
     * @return builder
     */
    public static AssociateDraftBuilder builder() {
        return AssociateDraftBuilder.of();
    }

    /**
     * create builder for AssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateDraftBuilder builder(final AssociateDraft template) {
        return AssociateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateDraft(Function<AssociateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateDraft>";
            }
        };
    }
}
