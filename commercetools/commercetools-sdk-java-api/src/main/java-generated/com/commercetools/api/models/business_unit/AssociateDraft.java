
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AssociateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateDraft associateDraft = AssociateDraft.builder()
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateDraftImpl.class)
public interface AssociateDraft extends io.vrap.rmf.base.client.Draft<AssociateDraft> {

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<AssociateRoleAssignmentDraft> getAssociateRoleAssignments();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> to be part of the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    @JsonIgnore
    public void setAssociateRoleAssignments(final AssociateRoleAssignmentDraft... associateRoleAssignments);

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<AssociateRoleAssignmentDraft> associateRoleAssignments);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> to be part of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

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
        instance.setAssociateRoleAssignments(template.getAssociateRoleAssignments());
        instance.setCustomer(template.getCustomer());
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
        instance.setAssociateRoleAssignments(Optional.ofNullable(template.getAssociateRoleAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
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
