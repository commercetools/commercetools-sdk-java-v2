
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HighPrecisionMoneyDraftBuilder
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
public class HighPrecisionMoneyDraftBuilder implements Builder<HighPrecisionMoneyDraft> {

    @Nullable
    private Long centAmount;

    private String currencyCode;

    private Integer fractionDigits;

    private Long preciseAmount;

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
     * @param centAmount value to be set
     * @return Builder
     */

    public HighPrecisionMoneyDraftBuilder centAmount(@Nullable final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public HighPrecisionMoneyDraftBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
     * @param fractionDigits value to be set
     * @return Builder
     */

    public HighPrecisionMoneyDraftBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @param preciseAmount value to be set
     * @return Builder
     */

    public HighPrecisionMoneyDraftBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
     * @return centAmount
     */

    @Nullable
    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     * @return currencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
     * @return fractionDigits
     */

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @return preciseAmount
     */

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    /**
     * builds HighPrecisionMoneyDraft with checking for non-null required values
     * @return HighPrecisionMoneyDraft
     */
    public HighPrecisionMoneyDraft build() {
        Objects.requireNonNull(currencyCode, HighPrecisionMoneyDraft.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, HighPrecisionMoneyDraft.class + ": fractionDigits is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoneyDraft.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * builds HighPrecisionMoneyDraft without checking for non-null required values
     * @return HighPrecisionMoneyDraft
     */
    public HighPrecisionMoneyDraft buildUnchecked() {
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * factory method for an instance of HighPrecisionMoneyDraftBuilder
     * @return builder
     */
    public static HighPrecisionMoneyDraftBuilder of() {
        return new HighPrecisionMoneyDraftBuilder();
    }

    /**
     * create builder for HighPrecisionMoneyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
