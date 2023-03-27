
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceFunctionBuilder
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
public class PriceFunctionBuilder implements Builder<PriceFunction> {

    private String currencyCode;

    private String function;

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public PriceFunctionBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p>To calculate a Price based on the score, use <code>+</code>, <code>-</code>, <code>*</code> and parentheses. The score is inserted with <code>x</code>. The function returns the cent amount.</p>
     *  <p>For example, to charge $1.99 for a score of <code>1</code>, $3.99 for a score of <code>2</code>, $5.99 for a score of <code>3</code> and onwards, the function is: <code>(200 * x) - 1)</code>. To charge $4.50, $6.00, and $7.50 for express shipping, the function is: <code>(150 * x) + 300</code>.</p>
     * @param function value to be set
     * @return Builder
     */

    public PriceFunctionBuilder function(final String function) {
        this.function = function;
        return this;
    }

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *  <p>To calculate a Price based on the score, use <code>+</code>, <code>-</code>, <code>*</code> and parentheses. The score is inserted with <code>x</code>. The function returns the cent amount.</p>
     *  <p>For example, to charge $1.99 for a score of <code>1</code>, $3.99 for a score of <code>2</code>, $5.99 for a score of <code>3</code> and onwards, the function is: <code>(200 * x) - 1)</code>. To charge $4.50, $6.00, and $7.50 for express shipping, the function is: <code>(150 * x) + 300</code>.</p>
     * @return function
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * builds PriceFunction with checking for non-null required values
     * @return PriceFunction
     */
    public PriceFunction build() {
        Objects.requireNonNull(currencyCode, PriceFunction.class + ": currencyCode is missing");
        Objects.requireNonNull(function, PriceFunction.class + ": function is missing");
        return new PriceFunctionImpl(currencyCode, function);
    }

    /**
     * builds PriceFunction without checking for non-null required values
     * @return PriceFunction
     */
    public PriceFunction buildUnchecked() {
        return new PriceFunctionImpl(currencyCode, function);
    }

    /**
     * factory method for an instance of PriceFunctionBuilder
     * @return builder
     */
    public static PriceFunctionBuilder of() {
        return new PriceFunctionBuilder();
    }

    /**
     * create builder for PriceFunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceFunctionBuilder of(final PriceFunction template) {
        PriceFunctionBuilder builder = new PriceFunctionBuilder();
        builder.currencyCode = template.getCurrencyCode();
        builder.function = template.getFunction();
        return builder;
    }

}
