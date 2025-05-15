
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoreAddedMessage cartDiscountStoreAddedMessage = CartDiscountStoreAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartDiscountStoreAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountStoreAddedMessageImpl.class)
public interface CartDiscountStoreAddedMessage extends Message {

    /**
     * discriminator value for CartDiscountStoreAddedMessage
     */
    String CART_DISCOUNT_STORE_ADDED = "CartDiscountStoreAdded";

    /**
     *  <p>The Store that was added to the Cart Discount.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was added to the Cart Discount.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of CartDiscountStoreAddedMessage
     */
    public static CartDiscountStoreAddedMessage of() {
        return new CartDiscountStoreAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountStoreAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountStoreAddedMessage of(final CartDiscountStoreAddedMessage template) {
        CartDiscountStoreAddedMessageImpl instance = new CartDiscountStoreAddedMessageImpl();
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
        instance.setStore(template.getStore());
        return instance;
    }

    public CartDiscountStoreAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountStoreAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountStoreAddedMessage deepCopy(@Nullable final CartDiscountStoreAddedMessage template) {
        if (template == null) {
            return null;
        }
        CartDiscountStoreAddedMessageImpl instance = new CartDiscountStoreAddedMessageImpl();
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
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountStoreAddedMessage
     * @return builder
     */
    public static CartDiscountStoreAddedMessageBuilder builder() {
        return CartDiscountStoreAddedMessageBuilder.of();
    }

    /**
     * create builder for CartDiscountStoreAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoreAddedMessageBuilder builder(final CartDiscountStoreAddedMessage template) {
        return CartDiscountStoreAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountStoreAddedMessage(Function<CartDiscountStoreAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountStoreAddedMessage>";
            }
        };
    }
}
