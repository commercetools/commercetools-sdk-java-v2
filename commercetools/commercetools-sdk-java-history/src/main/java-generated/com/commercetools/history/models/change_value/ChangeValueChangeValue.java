
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
 * ChangeValueChangeValue
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChangeValue changeValueChangeValue = ChangeValueChangeValue.absoluteBuilder()
 *             plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeValueChangeValueImpl.class, visible = true)
@JsonDeserialize(as = ChangeValueChangeValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ChangeValueChangeValue {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public ChangeValueChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeValueChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeValueChangeValue deepCopy(@Nullable final ChangeValueChangeValue template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ChangeValueChangeValueImpl)) {
            return template.copyDeep();
        }
        ChangeValueChangeValueImpl instance = new ChangeValueChangeValueImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder absoluteBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder.of();
    }

    /**
     * builder for external subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder externalBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder.of();
    }

    /**
     * builder for giftLineItem subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder giftLineItemBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder relativeBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueChangeValue(Function<ChangeValueChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueChangeValue>";
            }
        };
    }
}
