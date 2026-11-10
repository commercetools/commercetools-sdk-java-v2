
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoDraft paymentMethodInfoDraft = PaymentMethodInfoDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoDraftBuilder implements Builder<PaymentMethodInfoDraft> {

    @Nullable
    private String paymentInterface;

    @Nullable
    private String method;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    @Nullable
    private String interfaceAccount;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Name of the Payment Method.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder interfaceAccount(@Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentMethodInfoDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @return paymentInterface
     */

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Name of the Payment Method.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tokenized representation of the Payment Method used by the payment interface.</p>
     * @return token
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @return interfaceAccount
     */

    @Nullable
    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Custom fields for the PaymentMethodInfo.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds PaymentMethodInfoDraft with checking for non-null required values
     * @return PaymentMethodInfoDraft
     */
    public PaymentMethodInfoDraft build() {
        return new PaymentMethodInfoDraftImpl(paymentInterface, method, name, token, interfaceAccount, custom);
    }

    /**
     * builds PaymentMethodInfoDraft without checking for non-null required values
     * @return PaymentMethodInfoDraft
     */
    public PaymentMethodInfoDraft buildUnchecked() {
        return new PaymentMethodInfoDraftImpl(paymentInterface, method, name, token, interfaceAccount, custom);
    }

    /**
     * factory method for an instance of PaymentMethodInfoDraftBuilder
     * @return builder
     */
    public static PaymentMethodInfoDraftBuilder of() {
        return new PaymentMethodInfoDraftBuilder();
    }

    /**
     * create builder for PaymentMethodInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoDraftBuilder of(final PaymentMethodInfoDraft template) {
        PaymentMethodInfoDraftBuilder builder = new PaymentMethodInfoDraftBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        builder.method = template.getMethod();
        builder.name = template.getName();
        builder.token = template.getToken();
        builder.interfaceAccount = template.getInterfaceAccount();
        builder.custom = template.getCustom();
        return builder;
    }

}
