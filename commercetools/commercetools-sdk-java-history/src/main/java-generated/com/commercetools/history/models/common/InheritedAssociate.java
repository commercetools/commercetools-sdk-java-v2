
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
 * InheritedAssociate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InheritedAssociate inheritedAssociate = InheritedAssociate.builder()
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InheritedAssociateImpl.class)
public interface InheritedAssociate {

    /**
     *
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<InheritedAssociateRoleAssignment> getAssociateRoleAssignments();

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
    public void setAssociateRoleAssignments(final InheritedAssociateRoleAssignment... associateRoleAssignments);

    /**
     * set associateRoleAssignments
     * @param associateRoleAssignments values to be set
     */

    public void setAssociateRoleAssignments(final List<InheritedAssociateRoleAssignment> associateRoleAssignments);

    /**
     * set customer
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     * factory method
     * @return instance of InheritedAssociate
     */
    public static InheritedAssociate of() {
        return new InheritedAssociateImpl();
    }

    /**
     * factory method to create a shallow copy InheritedAssociate
     * @param template instance to be copied
     * @return copy instance
     */
    public static InheritedAssociate of(final InheritedAssociate template) {
        InheritedAssociateImpl instance = new InheritedAssociateImpl();
        instance.setAssociateRoleAssignments(template.getAssociateRoleAssignments());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public InheritedAssociate copyDeep();

    /**
     * factory method to create a deep copy of InheritedAssociate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InheritedAssociate deepCopy(@Nullable final InheritedAssociate template) {
        if (template == null) {
            return null;
        }
        InheritedAssociateImpl instance = new InheritedAssociateImpl();
        instance.setAssociateRoleAssignments(Optional.ofNullable(template.getAssociateRoleAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.InheritedAssociateRoleAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for InheritedAssociate
     * @return builder
     */
    public static InheritedAssociateBuilder builder() {
        return InheritedAssociateBuilder.of();
    }

    /**
     * create builder for InheritedAssociate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InheritedAssociateBuilder builder(final InheritedAssociate template) {
        return InheritedAssociateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInheritedAssociate(Function<InheritedAssociate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InheritedAssociate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InheritedAssociate>() {
            @Override
            public String toString() {
                return "TypeReference<InheritedAssociate>";
            }
        };
    }
}
