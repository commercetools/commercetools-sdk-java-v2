package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue;
import com.commercetools.history.models.change_value.ChangeValueExternalChangeValue;
import com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValue;
import com.commercetools.history.models.change_value.ChangeValueRelativeChangeValue;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
   @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueImpl.class, name = ChangeValueRelativeChangeValue.RELATIVE)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ChangeValueChangeValueImpl.class,
    visible = true
)
@JsonDeserialize(as = ChangeValueChangeValueImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ChangeValueChangeValue  {


    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();




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
        if (template instanceof com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue) {
            return com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue.deepCopy((com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue)template);
        }
        if (template instanceof com.commercetools.history.models.change_value.ChangeValueExternalChangeValue) {
            return com.commercetools.history.models.change_value.ChangeValueExternalChangeValue.deepCopy((com.commercetools.history.models.change_value.ChangeValueExternalChangeValue)template);
        }
        if (template instanceof com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValue) {
            return com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValue.deepCopy((com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValue)template);
        }
        if (template instanceof com.commercetools.history.models.change_value.ChangeValueRelativeChangeValue) {
            return com.commercetools.history.models.change_value.ChangeValueRelativeChangeValue.deepCopy((com.commercetools.history.models.change_value.ChangeValueRelativeChangeValue)template);
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
