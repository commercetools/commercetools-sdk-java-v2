
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set InterfaceAccount update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInterfaceAccountSetMessage paymentMethodInterfaceAccountSetMessage = PaymentMethodInterfaceAccountSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInterfaceAccountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInterfaceAccountSetMessageImpl.class)
public interface PaymentMethodInterfaceAccountSetMessage extends Message {

    /**
     * discriminator value for PaymentMethodInterfaceAccountSetMessage
     */
    String PAYMENT_METHOD_INTERFACE_ACCOUNT_SET = "PaymentMethodInterfaceAccountSet";

    /**
     *  <p>Interface account of the Payment Method after the Set InterfaceAccount update action.</p>
     * @return interfaceAccount
     */

    @JsonProperty("interfaceAccount")
    public String getInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method before the Set InterfaceAccount update action.</p>
     * @return oldInterfaceAccount
     */

    @JsonProperty("oldInterfaceAccount")
    public String getOldInterfaceAccount();

    /**
     *  <p>Interface account of the Payment Method after the Set InterfaceAccount update action.</p>
     * @param interfaceAccount value to be set
     */

    public void setInterfaceAccount(final String interfaceAccount);

    /**
     *  <p>Interface account of the Payment Method before the Set InterfaceAccount update action.</p>
     * @param oldInterfaceAccount value to be set
     */

    public void setOldInterfaceAccount(final String oldInterfaceAccount);

    /**
     * factory method
     * @return instance of PaymentMethodInterfaceAccountSetMessage
     */
    public static PaymentMethodInterfaceAccountSetMessage of() {
        return new PaymentMethodInterfaceAccountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInterfaceAccountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInterfaceAccountSetMessage of(final PaymentMethodInterfaceAccountSetMessage template) {
        PaymentMethodInterfaceAccountSetMessageImpl instance = new PaymentMethodInterfaceAccountSetMessageImpl();
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

    public PaymentMethodInterfaceAccountSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInterfaceAccountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInterfaceAccountSetMessage deepCopy(
            @Nullable final PaymentMethodInterfaceAccountSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInterfaceAccountSetMessageImpl instance = new PaymentMethodInterfaceAccountSetMessageImpl();
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
     * builder factory method for PaymentMethodInterfaceAccountSetMessage
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessageBuilder builder() {
        return PaymentMethodInterfaceAccountSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentMethodInterfaceAccountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessageBuilder builder(
            final PaymentMethodInterfaceAccountSetMessage template) {
        return PaymentMethodInterfaceAccountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInterfaceAccountSetMessage(
            Function<PaymentMethodInterfaceAccountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInterfaceAccountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInterfaceAccountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInterfaceAccountSetMessage>";
            }
        };
    }
}
