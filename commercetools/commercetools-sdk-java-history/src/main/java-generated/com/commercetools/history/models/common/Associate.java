
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     *
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<AssociateRoleAssignment> getAssociateRoleAssignments();

    /**
     *
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     * set associateRoleAssignments
     * @param associateRoleAssignments values to be set
     */

    @JsonIgnore
    public void setAssociateRoleAssignments(final AssociateRoleAssignment... associateRoleAssignments);

    /**
     * set associateRoleAssignments
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<AssociateRoleAssignment> associateRoleAssignments);

    /**
     * set customer
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

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

    public Associate copyDeep();

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
                        .map(com.commercetools.history.models.common.AssociateRoleAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
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
