
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionInterfaceIdSetMessage paymentTransactionInterfaceIdSetMessage = PaymentTransactionInterfaceIdSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentTransactionInterfaceIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransactionInterfaceIdSetMessageImpl.class)
public interface PaymentTransactionInterfaceIdSetMessage extends Message {

    /**
     * discriminator value for PaymentTransactionInterfaceIdSetMessage
     */
    String PAYMENT_TRANSACTION_INTERFACE_ID_SET = "PaymentTransactionInterfaceIdSet";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return newInterfaceId
     */

    @JsonProperty("newInterfaceId")
    public String getNewInterfaceId();

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return oldInterfaceId
     */

    @JsonProperty("oldInterfaceId")
    public String getOldInterfaceId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param newInterfaceId value to be set
     */

    public void setNewInterfaceId(final String newInterfaceId);

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param oldInterfaceId value to be set
     */

    public void setOldInterfaceId(final String oldInterfaceId);

    /**
     * factory method
     * @return instance of PaymentTransactionInterfaceIdSetMessage
     */
    public static PaymentTransactionInterfaceIdSetMessage of() {
        return new PaymentTransactionInterfaceIdSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy PaymentTransactionInterfaceIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentTransactionInterfaceIdSetMessage of(final PaymentTransactionInterfaceIdSetMessage template) {
        PaymentTransactionInterfaceIdSetMessageImpl instance = new PaymentTransactionInterfaceIdSetMessageImpl();
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
        instance.setTransactionId(template.getTransactionId());
        instance.setNewInterfaceId(template.getNewInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    public PaymentTransactionInterfaceIdSetMessage copyDeep();

    /**
     * factory method to create a deep copy of PaymentTransactionInterfaceIdSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransactionInterfaceIdSetMessage deepCopy(
            @Nullable final PaymentTransactionInterfaceIdSetMessage template) {
        if (template == null) {
            return null;
        }
        PaymentTransactionInterfaceIdSetMessageImpl instance = new PaymentTransactionInterfaceIdSetMessageImpl();
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
        instance.setTransactionId(template.getTransactionId());
        instance.setNewInterfaceId(template.getNewInterfaceId());
        instance.setOldInterfaceId(template.getOldInterfaceId());
        return instance;
    }

    /**
     * builder factory method for PaymentTransactionInterfaceIdSetMessage
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessageBuilder builder() {
        return PaymentTransactionInterfaceIdSetMessageBuilder.of();
    }

    /**
     * create builder for PaymentTransactionInterfaceIdSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessageBuilder builder(
            final PaymentTransactionInterfaceIdSetMessage template) {
        return PaymentTransactionInterfaceIdSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransactionInterfaceIdSetMessage(
            Function<PaymentTransactionInterfaceIdSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionInterfaceIdSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransactionInterfaceIdSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransactionInterfaceIdSetMessage>";
            }
        };
    }
}
