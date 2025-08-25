
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action on Payments and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyPaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceAccountSetMessage paymentMethodInfoInterfaceAccountSetMessage = PaymentMethodInfoInterfaceAccountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoInterfaceAccountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoInterfaceAccountSetMessageImpl.class)
public interface PaymentMethodInfoInterfaceAccountSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInfoInterfaceAccountSetMessage
     */
    String PAYMENT_METHOD_INFO_INTERFACE_ACCOUNT_SET = "PaymentMethodInfoInterfaceAccountSet";

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @return oldInterfaceAccount
     */

    @JsonProperty("oldInterfaceAccount")
    public String getOldInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @param oldInterfaceAccount value to be set
     */

    public void setOldInterfaceAccount(final String oldInterfaceAccount);

    /**
     * factory method
     * @return instance of PaymentMethodInfoInterfaceAccountSetMessage
     */
    public static PaymentMethodInfoInterfaceAccountSetMessage of() {
        return new PaymentMethodInfoInterfaceAccountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoInterfaceAccountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoInterfaceAccountSetMessage of(
            final PaymentMethodInfoInterfaceAccountSetMessage template) {
        PaymentMethodInfoInterfaceAccountSetMessageImpl instance = new PaymentMethodInfoInterfaceAccountSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    public PaymentMethodInfoInterfaceAccountSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoInterfaceAccountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoInterfaceAccountSetMessage deepCopy(
            @Nullable final PaymentMethodInfoInterfaceAccountSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoInterfaceAccountSetMessageImpl instance = new PaymentMethodInfoInterfaceAccountSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setInterfaceAccount(template.getInterfaceAccount());
        instance.setOldInterfaceAccount(template.getOldInterfaceAccount());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoInterfaceAccountSetMessage
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessageBuilder builder() {
        return PaymentMethodInfoInterfaceAccountSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceAccountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessageBuilder builder(
            final PaymentMethodInfoInterfaceAccountSetMessage template) {
        return PaymentMethodInfoInterfaceAccountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoInterfaceAccountSetMessage(
            Function<PaymentMethodInfoInterfaceAccountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceAccountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoInterfaceAccountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoInterfaceAccountSetMessage>";
            }
        };
    }
}
