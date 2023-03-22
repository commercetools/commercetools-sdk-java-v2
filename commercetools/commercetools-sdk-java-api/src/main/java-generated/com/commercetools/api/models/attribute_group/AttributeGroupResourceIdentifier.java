
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to an AttributeGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupResourceIdentifier attributeGroupResourceIdentifier = AttributeGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupResourceIdentifierImpl.class)
public interface AttributeGroupResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<AttributeGroup> {

    String ATTRIBUTE_GROUP = "attribute-group";

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static AttributeGroupResourceIdentifier of() {
        return new AttributeGroupResourceIdentifierImpl();
    }

    public static AttributeGroupResourceIdentifier of(final AttributeGroupResourceIdentifier template) {
        AttributeGroupResourceIdentifierImpl instance = new AttributeGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static AttributeGroupResourceIdentifierBuilder builder() {
        return AttributeGroupResourceIdentifierBuilder.of();
    }

    public static AttributeGroupResourceIdentifierBuilder builder(final AttributeGroupResourceIdentifier template) {
        return AttributeGroupResourceIdentifierBuilder.of(template);
    }

    default <T> T withAttributeGroupResourceIdentifier(Function<AttributeGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupResourceIdentifier>";
            }
        };
    }
}
