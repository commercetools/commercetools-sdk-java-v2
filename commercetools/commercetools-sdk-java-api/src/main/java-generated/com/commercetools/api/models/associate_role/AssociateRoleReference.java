
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to an AssociateRole.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleReference associateRoleReference = AssociateRoleReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleReferenceImpl.class)
public interface AssociateRoleReference extends Reference {

    /**
     * discriminator value for AssociateRoleReference
     */
    String ASSOCIATE_ROLE = "associate-role";

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with Reference Expansion for AssociateRole.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public AssociateRole getObj();

    /**
     *  <p>Unique identifier of the referenced AssociateRole.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with Reference Expansion for AssociateRole.</p>
     * @param obj value to be set
     */

    public void setObj(final AssociateRole obj);

    /**
     *  <p>Unique identifier of the referenced AssociateRole.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of AssociateRoleReference
     */
    public static AssociateRoleReference of() {
        return new AssociateRoleReferenceImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleReference of(final AssociateRoleReference template) {
        AssociateRoleReferenceImpl instance = new AssociateRoleReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleReference deepCopy(@Nullable final AssociateRoleReference template) {
        if (template == null) {
            return null;
        }
        AssociateRoleReferenceImpl instance = new AssociateRoleReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.associate_role.AssociateRole.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleReference
     * @return builder
     */
    public static AssociateRoleReferenceBuilder builder() {
        return AssociateRoleReferenceBuilder.of();
    }

    /**
     * create builder for AssociateRoleReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleReferenceBuilder builder(final AssociateRoleReference template) {
        return AssociateRoleReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleReference(Function<AssociateRoleReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleReference>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleReference>";
            }
        };
    }
}
