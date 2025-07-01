
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentMethod
 *
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
@JsonDeserialize(as = PaymentMethodImpl.class)
public interface PaymentMethod extends BaseResource {

    /**
     *  <p>Unique identifier of the PaymentMethod.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the PaymentMethod.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the PaymentMethod.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an Associate of the Business Unit.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Payment Method used for the Payment—for example, a credit card or cash advance.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @return paymentInterface
     */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @return token
     */
    @Valid
    @JsonProperty("token")
    public PaymentMethodToken getToken();

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @return paymentMethodStatus
     */
    @NotNull
    @JsonProperty("paymentMethodStatus")
    public PaymentMethodStatus getPaymentMethodStatus();

    /**
     *  <p>Indicates if the PaymentMethod is the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @return default
     */
    @NotNull
    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) the PaymentMethod was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the PaymentMethod was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the PaymentMethod.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the PaymentMethod.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the PaymentMethod.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the PaymentMethod.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Reference to a Customer associated with the PaymentMethod.</p>
     *  <p>If <code>businessUnit</code> is set, the Customer is an Associate of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Reference to a BusinessUnit associated with the PaymentMethod.</p>
     *  <p>Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>Payment Method used for the Payment—for example, a credit card or cash advance.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     *  <p>Payment service that processes the Payment—for example, a PSP.</p>
     * @param paymentInterface value to be set
     */

    public void setPaymentInterface(final String paymentInterface);

    /**
     *  <p>Account or instance of the payment interface when multiple accounts are used (per interface).</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Tokenized representation of the PaymentMethod used by the payment interface.</p>
     * @param token value to be set
     */

    public void setToken(final PaymentMethodToken token);

    /**
     *  <p>Status of the PaymentMethod.</p>
     * @param paymentMethodStatus value to be set
     */

    public void setPaymentMethodStatus(final PaymentMethodStatus paymentMethodStatus);

    /**
     *  <p>Indicates if the PaymentMethod is the default.</p>
     *  <p>The default applies per Customer, Business Unit, or the combination of both (Associate).</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     *  <p>Custom Fields of the PaymentMethod.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) the PaymentMethod was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the PaymentMethod was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the PaymentMethod.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the PaymentMethod.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of PaymentMethod
     */
    public static PaymentMethod of() {
        return new PaymentMethodImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethod
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethod of(final PaymentMethod template) {
        PaymentMethodImpl instance = new PaymentMethodImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustomer(template.getCustomer());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setMethod(template.getMethod());
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setToken(template.getToken());
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        instance.setDefault(template.getDefault());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    public PaymentMethod copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethod
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethod deepCopy(@Nullable final PaymentMethod template) {
        if (template == null) {
            return null;
        }
        PaymentMethodImpl instance = new PaymentMethodImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setMethod(template.getMethod());
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setToken(com.commercetools.api.models.payment_method.PaymentMethodToken.deepCopy(template.getToken()));
        instance.setPaymentMethodStatus(template.getPaymentMethodStatus());
        instance.setDefault(template.getDefault());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethod
     * @return builder
     */
    public static PaymentMethodBuilder builder() {
        return PaymentMethodBuilder.of();
    }

    /**
     * create builder for PaymentMethod instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodBuilder builder(final PaymentMethod template) {
        return PaymentMethodBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethod(Function<PaymentMethod, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethod> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethod>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethod>";
            }
        };
    }
}
