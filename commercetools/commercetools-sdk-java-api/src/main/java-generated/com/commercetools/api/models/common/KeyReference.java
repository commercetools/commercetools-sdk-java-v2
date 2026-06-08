
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A KeyReference represents a loose reference to another resource in the same Project identified by the resource's <code>key</code> field. If available, the <code>key</code> is immutable and mandatory. KeyReferences do not support <span>Reference Expansion</span>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     KeyReference keyReference = KeyReference.associateRoleBuilder()
 *             key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = KeyReferenceImpl.class, visible = true)
@JsonDeserialize(as = KeyReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface KeyReference extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>User-defined unique and immutable key of the referenced resource.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique and immutable key of the referenced resource.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    public KeyReference copyDeep();

    /**
     * factory method to create a deep copy of KeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static KeyReference deepCopy(@Nullable final KeyReference template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof KeyReferenceImpl)) {
            return template.copyDeep();
        }
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder for associateRole subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder associateRoleBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of();
    }

    /**
     * builder for businessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder businessUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of();
    }

    /**
     * builder for store subtype
     * @return builder
     */
    public static com.commercetools.api.models.store.StoreKeyReferenceBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreKeyReferenceBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<KeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<KeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<KeyReference>";
            }
        };
    }
}
