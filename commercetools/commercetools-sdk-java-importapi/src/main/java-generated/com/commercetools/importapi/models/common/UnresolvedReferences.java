
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Contains a reference to a resource which does not exist. For example, if a Category is imported with a parent Category that does not exist, the reference to the parent Category is an unresolved reference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnresolvedReferences unresolvedReferences = UnresolvedReferences.builder()
 *             .key("{key}")
 *             .typeId(ReferenceType.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnresolvedReferencesImpl.class)
public interface UnresolvedReferences {

    /**
     *  <p><code>key</code> of the unresolved resource.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Type of the unresolved resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    /**
     *  <p><code>key</code> of the unresolved resource.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Type of the unresolved resource.</p>
     * @param typeId value to be set
     */

    public void setTypeId(final ReferenceType typeId);

    /**
     * factory method
     * @return instance of UnresolvedReferences
     */
    public static UnresolvedReferences of() {
        return new UnresolvedReferencesImpl();
    }

    /**
     * factory method to create a shallow copy UnresolvedReferences
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnresolvedReferences of(final UnresolvedReferences template) {
        UnresolvedReferencesImpl instance = new UnresolvedReferencesImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public UnresolvedReferences copyDeep();

    /**
     * factory method to create a deep copy of UnresolvedReferences
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnresolvedReferences deepCopy(@Nullable final UnresolvedReferences template) {
        if (template == null) {
            return null;
        }
        UnresolvedReferencesImpl instance = new UnresolvedReferencesImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * builder factory method for UnresolvedReferences
     * @return builder
     */
    public static UnresolvedReferencesBuilder builder() {
        return UnresolvedReferencesBuilder.of();
    }

    /**
     * create builder for UnresolvedReferences instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnresolvedReferencesBuilder builder(final UnresolvedReferences template) {
        return UnresolvedReferencesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnresolvedReferences(Function<UnresolvedReferences, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UnresolvedReferences> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnresolvedReferences>() {
            @Override
            public String toString() {
                return "TypeReference<UnresolvedReferences>";
            }
        };
    }
}
