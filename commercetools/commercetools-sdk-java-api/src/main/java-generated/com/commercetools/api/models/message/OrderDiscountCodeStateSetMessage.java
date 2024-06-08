
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after the DiscountCodeState changes due to a recalculation.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeStateSetMessage orderDiscountCodeStateSetMessage = OrderDiscountCodeStateSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .state(DiscountCodeState.NOT_ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeStateSetMessageImpl.class)
public interface OrderDiscountCodeStateSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderDiscountCodeStateSetMessage
     */
    String ORDER_DISCOUNT_CODE_STATE_SET = "OrderDiscountCodeStateSet";

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @return oldState
     */

    @JsonProperty("oldState")
    public DiscountCodeState getOldState();

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @param state value to be set
     */

    public void setState(final DiscountCodeState state);

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @param oldState value to be set
     */

    public void setOldState(final DiscountCodeState oldState);

    /**
     * factory method
     * @return instance of OrderDiscountCodeStateSetMessage
     */
    public static OrderDiscountCodeStateSetMessage of() {
        return new OrderDiscountCodeStateSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderDiscountCodeStateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDiscountCodeStateSetMessage of(final OrderDiscountCodeStateSetMessage template) {
        OrderDiscountCodeStateSetMessageImpl instance = new OrderDiscountCodeStateSetMessageImpl();
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
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderDiscountCodeStateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDiscountCodeStateSetMessage deepCopy(@Nullable final OrderDiscountCodeStateSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderDiscountCodeStateSetMessageImpl instance = new OrderDiscountCodeStateSetMessageImpl();
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
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * builder factory method for OrderDiscountCodeStateSetMessage
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessageBuilder builder() {
        return OrderDiscountCodeStateSetMessageBuilder.of();
    }

    /**
     * create builder for OrderDiscountCodeStateSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessageBuilder builder(final OrderDiscountCodeStateSetMessage template) {
        return OrderDiscountCodeStateSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDiscountCodeStateSetMessage(Function<OrderDiscountCodeStateSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeStateSetMessage>";
            }
        };
    }
}
