
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Money draft object to store an amount of a fraction of the smallest indivisible unit of the specified currency.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyDraftImpl.class)
public interface HighPrecisionMoneyDraft extends TypedMoneyDraft {

    String HIGH_PRECISION = "highPrecision";

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
     */

    @JsonProperty("centAmount")
    public Long getCentAmount();

    public void setFractionDigits(final Integer fractionDigits);

    public void setPreciseAmount(final Long preciseAmount);

    public void setCentAmount(final Long centAmount);

    public static HighPrecisionMoneyDraft of() {
        return new HighPrecisionMoneyDraftImpl();
    }

    public static HighPrecisionMoneyDraft of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public static HighPrecisionMoneyDraftBuilder builder() {
        return HighPrecisionMoneyDraftBuilder.of();
    }

    public static HighPrecisionMoneyDraftBuilder builder(final HighPrecisionMoneyDraft template) {
        return HighPrecisionMoneyDraftBuilder.of(template);
    }

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

    public static com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<HighPrecisionMoneyDraft>";
            }
        };
    }
}
