
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String ATTRIBUTE_GROUP = "attribute-group";

    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     */
    @Valid
    @JsonProperty("obj")
    public AttributeGroup getObj();

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final AttributeGroup obj);

    public void setId(final String id);

    public static AttributeGroupReference of() {
        return new AttributeGroupReferenceImpl();
    }

    public static AttributeGroupReference of(final AttributeGroupReference template) {
        AttributeGroupReferenceImpl instance = new AttributeGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static AttributeGroupReferenceBuilder builder() {
        return AttributeGroupReferenceBuilder.of();
    }

    public static AttributeGroupReferenceBuilder builder(final AttributeGroupReference template) {
        return AttributeGroupReferenceBuilder.of(template);
    }

    default <T> T withAttributeGroupReference(Function<AttributeGroupReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupReference>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupReference>";
            }
        };
    }
}
