
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnresolvedReferences
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnresolvedReferences unresolvedReferences = UnresolvedReferences.builder()
 *             .key("{key}")
 *             .typeId(ReferenceType.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnresolvedReferencesImpl.class)
public interface UnresolvedReferences {

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The type of the referenced resource.</p>
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The type of the referenced resource.</p>
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
     * factory method to copy an instance of UnresolvedReferences
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnresolvedReferences of(final UnresolvedReferences template) {
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
