
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TypeResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleResourceIdentifier associateRoleResourceIdentifier = AssociateRoleResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("associate-role")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleResourceIdentifierImpl.class)
public interface AssociateRoleResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<AssociateRole> {

    /**
     * discriminator value for AssociateRoleResourceIdentifier
     */
    String ASSOCIATE_ROLE = "associate-role";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AssociateRoleResourceIdentifier
     */
    public static AssociateRoleResourceIdentifier of() {
        return new AssociateRoleResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleResourceIdentifier of(final AssociateRoleResourceIdentifier template) {
        AssociateRoleResourceIdentifierImpl instance = new AssociateRoleResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public AssociateRoleResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleResourceIdentifier deepCopy(@Nullable final AssociateRoleResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        AssociateRoleResourceIdentifierImpl instance = new AssociateRoleResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleResourceIdentifier
     * @return builder
     */
    public static AssociateRoleResourceIdentifierBuilder builder() {
        return AssociateRoleResourceIdentifierBuilder.of();
    }

    /**
     * create builder for AssociateRoleResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleResourceIdentifierBuilder builder(final AssociateRoleResourceIdentifier template) {
        return AssociateRoleResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleResourceIdentifier(Function<AssociateRoleResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleResourceIdentifier>";
            }
        };
    }
}
