
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
     *  <p>A code describing the current status returned by the interface that processes the payment.</p>
     */

    public PaymentStatusBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     *  <p>A text describing the current status returned by the interface that processes the payment.</p>
     */

    public PaymentStatusBuilder interfaceText(@Nullable final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    /**
     *
     */

    public PaymentStatusBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentStatusBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    @Nullable
    public String getInterfaceText() {
        return this.interfaceText;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public PaymentStatus build() {
        return new PaymentStatusImpl(interfaceCode, interfaceText, state);
    }

    /**
     * builds PaymentStatus without checking for non null required values
     */
    public PaymentStatus buildUnchecked() {
        return new PaymentStatusImpl(interfaceCode, interfaceText, state);
    }

    public static PaymentStatusBuilder of() {
        return new PaymentStatusBuilder();
    }

    public static PaymentStatusBuilder of(final PaymentStatus template) {
        PaymentStatusBuilder builder = new PaymentStatusBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        builder.interfaceText = template.getInterfaceText();
        builder.state = template.getState();
        return builder;
    }

}
