
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethod paymentMethod = PaymentMethod.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .paymentMethodStatus(PaymentMethodStatus.ACTIVE)
 *             .default(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodBuilder implements Builder<PaymentMethod> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private String method;

    @Nullable
    private String paymentInterface;

    @Nullable
    private String interfaceAccount;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    private Boolean _default;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the PaymentMethod.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentMethodBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the PaymentMethod.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentMethodBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public PaymentMethodBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public PaymentMethodBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentMethod.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentMethodBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentMethodBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentMethodBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public PaymentMethodBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public PaymentMethodBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public PaymentMethodBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public PaymentMethodBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Payment Method used for the Payment—for example, a credit card or direct debit.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodBuilder interfaceAccount(@Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodBuilder token(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param builder function to build the token value
     * @return Builder
     */

    public PaymentMethodBuilder withToken(
            Function<com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder, com.commercetools.api.models.payment_method.PaymentMethodToken> builder) {
        this.token = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodTokenBuilder.of());
        return this;
    }

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param token value to be set
     * @return Builder
     */

    public PaymentMethodBuilder token(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        return this;
    }

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @param paymentMethodStatus value to be set
     * @return Builder
     */

    public PaymentMethodBuilder paymentMethodStatus(
            final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
        return this;
    }

    /**
     *  <p>Indicates if the PaymentMethod is the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @param _default value to be set
     * @return Builder
     */

    public PaymentMethodBuilder _default(final Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentMethodBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentMethodBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentMethodBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentMethodBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public PaymentMethodBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentMethodBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentMethodBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public PaymentMethodBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the PaymentMethod.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the PaymentMethod.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the PaymentMethod was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentMethod.</p>
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
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Payment Method used for the Payment—for example, a credit card or direct debit.</p>
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

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getPaymentMethodStatus() {
        return this.paymentMethodStatus;
    }

    /**
     *  <p>Indicates if the PaymentMethod is the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @return default
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds PaymentMethod with checking for non-null required values
     * @return PaymentMethod
     */
    public PaymentMethod build() {
        Objects.requireNonNull(id, PaymentMethod.class + ": id is missing");
        Objects.requireNonNull(version, PaymentMethod.class + ": version is missing");
        Objects.requireNonNull(createdAt, PaymentMethod.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, PaymentMethod.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(paymentMethodStatus, PaymentMethod.class + ": paymentMethodStatus is missing");
        Objects.requireNonNull(_default, PaymentMethod.class + ": default is missing");
        return new PaymentMethodImpl(id, version, createdAt, lastModifiedAt, key, name, customer, businessUnit, method,
            paymentInterface, interfaceAccount, token, paymentMethodStatus, _default, custom, lastModifiedBy,
            createdBy);
    }

    /**
     * builds PaymentMethod without checking for non-null required values
     * @return PaymentMethod
     */
    public PaymentMethod buildUnchecked() {
        return new PaymentMethodImpl(id, version, createdAt, lastModifiedAt, key, name, customer, businessUnit, method,
            paymentInterface, interfaceAccount, token, paymentMethodStatus, _default, custom, lastModifiedBy,
            createdBy);
    }

    /**
     * factory method for an instance of PaymentMethodBuilder
     * @return builder
     */
    public static PaymentMethodBuilder of() {
        return new PaymentMethodBuilder();
    }

    /**
     * create builder for PaymentMethod instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodBuilder of(final PaymentMethod template) {
        PaymentMethodBuilder builder = new PaymentMethodBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
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
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
