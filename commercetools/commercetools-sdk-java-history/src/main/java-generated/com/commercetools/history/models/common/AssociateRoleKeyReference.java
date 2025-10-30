
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleKeyReference associateRoleKeyReference = AssociateRoleKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("associate-role")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleKeyReferenceImpl.class)
public interface AssociateRoleKeyReference extends KeyReference {

    /**
     * discriminator value for AssociateRoleKeyReference
     */
    String ASSOCIATE_ROLE = "associate-role";

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of AssociateRoleKeyReference
     */
    public static AssociateRoleKeyReference of() {
        return new AssociateRoleKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleKeyReference of(final AssociateRoleKeyReference template) {
        AssociateRoleKeyReferenceImpl instance = new AssociateRoleKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public AssociateRoleKeyReference copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleKeyReference deepCopy(@Nullable final AssociateRoleKeyReference template) {
        if (template == null) {
            return null;
        }
        AssociateRoleKeyReferenceImpl instance = new AssociateRoleKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleKeyReference
     * @return builder
     */
    public static AssociateRoleKeyReferenceBuilder builder() {
        return AssociateRoleKeyReferenceBuilder.of();
    }

    /**
     * create builder for AssociateRoleKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleKeyReferenceBuilder builder(final AssociateRoleKeyReference template) {
        return AssociateRoleKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleKeyReference(Function<AssociateRoleKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleKeyReference>";
            }
        };
    }
}
