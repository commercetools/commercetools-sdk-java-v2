
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
 * ChangeTargetChangeValue
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetChangeValue changeTargetChangeValue = ChangeTargetChangeValue.customLineItemsBuilder()
 *             predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeTargetChangeValueImpl.class, visible = true)
@JsonDeserialize(as = ChangeTargetChangeValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeTargetChangeValue {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public ChangeTargetChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeTargetChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetChangeValue deepCopy(@Nullable final ChangeTargetChangeValue template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ChangeTargetChangeValueImpl)) {
            return template.copyDeep();
        }
        ChangeTargetChangeValueImpl instance = new ChangeTargetChangeValueImpl();
        return instance;
    }

    /**
     * builder for customLineItems subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder customLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    /**
     * builder for lineItems subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder lineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder.of();
    }

    /**
     * builder for multiBuyCustomLineItems subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of();
    }

    /**
     * builder for multiBuyLineItems subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder.of();
    }

    /**
     * builder for pattern subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetPatternChangeValueBuilder patternBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetPatternChangeValueBuilder.of();
    }

    /**
     * builder for shipping subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder shippingBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetChangeValue(Function<ChangeTargetChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetChangeValue>";
            }
        };
    }
}
