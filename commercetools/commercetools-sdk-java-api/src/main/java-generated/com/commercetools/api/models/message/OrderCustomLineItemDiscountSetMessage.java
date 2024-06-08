
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful recalculation of a Discount on a Custom Line Item.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemDiscountSetMessage orderCustomLineItemDiscountSetMessage = OrderCustomLineItemDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItemId("{customLineItemId}")
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessageImpl.class)
public interface OrderCustomLineItemDiscountSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomLineItemDiscountSetMessage
     */
    String ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET = "OrderCustomLineItemDiscountSet";

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @return discountedPricePerQuantity
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity values to be set
     */

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     * @param discountedPricePerQuantity values to be set
     */

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     * factory method
     * @return instance of OrderCustomLineItemDiscountSetMessage
     */
    public static OrderCustomLineItemDiscountSetMessage of() {
        return new OrderCustomLineItemDiscountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemDiscountSetMessage of(final OrderCustomLineItemDiscountSetMessage template) {
        OrderCustomLineItemDiscountSetMessageImpl instance = new OrderCustomLineItemDiscountSetMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomLineItemDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemDiscountSetMessage deepCopy(
            @Nullable final OrderCustomLineItemDiscountSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemDiscountSetMessageImpl instance = new OrderCustomLineItemDiscountSetMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setDiscountedPricePerQuantity(Optional.ofNullable(template.getDiscountedPricePerQuantity())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemDiscountSetMessage
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessageBuilder builder() {
        return OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemDiscountSetMessageBuilder builder(
            final OrderCustomLineItemDiscountSetMessage template) {
        return OrderCustomLineItemDiscountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemDiscountSetMessage(Function<OrderCustomLineItemDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemDiscountSetMessage>";
            }
        };
    }
}
