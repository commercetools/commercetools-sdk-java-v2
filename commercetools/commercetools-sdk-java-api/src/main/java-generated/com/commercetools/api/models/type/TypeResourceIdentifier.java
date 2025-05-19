
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier of a Type. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeResourceIdentifier typeResourceIdentifier = TypeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Type> {

    /**
     * discriminator value for TypeResourceIdentifier
     */
    String TYPE = "type";

    /**
     *  <p>Unique identifier of the referenced Type. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Type. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Type. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Type. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of TypeResourceIdentifier
     */
    public static TypeResourceIdentifier of() {
        return new TypeResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy TypeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeResourceIdentifier of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public TypeResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of TypeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeResourceIdentifier deepCopy(@Nullable final TypeResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TypeResourceIdentifier
     * @return builder
     */
    public static TypeResourceIdentifierBuilder builder() {
        return TypeResourceIdentifierBuilder.of();
    }

    /**
     * create builder for TypeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeResourceIdentifierBuilder builder(final TypeResourceIdentifier template) {
        return TypeResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeResourceIdentifier(Function<TypeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<TypeResourceIdentifier>";
            }
        };
    }
}
