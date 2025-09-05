
package com.commercetools.checkout.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AmountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Amount amount = Amount.builder()
 *             .centAmount(1)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AmountBuilder implements Builder<Amount> {

    private Integer centAmount;

    private String currencyCode;

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     * @return Builder
     */

    public AmountBuilder centAmount(final Integer centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public AmountBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @return centAmount
     */

    public Integer getCentAmount() {
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
     * builds Amount with checking for non-null required values
     * @return Amount
     */
    public Amount build() {
        Objects.requireNonNull(centAmount, Amount.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Amount.class + ": currencyCode is missing");
        return new AmountImpl(centAmount, currencyCode);
    }

    /**
     * builds Amount without checking for non-null required values
     * @return Amount
     */
    public Amount buildUnchecked() {
        return new AmountImpl(centAmount, currencyCode);
    }

    /**
     * factory method for an instance of AmountBuilder
     * @return builder
     */
    public static AmountBuilder of() {
        return new AmountBuilder();
    }

    /**
     * create builder for Amount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AmountBuilder of(final Amount template) {
        AmountBuilder builder = new AmountBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
