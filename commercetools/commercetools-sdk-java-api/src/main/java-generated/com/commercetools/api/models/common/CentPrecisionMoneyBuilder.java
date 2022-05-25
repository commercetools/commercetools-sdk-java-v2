
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CentPrecisionMoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoney centPrecisionMoney = CentPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CentPrecisionMoneyBuilder implements Builder<CentPrecisionMoney> {

    private Long centAmount;

    private String currencyCode;

    private Integer fractionDigits;

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     */

    public CentPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */

    public CentPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>The number of default fraction digits for the given currency, like <code>2</code> for EUR or <code>0</code> for JPY.</p>
     */

    public CentPrecisionMoneyBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public CentPrecisionMoney build() {
        Objects.requireNonNull(centAmount, CentPrecisionMoney.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, CentPrecisionMoney.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, CentPrecisionMoney.class + ": fractionDigits is missing");
        return new CentPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits);
    }

    /**
     * builds CentPrecisionMoney without checking for non null required values
     */
    public CentPrecisionMoney buildUnchecked() {
        return new CentPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits);
    }

    public static CentPrecisionMoneyBuilder of() {
        return new CentPrecisionMoneyBuilder();
    }

    public static CentPrecisionMoneyBuilder of(final CentPrecisionMoney template) {
        CentPrecisionMoneyBuilder builder = new CentPrecisionMoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        return builder;
    }

}
