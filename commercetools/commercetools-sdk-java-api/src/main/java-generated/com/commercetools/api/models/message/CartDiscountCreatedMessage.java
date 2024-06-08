
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create CartDiscount request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCreatedMessage cartDiscountCreatedMessage = CartDiscountCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .cartDiscount(cartDiscountBuilder -> cartDiscountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountCreatedMessageImpl.class)
public interface CartDiscountCreatedMessage extends Message {

    /**
     * discriminator value for CartDiscountCreatedMessage
     */
    String CART_DISCOUNT_CREATED = "CartDiscountCreated";

    /**
     *  <p>The Cart Discount that was created.</p>
     * @return cartDiscount
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscount")
    public CartDiscount getCartDiscount();

    /**
     *  <p>The Cart Discount that was created.</p>
     * @param cartDiscount value to be set
     */

    public void setCartDiscount(final CartDiscount cartDiscount);

    /**
     * factory method
     * @return instance of CartDiscountCreatedMessage
     */
    public static CartDiscountCreatedMessage of() {
        return new CartDiscountCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountCreatedMessage of(final CartDiscountCreatedMessage template) {
        CartDiscountCreatedMessageImpl instance = new CartDiscountCreatedMessageImpl();
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
        instance.setCartDiscount(template.getCartDiscount());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountCreatedMessage deepCopy(@Nullable final CartDiscountCreatedMessage template) {
        if (template == null) {
            return null;
        }
        CartDiscountCreatedMessageImpl instance = new CartDiscountCreatedMessageImpl();
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
        instance.setCartDiscount(
            com.commercetools.api.models.cart_discount.CartDiscount.deepCopy(template.getCartDiscount()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountCreatedMessage
     * @return builder
     */
    public static CartDiscountCreatedMessageBuilder builder() {
        return CartDiscountCreatedMessageBuilder.of();
    }

    /**
     * create builder for CartDiscountCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountCreatedMessageBuilder builder(final CartDiscountCreatedMessage template) {
        return CartDiscountCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountCreatedMessage(Function<CartDiscountCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountCreatedMessage>";
            }
        };
    }
}
