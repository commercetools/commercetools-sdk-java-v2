
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a money operation overflows the 64-bit integer range.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyOverflowError moneyOverflowError = MoneyOverflowError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MoneyOverflow")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyOverflowErrorImpl.class)
public interface MoneyOverflowError extends ErrorObject {

    /**
     * discriminator value for MoneyOverflowError
     */
    String MONEY_OVERFLOW = "MoneyOverflow";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A Money operation resulted in an overflow."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"A Money operation resulted in an overflow."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MoneyOverflowError
     */
    public static MoneyOverflowError of() {
        return new MoneyOverflowErrorImpl();
    }

    /**
     * factory method to create a shallow copy MoneyOverflowError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoneyOverflowError of(final MoneyOverflowError template) {
        MoneyOverflowErrorImpl instance = new MoneyOverflowErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public MoneyOverflowError copyDeep();

    /**
     * factory method to create a deep copy of MoneyOverflowError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoneyOverflowError deepCopy(@Nullable final MoneyOverflowError template) {
        if (template == null) {
            return null;
        }
        MoneyOverflowErrorImpl instance = new MoneyOverflowErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for MoneyOverflowError
     * @return builder
     */
    public static MoneyOverflowErrorBuilder builder() {
        return MoneyOverflowErrorBuilder.of();
    }

    /**
     * create builder for MoneyOverflowError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyOverflowErrorBuilder builder(final MoneyOverflowError template) {
        return MoneyOverflowErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoneyOverflowError(Function<MoneyOverflowError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoneyOverflowError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneyOverflowError>() {
            @Override
            public String toString() {
                return "TypeReference<MoneyOverflowError>";
            }
        };
    }
}
