
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
 * SetCartScoreShippingRateInputValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartScoreShippingRateInputValue setCartScoreShippingRateInputValue = SetCartScoreShippingRateInputValue.builder()
 *             .type("{type}")
 *             .score(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCartScoreShippingRateInputValueImpl.class)
public interface SetCartScoreShippingRateInputValue {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @return score
     */
    @NotNull
    @JsonProperty("score")
    public Integer getScore();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @param score value to be set
     */

    public void setScore(final Integer score);

    /**
     * factory method
     * @return instance of SetCartScoreShippingRateInputValue
     */
    public static SetCartScoreShippingRateInputValue of() {
        return new SetCartScoreShippingRateInputValueImpl();
    }

    /**
     * factory method to create a shallow copy SetCartScoreShippingRateInputValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCartScoreShippingRateInputValue of(final SetCartScoreShippingRateInputValue template) {
        SetCartScoreShippingRateInputValueImpl instance = new SetCartScoreShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setScore(template.getScore());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCartScoreShippingRateInputValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCartScoreShippingRateInputValue deepCopy(
            @Nullable final SetCartScoreShippingRateInputValue template) {
        if (template == null) {
            return null;
        }
        SetCartScoreShippingRateInputValueImpl instance = new SetCartScoreShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setScore(template.getScore());
        return instance;
    }

    /**
     * builder factory method for SetCartScoreShippingRateInputValue
     * @return builder
     */
    public static SetCartScoreShippingRateInputValueBuilder builder() {
        return SetCartScoreShippingRateInputValueBuilder.of();
    }

    /**
     * create builder for SetCartScoreShippingRateInputValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCartScoreShippingRateInputValueBuilder builder(final SetCartScoreShippingRateInputValue template) {
        return SetCartScoreShippingRateInputValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCartScoreShippingRateInputValue(Function<SetCartScoreShippingRateInputValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCartScoreShippingRateInputValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCartScoreShippingRateInputValue>() {
            @Override
            public String toString() {
                return "TypeReference<SetCartScoreShippingRateInputValue>";
            }
        };
    }
}
