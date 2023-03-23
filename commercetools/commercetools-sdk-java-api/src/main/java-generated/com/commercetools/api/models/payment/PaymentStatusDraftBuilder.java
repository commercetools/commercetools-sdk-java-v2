
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusDraft paymentStatusDraft = PaymentStatusDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusDraftBuilder implements Builder<PaymentStatusDraft> {

    @Nullable
    private String interfaceCode;

    @Nullable
    private String interfaceText;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    /**
     *  <p>External reference that identifies the current status of the Payment.</p>
     * @param interfaceCode
     * @return Builder
     */

    public PaymentStatusDraftBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @param interfaceText
     * @return Builder
     */

    public PaymentStatusDraftBuilder interfaceText(@Nullable final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return Builder
     */

    public PaymentStatusDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param state
     * @return Builder
     */

    public PaymentStatusDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
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
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public PaymentStatusDraft build() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    /**
     * builds PaymentStatusDraft without checking for non null required values
     */
    public PaymentStatusDraft buildUnchecked() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    public static PaymentStatusDraftBuilder of() {
        return new PaymentStatusDraftBuilder();
    }

    public static PaymentStatusDraftBuilder of(final PaymentStatusDraft template) {
        PaymentStatusDraftBuilder builder = new PaymentStatusDraftBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        builder.interfaceText = template.getInterfaceText();
        builder.state = template.getState();
        return builder;
    }

}
