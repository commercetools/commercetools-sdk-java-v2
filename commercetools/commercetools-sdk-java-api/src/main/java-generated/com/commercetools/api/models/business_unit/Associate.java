
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Associate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Associate associate = Associate.builder()
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateImpl.class)
public interface Associate {

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<AssociateRoleAssignment> getAssociateRoleAssignments();

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    @JsonIgnore
    public void setAssociateRoleAssignments(final AssociateRoleAssignment... associateRoleAssignments);

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<AssociateRoleAssignment> associateRoleAssignments);

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     * factory method
     * @return instance of Associate
     */
    public static Associate of() {
        return new AssociateImpl();
    }

    /**
     * factory method to create a shallow copy Associate
     * @param template instance to be copied
     * @return copy instance
     */
    public static Associate of(final Associate template) {
        AssociateImpl instance = new AssociateImpl();
        instance.setAssociateRoleAssignments(template.getAssociateRoleAssignments());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of Associate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Associate deepCopy(@Nullable final Associate template) {
        if (template == null) {
            return null;
        }
        AssociateImpl instance = new AssociateImpl();
        instance.setAssociateRoleAssignments(Optional.ofNullable(template.getAssociateRoleAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.AssociateRoleAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for Associate
     * @return builder
     */
    public static AssociateBuilder builder() {
        return AssociateBuilder.of();
    }

    /**
     * create builder for Associate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateBuilder builder(final Associate template) {
        return AssociateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociate(Function<Associate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Associate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Associate>() {
            @Override
            public String toString() {
                return "TypeReference<Associate>";
            }
        };
    }
}
