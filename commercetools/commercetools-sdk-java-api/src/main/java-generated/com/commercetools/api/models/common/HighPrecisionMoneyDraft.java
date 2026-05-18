
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Draft object to store money as a fraction of the smallest indivisible unit for a specific currency.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HighPrecisionMoneyDraft highPrecisionMoneyDraft = HighPrecisionMoneyDraft.builder()
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("highPrecision")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyDraftImpl.class)
public interface HighPrecisionMoneyDraft
        extends TypedMoneyDraft, io.vrap.rmf.base.client.Draft<HighPrecisionMoneyDraft> {

    /**
     * discriminator value for HighPrecisionMoneyDraft
     */
    String HIGH_PRECISION = "highPrecision";

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
     * @return fractionDigits
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     *  <p><code>preciseAmount</code> is represented as 64-bit integers. If this limit is exceeded, a <span>MoneyOverflow</span> error will be returned.</p>
     * @return preciseAmount
     */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p><code>centAmount</code> is represented as 64-bit integers. If this limit is exceeded, a <span>MoneyOverflow</span> error will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
     * @return centAmount
     */

    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     *  <p><code>preciseAmount</code> is represented as 64-bit integers. If this limit is exceeded, a <span>MoneyOverflow</span> error will be returned.</p>
     * @param preciseAmount value to be set
     */

    public void setPreciseAmount(final Long preciseAmount);

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p><code>centAmount</code> is represented as 64-bit integers. If this limit is exceeded, a <span>MoneyOverflow</span> error will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
     * @param centAmount value to be set
     */

    public void setCentAmount(final Long centAmount);

    /**
     * factory method
     * @return instance of HighPrecisionMoneyDraft
     */
    public static HighPrecisionMoneyDraft of() {
        return new HighPrecisionMoneyDraftImpl();
    }

    /**
     * factory method to create a shallow copy HighPrecisionMoneyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static HighPrecisionMoneyDraft of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public HighPrecisionMoneyDraft copyDeep();

    /**
     * factory method to create a deep copy of HighPrecisionMoneyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static HighPrecisionMoneyDraft deepCopy(@Nullable final HighPrecisionMoneyDraft template) {
        if (template == null) {
            return null;
        }
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    /**
     * builder factory method for HighPrecisionMoneyDraft
     * @return builder
     */
    public static HighPrecisionMoneyDraftBuilder builder() {
        return HighPrecisionMoneyDraftBuilder.of();
    }

    /**
     * create builder for HighPrecisionMoneyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HighPrecisionMoneyDraftBuilder builder(final HighPrecisionMoneyDraft template) {
        return HighPrecisionMoneyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withHighPrecisionMoneyDraft(Function<HighPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    public static HighPrecisionMoneyDraft of(javax.money.MonetaryAmount monetaryAmount, final int fractionDigits) {
        return MoneyUtil.draftOf(monetaryAmount, fractionDigits);
    }

    public static HighPrecisionMoneyDraft of(final HighPrecisionMoney template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return amount -> MoneyUtil.draftOf(amount, getFractionDigits());
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<HighPrecisionMoneyDraft>";
            }
        };
    }
}
