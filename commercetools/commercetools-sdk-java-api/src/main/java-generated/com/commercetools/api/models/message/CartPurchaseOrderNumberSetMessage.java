
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartPurchaseOrderNumberSetMessage cartPurchaseOrderNumberSetMessage = CartPurchaseOrderNumberSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CartPurchaseOrderNumberSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartPurchaseOrderNumberSetMessageImpl.class)
public interface CartPurchaseOrderNumberSetMessage extends Message {

    /**
     * discriminator value for CartPurchaseOrderNumberSetMessage
     */
    String CART_PURCHASE_ORDER_NUMBER_SET = "CartPurchaseOrderNumberSet";

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @JsonProperty("oldPurchaseOrderNumber")
    public String getOldPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param oldPurchaseOrderNumber value to be set
     */

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    /**
     * factory method
     * @return instance of CartPurchaseOrderNumberSetMessage
     */
    public static CartPurchaseOrderNumberSetMessage of() {
        return new CartPurchaseOrderNumberSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartPurchaseOrderNumberSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartPurchaseOrderNumberSetMessage of(final CartPurchaseOrderNumberSetMessage template) {
        CartPurchaseOrderNumberSetMessageImpl instance = new CartPurchaseOrderNumberSetMessageImpl();
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
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    public CartPurchaseOrderNumberSetMessage copyDeep();

    /**
     * factory method to create a deep copy of CartPurchaseOrderNumberSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartPurchaseOrderNumberSetMessage deepCopy(
            @Nullable final CartPurchaseOrderNumberSetMessage template) {
        if (template == null) {
            return null;
        }
        CartPurchaseOrderNumberSetMessageImpl instance = new CartPurchaseOrderNumberSetMessageImpl();
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
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for CartPurchaseOrderNumberSetMessage
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessageBuilder builder() {
        return CartPurchaseOrderNumberSetMessageBuilder.of();
    }

    /**
     * create builder for CartPurchaseOrderNumberSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessageBuilder builder(final CartPurchaseOrderNumberSetMessage template) {
        return CartPurchaseOrderNumberSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartPurchaseOrderNumberSetMessage(Function<CartPurchaseOrderNumberSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartPurchaseOrderNumberSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartPurchaseOrderNumberSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartPurchaseOrderNumberSetMessage>";
            }
        };
    }
}
