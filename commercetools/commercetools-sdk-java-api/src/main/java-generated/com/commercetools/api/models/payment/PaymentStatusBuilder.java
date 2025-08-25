
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatus paymentStatus = PaymentStatus.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusBuilder implements Builder<PaymentStatus> {

    @Nullable
    private String interfaceCode;

    @Nullable
    private String interfaceText;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     * @param interfaceCode value to be set
     * @return Builder
     */

    public PaymentStatusBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @param interfaceText value to be set
     * @return Builder
     */

    public PaymentStatusBuilder interfaceText(@Nullable final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public PaymentStatusBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public PaymentStatusBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public PaymentStatusBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     * @return interfaceCode
     */

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @return interfaceText
     */

    @Nullable
    public String getInterfaceText() {
        return this.interfaceText;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     * builds PaymentStatus with checking for non-null required values
     * @return PaymentStatus
     */
    public PaymentStatus build() {
        return new PaymentStatusImpl(interfaceCode, interfaceText, state);
    }

    /**
     * builds PaymentStatus without checking for non-null required values
     * @return PaymentStatus
     */
    public PaymentStatus buildUnchecked() {
        return new PaymentStatusImpl(interfaceCode, interfaceText, state);
    }

    /**
     * factory method for an instance of PaymentStatusBuilder
     * @return builder
     */
    public static PaymentStatusBuilder of() {
        return new PaymentStatusBuilder();
    }

    /**
     * create builder for PaymentStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusBuilder of(final PaymentStatus template) {
        PaymentStatusBuilder builder = new PaymentStatusBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        builder.interfaceText = template.getInterfaceText();
        builder.state = template.getState();
        return builder;
    }

}
