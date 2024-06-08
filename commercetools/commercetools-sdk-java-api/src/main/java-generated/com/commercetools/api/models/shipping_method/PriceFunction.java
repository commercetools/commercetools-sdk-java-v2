
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PriceFunction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceFunction priceFunction = PriceFunction.builder()
 *             .currencyCode("{currencyCode}")
 *             .function("{function}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceFunctionImpl.class)
public interface PriceFunction {

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *  <p>To calculate a Price based on the score, use <code>+</code>, <code>-</code>, <code>*</code> and parentheses. The score is inserted with <code>x</code>. The function returns the cent amount.</p>
     *  <p>For example, to charge $1.99 for a score of <code>1</code>, $3.99 for a score of <code>2</code>, $5.99 for a score of <code>3</code> and onwards, the function is: <code>(200 * x) - 1)</code>. To charge $4.50, $6.00, and $7.50 for express shipping, the function is: <code>(150 * x) + 300</code>.</p>
     * @return function
     */
    @NotNull
    @JsonProperty("function")
    public String getFunction();

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    /**
     *  <p>To calculate a Price based on the score, use <code>+</code>, <code>-</code>, <code>*</code> and parentheses. The score is inserted with <code>x</code>. The function returns the cent amount.</p>
     *  <p>For example, to charge $1.99 for a score of <code>1</code>, $3.99 for a score of <code>2</code>, $5.99 for a score of <code>3</code> and onwards, the function is: <code>(200 * x) - 1)</code>. To charge $4.50, $6.00, and $7.50 for express shipping, the function is: <code>(150 * x) + 300</code>.</p>
     * @param function value to be set
     */

    public void setFunction(final String function);

    /**
     * factory method
     * @return instance of PriceFunction
     */
    public static PriceFunction of() {
        return new PriceFunctionImpl();
    }

    /**
     * factory method to create a shallow copy PriceFunction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceFunction of(final PriceFunction template) {
        PriceFunctionImpl instance = new PriceFunctionImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFunction(template.getFunction());
        return instance;
    }

    /**
     * factory method to create a deep copy of PriceFunction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceFunction deepCopy(@Nullable final PriceFunction template) {
        if (template == null) {
            return null;
        }
        PriceFunctionImpl instance = new PriceFunctionImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFunction(template.getFunction());
        return instance;
    }

    /**
     * builder factory method for PriceFunction
     * @return builder
     */
    public static PriceFunctionBuilder builder() {
        return PriceFunctionBuilder.of();
    }

    /**
     * create builder for PriceFunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceFunctionBuilder builder(final PriceFunction template) {
        return PriceFunctionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceFunction(Function<PriceFunction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceFunction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceFunction>() {
            @Override
            public String toString() {
                return "TypeReference<PriceFunction>";
            }
        };
    }
}
