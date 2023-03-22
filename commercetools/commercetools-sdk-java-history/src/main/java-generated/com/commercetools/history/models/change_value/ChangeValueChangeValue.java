
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueImpl.class, name = ChangeValueAbsoluteChangeValue.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueExternalChangeValueImpl.class, name = ChangeValueExternalChangeValue.EXTERNAL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueImpl.class, name = ChangeValueGiftLineItemChangeValue.GIFT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueImpl.class, name = ChangeValueRelativeChangeValue.RELATIVE) })
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

    public static com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder absoluteBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder externalBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder giftLineItemBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder.of();
    }

    public static com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder relativeBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder.of();
    }

    default <T> T withChangeValueChangeValue(Function<ChangeValueChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueChangeValue>";
            }
        };
    }
}
