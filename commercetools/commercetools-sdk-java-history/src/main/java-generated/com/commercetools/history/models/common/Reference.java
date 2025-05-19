
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
 * Reference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reference reference = Reference.builder()
 *             .id("{id}")
 *             .typeId(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceImpl.class)
public interface Reference {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

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
     * set typeId
     * @param typeId value to be set
     */

    public void setTypeId(final ReferenceTypeId typeId);

    /**
     * factory method
     * @return instance of Reference
     */
    public static Reference of() {
        return new ReferenceImpl();
    }

    /**
     * factory method to create a shallow copy Reference
     * @param template instance to be copied
     * @return copy instance
     */
    public static Reference of(final Reference template) {
        ReferenceImpl instance = new ReferenceImpl();
        instance.setId(template.getId());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public Reference copyDeep();

    /**
     * factory method to create a deep copy of Reference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Reference deepCopy(@Nullable final Reference template) {
        if (template == null) {
            return null;
        }
        ReferenceImpl instance = new ReferenceImpl();
        instance.setId(template.getId());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    /**
     * builder factory method for Reference
     * @return builder
     */
    public static ReferenceBuilder builder() {
        return ReferenceBuilder.of();
    }

    /**
     * create builder for Reference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceBuilder builder(final Reference template) {
        return ReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReference(Function<Reference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reference>() {
            @Override
            public String toString() {
                return "TypeReference<Reference>";
            }
        };
    }
}
