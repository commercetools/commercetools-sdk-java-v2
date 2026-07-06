
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
     * @param interfaceCode value to be set
     * @return Builder
     */

    public PaymentStatusDraftBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     *  <p>Text describing the current status of the Payment.</p>
     * @param interfaceText value to be set
     * @return Builder
     */

    public PaymentStatusDraftBuilder interfaceText(@Nullable final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public PaymentStatusDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public PaymentStatusDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public PaymentStatusDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     * builds PaymentStatusDraft with checking for non-null required values
     * @return PaymentStatusDraft
     */
    public PaymentStatusDraft build() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    /**
     * builds PaymentStatusDraft without checking for non-null required values
     * @return PaymentStatusDraft
     */
    public PaymentStatusDraft buildUnchecked() {
        return new PaymentStatusDraftImpl(interfaceCode, interfaceText, state);
    }

    /**
     * factory method for an instance of PaymentStatusDraftBuilder
     * @return builder
     */
    public static PaymentStatusDraftBuilder of() {
        return new PaymentStatusDraftBuilder();
    }

    /**
     * create builder for PaymentStatusDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusDraftBuilder of(final PaymentStatusDraft template) {
        PaymentStatusDraftBuilder builder = new PaymentStatusDraftBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        builder.interfaceText = template.getInterfaceText();
        builder.state = template.getState();
        return builder;
    }

}
