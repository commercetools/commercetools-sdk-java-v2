
package com.commercetools.importapi.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyBuilder implements Builder<Money> {

    @Nullable
    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    /**
     *  <p>The number of fraction digits of the money value. This is used to determine how many digits are after the decimal point. For example, for EUR and USD, this is <code>2</code>, and for JPY, this is <code>0</code>.</p>
     * @param fractionDigits value to be set
     * @return Builder
     */

    public MoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     * @return Builder
     */

    public MoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>The currency code compliant to <span>ISO 4217</span>.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>The number of fraction digits of the money value. This is used to determine how many digits are after the decimal point. For example, for EUR and USD, this is <code>2</code>, and for JPY, this is <code>0</code>.</p>
     * @return fractionDigits
     */

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @return centAmount
     */

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>The currency code compliant to <span>ISO 4217</span>.</p>
     * @return currencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * builds Money with checking for non-null required values
     * @return Money
     */
    public Money build() {
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        return new MoneyImpl(fractionDigits, centAmount, currencyCode);
    }

    /**
     * builds Money without checking for non-null required values
     * @return Money
     */
    public Money buildUnchecked() {
        return new MoneyImpl(fractionDigits, centAmount, currencyCode);
    }

    /**
     * factory method for an instance of MoneyBuilder
     * @return builder
     */
    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    /**
     * create builder for Money instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
