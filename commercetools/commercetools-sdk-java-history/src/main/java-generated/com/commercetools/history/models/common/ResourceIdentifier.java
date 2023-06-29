
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceIdentifier
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceIdentifier resourceIdentifier = ResourceIdentifier.builder()
 *             .id("{id}")
 *             .key("{key}")
 *             .typeId(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ResourceIdentifierImpl.class)
public interface ResourceIdentifier {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set typeId
     * @param typeId value to be set
     */

    public void setTypeId(final ReferenceTypeId typeId);

    /**
     * factory method
     * @return instance of ResourceIdentifier
     */
    public static ResourceIdentifier of() {
        return new ResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResourceIdentifier of(final ResourceIdentifier template) {
        ResourceIdentifierImpl instance = new ResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResourceIdentifier deepCopy(@Nullable final ResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ResourceIdentifierImpl instance = new ResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * builder factory method for ResourceIdentifier
     * @return builder
     */
    public static ResourceIdentifierBuilder builder() {
        return ResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceIdentifierBuilder builder(final ResourceIdentifier template) {
        return ResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResourceIdentifier(Function<ResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ResourceIdentifier>";
            }
        };
    }
}
