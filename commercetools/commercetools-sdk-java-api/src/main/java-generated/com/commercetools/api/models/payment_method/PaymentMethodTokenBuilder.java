
package com.commercetools.api.models.payment_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodTokenBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodToken paymentMethodToken = PaymentMethodToken.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodTokenBuilder implements Builder<PaymentMethodToken> {

    private String value;

    /**
     *  <p>Tokenized representation of the Payment Method.</p>
     *  <p>It is <em>displayed</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of an API Extension for Payments and PaymentMethods</li>
     *   <li>when querying Payments and PaymentMethods</li>
     *  </ul>
     *  <p>It is <em>masked</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of Payment and PaymentMethod messages</li>
     *   <li>when querying MyPayments</li>
     *   <li>in referenced Payments and PaymentMethods embedded through Reference Expansion</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodTokenBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Tokenized representation of the Payment Method.</p>
     *  <p>It is <em>displayed</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of an API Extension for Payments and PaymentMethods</li>
     *   <li>when querying Payments and PaymentMethods</li>
     *  </ul>
     *  <p>It is <em>masked</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of Payment and PaymentMethod messages</li>
     *   <li>when querying MyPayments</li>
     *   <li>in referenced Payments and PaymentMethods embedded through Reference Expansion</li>
     *  </ul>
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     * builds PaymentMethodToken with checking for non-null required values
     * @return PaymentMethodToken
     */
    public PaymentMethodToken build() {
        Objects.requireNonNull(value, PaymentMethodToken.class + ": value is missing");
        return new PaymentMethodTokenImpl(value);
    }

    /**
     * builds PaymentMethodToken without checking for non-null required values
     * @return PaymentMethodToken
     */
    public PaymentMethodToken buildUnchecked() {
        return new PaymentMethodTokenImpl(value);
    }

    /**
     * factory method for an instance of PaymentMethodTokenBuilder
     * @return builder
     */
    public static PaymentMethodTokenBuilder of() {
        return new PaymentMethodTokenBuilder();
    }

    /**
     * create builder for PaymentMethodToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodTokenBuilder of(final PaymentMethodToken template) {
        PaymentMethodTokenBuilder builder = new PaymentMethodTokenBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
