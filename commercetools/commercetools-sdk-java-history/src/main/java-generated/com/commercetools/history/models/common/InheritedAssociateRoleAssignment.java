
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InheritedAssociateRoleAssignmentImpl.class)
public interface InheritedAssociateRoleAssignment {

    /**
     *
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public KeyReference getAssociateRole();

    /**
     *
     * @return source
     */
    @NotNull
    @Valid
    @JsonProperty("source")
    public KeyReference getSource();

    /**
     * set associateRole
     * @param associateRole value to be set
     */

    public void setAssociateRole(final KeyReference associateRole);

    /**
     * set source
     * @param source value to be set
     */

    public void setSource(final KeyReference source);

    /**
     * factory method
     * @return instance of InheritedAssociateRoleAssignment
     */
    public static InheritedAssociateRoleAssignment of() {
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

    public InheritedAssociateRoleAssignment copyDeep();

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
        instance.setAssociateRole(
            com.commercetools.history.models.common.KeyReference.deepCopy(template.getAssociateRole()));
        instance.setSource(com.commercetools.history.models.common.KeyReference.deepCopy(template.getSource()));
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
