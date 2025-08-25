
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoAction paymentSetMethodInfoAction = PaymentSetMethodInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoActionBuilder implements Builder<PaymentSetMethodInfoAction> {

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
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique. The value cannot be modified after it is set.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterface</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceSetMessage" rel="nofollow">PaymentMethodInfoInterfaceSet</a> Message.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoMethod</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoMethodSetMessage" rel="nofollow">PaymentMethodInfoMethodSet</a> Message.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoNameSetMessage" rel="nofollow">PaymentMethodInfoNameSet</a> Message.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoNameSetMessage" rel="nofollow">PaymentMethodInfoNameSet</a> Message.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoNameSetMessage" rel="nofollow">PaymentMethodInfoNameSet</a> Message.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoTokenSetMessage" rel="nofollow">PaymentMethodInfoTokenSet</a> Message.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoTokenSetMessage" rel="nofollow">PaymentMethodInfoTokenSet</a> Message.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoTokenSetMessage" rel="nofollow">PaymentMethodInfoTokenSet</a> Message.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface). If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterfaceAccount</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceAccountSetMessage" rel="nofollow">PaymentMethodInfoInterfaceAccountSet</a> Message.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder interfaceAccount(@Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldAddedMessage" rel="nofollow">PaymentMethodInfoCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldRemovedMessage" rel="nofollow">PaymentMethodInfoCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldChangedMessage" rel="nofollow">PaymentMethodInfoCustomFieldChanged</a> Message.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldAddedMessage" rel="nofollow">PaymentMethodInfoCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldRemovedMessage" rel="nofollow">PaymentMethodInfoCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldChangedMessage" rel="nofollow">PaymentMethodInfoCustomFieldChanged</a> Message.</li>
     *  </ul>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldAddedMessage" rel="nofollow">PaymentMethodInfoCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldRemovedMessage" rel="nofollow">PaymentMethodInfoCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldChangedMessage" rel="nofollow">PaymentMethodInfoCustomFieldChanged</a> Message.</li>
     *  </ul>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique. The value cannot be modified after it is set.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterface</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceSetMessage" rel="nofollow">PaymentMethodInfoInterfaceSet</a> Message.</p>
     * @return paymentInterface
     */

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment method to use—for example, a credit card or direct debit. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoMethod</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoMethodSetMessage" rel="nofollow">PaymentMethodInfoMethodSet</a> Message.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Name of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoName</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoNameSetMessage" rel="nofollow">PaymentMethodInfoNameSet</a> Message.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tokenized payment method information of the Payment Method. If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoToken</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoTokenSetMessage" rel="nofollow">PaymentMethodInfoTokenSet</a> Message.</p>
     * @return token
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface). If empty, any existing value will be removed.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoInterfaceAccount</code> action and will generate the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoInterfaceAccountSetMessage" rel="nofollow">PaymentMethodInfoInterfaceAccountSet</a> Message.</p>
     * @return interfaceAccount
     */

    @Nullable
    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Custom Fields for the PaymentMethodInfo. If not provided, any existing Custom Fields will be removed, including the Custom Type.</p>
     *  <p>Setting this field is equivalent to the <code>setMethodInfoCustomType</code> and <code>setMethodInfoCustomField</code> actions, and will generate the following Messages:</p>
     *  <ul>
     *   <li>Adding or updating a Custom Type on a Payment Method Info generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeSetMessage" rel="nofollow">PaymentMethodInfoCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomTypeRemovedMessage" rel="nofollow">PaymentMethodInfoCustomTypeRemoved</a> Message.</li>
     *   <li>Adding a Custom Field to a Payment generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldAddedMessage" rel="nofollow">PaymentMethodInfoCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldRemovedMessage" rel="nofollow">PaymentMethodInfoCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoCustomFieldChangedMessage" rel="nofollow">PaymentMethodInfoCustomFieldChanged</a> Message.</li>
     *  </ul>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds PaymentSetMethodInfoAction with checking for non-null required values
     * @return PaymentSetMethodInfoAction
     */
    public PaymentSetMethodInfoAction build() {
        return new PaymentSetMethodInfoActionImpl(paymentInterface, method, name, token, interfaceAccount, custom);
    }

    /**
     * builds PaymentSetMethodInfoAction without checking for non-null required values
     * @return PaymentSetMethodInfoAction
     */
    public PaymentSetMethodInfoAction buildUnchecked() {
        return new PaymentSetMethodInfoActionImpl(paymentInterface, method, name, token, interfaceAccount, custom);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoActionBuilder of() {
        return new PaymentSetMethodInfoActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoActionBuilder of(final PaymentSetMethodInfoAction template) {
        PaymentSetMethodInfoActionBuilder builder = new PaymentSetMethodInfoActionBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        builder.method = template.getMethod();
        builder.name = template.getName();
        builder.token = template.getToken();
        builder.interfaceAccount = template.getInterfaceAccount();
        builder.custom = template.getCustom();
        return builder;
    }

}
