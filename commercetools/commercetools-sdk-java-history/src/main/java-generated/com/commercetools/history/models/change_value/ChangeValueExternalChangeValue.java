
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
 * ChangeValueExternalChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueExternalChangeValue changeValueExternalChangeValue = ChangeValueExternalChangeValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueExternalChangeValueImpl.class)
public interface ChangeValueExternalChangeValue extends ChangeValueChangeValue {

    /**
     * discriminator value for ChangeValueExternalChangeValue
     */
    String EXTERNAL = "external";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method
     * @return instance of ChangeValueExternalChangeValue
     */
    public static ChangeValueExternalChangeValue of() {
        return new ChangeValueExternalChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeValueExternalChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueExternalChangeValue of(final ChangeValueExternalChangeValue template) {
        ChangeValueExternalChangeValueImpl instance = new ChangeValueExternalChangeValueImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeValueExternalChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeValueExternalChangeValue deepCopy(@Nullable final ChangeValueExternalChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeValueExternalChangeValueImpl instance = new ChangeValueExternalChangeValueImpl();
        return instance;
    }

    /**
     * builder factory method for ChangeValueExternalChangeValue
     * @return builder
     */
    public static ChangeValueExternalChangeValueBuilder builder() {
        return ChangeValueExternalChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeValueExternalChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueExternalChangeValueBuilder builder(final ChangeValueExternalChangeValue template) {
        return ChangeValueExternalChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueExternalChangeValue(Function<ChangeValueExternalChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueExternalChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueExternalChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueExternalChangeValue>";
            }
        };
    }
}
