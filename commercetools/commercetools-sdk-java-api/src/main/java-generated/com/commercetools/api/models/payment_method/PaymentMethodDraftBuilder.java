
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDraft paymentMethodDraft = PaymentMethodDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDraftBuilder implements Builder<PaymentMethodDraft> {

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private String method;

    @Nullable
    private String paymentInterface;

    @Nullable
    private String interfaceAccount;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    @Nullable
    private Boolean _default;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier for the PaymentMethod.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentMethodDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentMethodDraftBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public PaymentMethodDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public PaymentMethodDraftBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Payment method to use for the Payment—for example, a credit card or direct debit.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder interfaceAccount(@Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodDraftBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodDraftBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @param paymentMethodStatus value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder paymentMethodStatus(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the PaymentMethod should be the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @param _default value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder _default(@Nullable final Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentMethodDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the PaymentMethod.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Reference to a Customer the PaymentMethod should belong to.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer must be an Associate of the Business Unit.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Reference to a BusinessUnit the PaymentMethod should belong to.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Payment method to use for the Payment—for example, a credit card or direct debit.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @return paymentInterface
     */

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
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
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @return token
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @return paymentMethodStatus
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodStatus getPaymentMethodStatus() {
        return this.paymentMethodStatus;
    }

    /**
     *  <p>Set to <code>true</code> if the PaymentMethod should be the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @return default
     */

    @Nullable
    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Custom Fields for the PaymentMethod.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds PaymentMethodDraft with checking for non-null required values
     * @return PaymentMethodDraft
     */
    public PaymentMethodDraft build() {
        return new PaymentMethodDraftImpl(key, name, customer, businessUnit, method, paymentInterface, interfaceAccount,
            token, paymentMethodStatus, _default, custom);
    }

    /**
     * builds PaymentMethodDraft without checking for non-null required values
     * @return PaymentMethodDraft
     */
    public PaymentMethodDraft buildUnchecked() {
        return new PaymentMethodDraftImpl(key, name, customer, businessUnit, method, paymentInterface, interfaceAccount,
            token, paymentMethodStatus, _default, custom);
    }

    /**
     * factory method for an instance of PaymentMethodDraftBuilder
     * @return builder
     */
    public static PaymentMethodDraftBuilder of() {
        return new PaymentMethodDraftBuilder();
    }

    /**
     * create builder for PaymentMethodDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDraftBuilder of(final PaymentMethodDraft template) {
        PaymentMethodDraftBuilder builder = new PaymentMethodDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.customer = template.getCustomer();
        builder.businessUnit = template.getBusinessUnit();
        builder.method = template.getMethod();
        builder.paymentInterface = template.getPaymentInterface();
        builder.interfaceAccount = template.getInterfaceAccount();
        builder.token = template.getToken();
        builder.paymentMethodStatus = template.getPaymentMethodStatus();
        builder._default = template.getDefault();
        builder.custom = template.getCustom();
        return builder;
    }

}
