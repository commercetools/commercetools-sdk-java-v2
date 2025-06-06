
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChangeTargetShippingChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetShippingChangeValue changeTargetShippingChangeValue = ChangeTargetShippingChangeValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetShippingChangeValueImpl.class)
public interface ChangeTargetShippingChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetShippingChangeValue
     */
    String SHIPPING = "shipping";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method
     * @return instance of ChangeTargetShippingChangeValue
     */
    public static ChangeTargetShippingChangeValue of() {
        return new ChangeTargetShippingChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetShippingChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetShippingChangeValue of(final ChangeTargetShippingChangeValue template) {
        ChangeTargetShippingChangeValueImpl instance = new ChangeTargetShippingChangeValueImpl();
        return instance;
    }

    public ChangeTargetShippingChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetShippingChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetShippingChangeValue deepCopy(@Nullable final ChangeTargetShippingChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetShippingChangeValueImpl instance = new ChangeTargetShippingChangeValueImpl();
        return instance;
    }

    /**
     * builder factory method for ChangeTargetShippingChangeValue
     * @return builder
     */
    public static ChangeTargetShippingChangeValueBuilder builder() {
        return ChangeTargetShippingChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetShippingChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetShippingChangeValueBuilder builder(final ChangeTargetShippingChangeValue template) {
        return ChangeTargetShippingChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetShippingChangeValue(Function<ChangeTargetShippingChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetShippingChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetShippingChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetShippingChangeValue>";
            }
        };
    }
}
