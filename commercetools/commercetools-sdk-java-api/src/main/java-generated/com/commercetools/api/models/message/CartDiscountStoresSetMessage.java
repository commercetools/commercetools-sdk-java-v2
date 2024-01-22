
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Stores update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoresSetMessage cartDiscountStoresSetMessage = CartDiscountStoresSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountStoresSetMessageImpl.class)
public interface CartDiscountStoresSetMessage extends Message {

    /**
     * discriminator value for CartDiscountStoresSetMessage
     */
    String CART_DISCOUNT_STORES_SET = "CartDiscountStoresSet";

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     * factory method
     * @return instance of CartDiscountStoresSetMessage
     */
    public static CartDiscountStoresSetMessage of() {
        return new CartDiscountStoresSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountStoresSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountStoresSetMessage of(final CartDiscountStoresSetMessage template) {
        CartDiscountStoresSetMessageImpl instance = new CartDiscountStoresSetMessageImpl();
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
        instance.setStores(template.getStores());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountStoresSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountStoresSetMessage deepCopy(@Nullable final CartDiscountStoresSetMessage template) {
        if (template == null) {
            return null;
        }
        CartDiscountStoresSetMessageImpl instance = new CartDiscountStoresSetMessageImpl();
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
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountStoresSetMessage
     * @return builder
     */
    public static CartDiscountStoresSetMessageBuilder builder() {
        return CartDiscountStoresSetMessageBuilder.of();
    }

    /**
     * create builder for CartDiscountStoresSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoresSetMessageBuilder builder(final CartDiscountStoresSetMessage template) {
        return CartDiscountStoresSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountStoresSetMessage(Function<CartDiscountStoresSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoresSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoresSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountStoresSetMessage>";
            }
        };
    }
}
