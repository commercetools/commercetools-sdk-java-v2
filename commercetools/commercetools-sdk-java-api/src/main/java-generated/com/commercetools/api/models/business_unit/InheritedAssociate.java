package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.business_unit.InheritedAssociateImpl;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = InheritedAssociateImpl.class)
public interface InheritedAssociate  {


    /**
     *  <p>Inherited roles of the Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoleAssignments")
    public List<InheritedAssociateRoleAssignment> getAssociateRoleAssignments();
    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Inherited roles of the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */
    
    @JsonIgnore
    public void setAssociateRoleAssignments(final InheritedAssociateRoleAssignment ...associateRoleAssignments);
    /**
     *  <p>Inherited roles of the Associate within a Business Unit.</p>
     * @param associateRoleAssignments values to be set
     */
    
    public void setAssociateRoleAssignments(final List<InheritedAssociateRoleAssignment> associateRoleAssignments);
    
    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerReference customer);
    

    /**
     * factory method
     * @return instance of InheritedAssociate
     */
    public static InheritedAssociate of(){
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
                .map(t -> t.stream().map(com.commercetools.api.models.business_unit.InheritedAssociateRoleAssignment::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
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
