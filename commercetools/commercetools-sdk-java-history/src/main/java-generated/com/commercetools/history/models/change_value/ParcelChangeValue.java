
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelChangeValue parcelChangeValue = ParcelChangeValue.builder()
 *             .id("{id}")
 *             .createdAt("{createdAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelChangeValueImpl.class)
public interface ParcelChangeValue {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final String createdAt);

    /**
     * factory method
     * @return instance of ParcelChangeValue
     */
    public static ParcelChangeValue of() {
        return new ParcelChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ParcelChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelChangeValue of(final ParcelChangeValue template) {
        ParcelChangeValueImpl instance = new ParcelChangeValueImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of ParcelChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelChangeValue deepCopy(@Nullable final ParcelChangeValue template) {
        if (template == null) {
            return null;
        }
        ParcelChangeValueImpl instance = new ParcelChangeValueImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder factory method for ParcelChangeValue
     * @return builder
     */
    public static ParcelChangeValueBuilder builder() {
        return ParcelChangeValueBuilder.of();
    }

    /**
     * create builder for ParcelChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelChangeValueBuilder builder(final ParcelChangeValue template) {
        return ParcelChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelChangeValue(Function<ParcelChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelChangeValue>";
            }
        };
    }
}
