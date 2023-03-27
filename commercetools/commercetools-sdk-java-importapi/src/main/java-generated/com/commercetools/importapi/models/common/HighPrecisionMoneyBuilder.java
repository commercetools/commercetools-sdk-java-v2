
package com.commercetools.importapi.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HighPrecisionMoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HighPrecisionMoney highPrecisionMoney = HighPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HighPrecisionMoneyBuilder implements Builder<HighPrecisionMoney> {

    @Nullable
    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    private Long preciseAmount;

    /**
     * set the value to the fractionDigits
     * @param fractionDigits value to be set
     * @return Builder
     */

    public HighPrecisionMoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    /**
     * set the value to the centAmount
     * @param centAmount value to be set
     * @return Builder
     */

    public HighPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public HighPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * set the value to the preciseAmount
     * @param preciseAmount value to be set
     * @return Builder
     */

    public HighPrecisionMoneyBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    /**
     * value of fractionDigits}
     * @return fractionDigits
     */

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     * value of centAmount}
     * @return centAmount
     */

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * value of preciseAmount}
     * @return preciseAmount
     */

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    /**
     * builds HighPrecisionMoney with checking for non-null required values
     * @return HighPrecisionMoney
     */
    public HighPrecisionMoney build() {
        Objects.requireNonNull(centAmount, HighPrecisionMoney.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, HighPrecisionMoney.class + ": currencyCode is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoney.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode, preciseAmount);
    }

    /**
     * builds HighPrecisionMoney without checking for non-null required values
     * @return HighPrecisionMoney
     */
    public HighPrecisionMoney buildUnchecked() {
        return new HighPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode, preciseAmount);
    }

    /**
     * factory method for an instance of HighPrecisionMoneyBuilder
     * @return builder
     */
    public static HighPrecisionMoneyBuilder of() {
        return new HighPrecisionMoneyBuilder();
    }

    /**
     * create builder for HighPrecisionMoney instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
        HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
