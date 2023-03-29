
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the cart classification shipping input rate value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartClassificationShippingRateInputValue setCartClassificationShippingRateInputValue = SetCartClassificationShippingRateInputValue.builder()
 *             .type("{type}")
 *             .key("{key}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCartClassificationShippingRateInputValueImpl.class)
public interface SetCartClassificationShippingRateInputValue {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set label
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of SetCartClassificationShippingRateInputValue
     */
    public static SetCartClassificationShippingRateInputValue of() {
        return new SetCartClassificationShippingRateInputValueImpl();
    }

    /**
     * factory method to create a shallow copy SetCartClassificationShippingRateInputValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCartClassificationShippingRateInputValue of(
            final SetCartClassificationShippingRateInputValue template) {
        SetCartClassificationShippingRateInputValueImpl instance = new SetCartClassificationShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCartClassificationShippingRateInputValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCartClassificationShippingRateInputValue deepCopy(
            @Nullable final SetCartClassificationShippingRateInputValue template) {
        if (template == null) {
            return null;
        }
        SetCartClassificationShippingRateInputValueImpl instance = new SetCartClassificationShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setKey(template.getKey());
        instance.setLabel(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLabel()));
        return instance;
    }

    /**
     * builder factory method for SetCartClassificationShippingRateInputValue
     * @return builder
     */
    public static SetCartClassificationShippingRateInputValueBuilder builder() {
        return SetCartClassificationShippingRateInputValueBuilder.of();
    }

    /**
     * create builder for SetCartClassificationShippingRateInputValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCartClassificationShippingRateInputValueBuilder builder(
            final SetCartClassificationShippingRateInputValue template) {
        return SetCartClassificationShippingRateInputValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCartClassificationShippingRateInputValue(
            Function<SetCartClassificationShippingRateInputValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCartClassificationShippingRateInputValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCartClassificationShippingRateInputValue>() {
            @Override
            public String toString() {
                return "TypeReference<SetCartClassificationShippingRateInputValue>";
            }
        };
    }
}
