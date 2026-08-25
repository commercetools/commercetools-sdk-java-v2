
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.EstimatedDelivery;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEstimatedDeliverySetMessage cartEstimatedDeliverySetMessage = CartEstimatedDeliverySetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CartEstimatedDeliverySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartEstimatedDeliverySetMessageImpl.class)
public interface CartEstimatedDeliverySetMessage extends Message {

    /**
     * discriminator value for CartEstimatedDeliverySetMessage
     */
    String CART_ESTIMATED_DELIVERY_SET = "CartEstimatedDeliverySet";

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @return estimatedDelivery
     */
    @Valid
    @JsonProperty("estimatedDelivery")
    public EstimatedDelivery getEstimatedDelivery();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param estimatedDelivery value to be set
     */

    public void setEstimatedDelivery(final EstimatedDelivery estimatedDelivery);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of CartEstimatedDeliverySetMessage
     */
    public static CartEstimatedDeliverySetMessage of() {
        return new CartEstimatedDeliverySetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartEstimatedDeliverySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartEstimatedDeliverySetMessage of(final CartEstimatedDeliverySetMessage template) {
        CartEstimatedDeliverySetMessageImpl instance = new CartEstimatedDeliverySetMessageImpl();
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
        instance.setEstimatedDelivery(template.getEstimatedDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public CartEstimatedDeliverySetMessage copyDeep();

    /**
     * factory method to create a deep copy of CartEstimatedDeliverySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartEstimatedDeliverySetMessage deepCopy(@Nullable final CartEstimatedDeliverySetMessage template) {
        if (template == null) {
            return null;
        }
        CartEstimatedDeliverySetMessageImpl instance = new CartEstimatedDeliverySetMessageImpl();
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
        instance.setEstimatedDelivery(
            com.commercetools.api.models.cart.EstimatedDelivery.deepCopy(template.getEstimatedDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for CartEstimatedDeliverySetMessage
     * @return builder
     */
    public static CartEstimatedDeliverySetMessageBuilder builder() {
        return CartEstimatedDeliverySetMessageBuilder.of();
    }

    /**
     * create builder for CartEstimatedDeliverySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEstimatedDeliverySetMessageBuilder builder(final CartEstimatedDeliverySetMessage template) {
        return CartEstimatedDeliverySetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartEstimatedDeliverySetMessage(Function<CartEstimatedDeliverySetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartEstimatedDeliverySetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartEstimatedDeliverySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartEstimatedDeliverySetMessage>";
            }
        };
    }
}
