
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to an AttributeGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupReference attributeGroupReference = AttributeGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupReferenceImpl.class)
public interface AttributeGroupReference extends Reference, com.commercetools.api.models.Identifiable<AttributeGroup> {

    /**
     * discriminator value for AttributeGroupReference
     */
    String ATTRIBUTE_GROUP = "attribute-group";

    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public AttributeGroup getObj();

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @param obj value to be set
     */

    public void setObj(final AttributeGroup obj);

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of AttributeGroupReference
     */
    public static AttributeGroupReference of() {
        return new AttributeGroupReferenceImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupReference of(final AttributeGroupReference template) {
        AttributeGroupReferenceImpl instance = new AttributeGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupReference deepCopy(@Nullable final AttributeGroupReference template) {
        if (template == null) {
            return null;
        }
        AttributeGroupReferenceImpl instance = new AttributeGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(Optional.ofNullable(template.getObj())
                .map(com.commercetools.api.models.attribute_group.AttributeGroup::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupReference
     * @return builder
     */
    public static AttributeGroupReferenceBuilder builder() {
        return AttributeGroupReferenceBuilder.of();
    }

    /**
     * create builder for AttributeGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupReferenceBuilder builder(final AttributeGroupReference template) {
        return AttributeGroupReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupReference(Function<AttributeGroupReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupReference>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupReference>";
            }
        };
    }
}
