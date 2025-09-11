
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("attribute-group")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupResourceIdentifierImpl.class)
public interface AttributeGroupResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<AttributeGroup> {

    /**
     * discriminator value for AttributeGroupResourceIdentifier
     */
    String ATTRIBUTE_GROUP = "attribute-group";

    /**
     *  <p>Platform-generated unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-generated unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Platform-generated unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-generated unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeGroup" rel="nofollow">AttributeGroup</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AttributeGroupResourceIdentifier
     */
    public static AttributeGroupResourceIdentifier of() {
        return new AttributeGroupResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupResourceIdentifier of(final AttributeGroupResourceIdentifier template) {
        AttributeGroupResourceIdentifierImpl instance = new AttributeGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public AttributeGroupResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupResourceIdentifier deepCopy(@Nullable final AttributeGroupResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        AttributeGroupResourceIdentifierImpl instance = new AttributeGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AttributeGroupResourceIdentifier
     * @return builder
     */
    public static AttributeGroupResourceIdentifierBuilder builder() {
        return AttributeGroupResourceIdentifierBuilder.of();
    }

    /**
     * create builder for AttributeGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupResourceIdentifierBuilder builder(final AttributeGroupResourceIdentifier template) {
        return AttributeGroupResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupResourceIdentifier(Function<AttributeGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupResourceIdentifier>";
            }
        };
    }
}
