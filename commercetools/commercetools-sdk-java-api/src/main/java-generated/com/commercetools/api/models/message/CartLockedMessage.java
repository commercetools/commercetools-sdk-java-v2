
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartLockCartAction" rel="nofollow">Lock Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLockedMessage cartLockedMessage = CartLockedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CartLocked")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartLockedMessageImpl.class)
public interface CartLockedMessage extends Message {

    /**
     * discriminator value for CartLockedMessage
     */
    String CART_LOCKED = "CartLocked";

    /**
     * factory method
     * @return instance of CartLockedMessage
     */
    public static CartLockedMessage of() {
        return new CartLockedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartLockedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartLockedMessage of(final CartLockedMessage template) {
        CartLockedMessageImpl instance = new CartLockedMessageImpl();
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
        return instance;
    }

    public CartLockedMessage copyDeep();

    /**
     * factory method to create a deep copy of CartLockedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartLockedMessage deepCopy(@Nullable final CartLockedMessage template) {
        if (template == null) {
            return null;
        }
        CartLockedMessageImpl instance = new CartLockedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for CartLockedMessage
     * @return builder
     */
    public static CartLockedMessageBuilder builder() {
        return CartLockedMessageBuilder.of();
    }

    /**
     * create builder for CartLockedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockedMessageBuilder builder(final CartLockedMessage template) {
        return CartLockedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartLockedMessage(Function<CartLockedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartLockedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartLockedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartLockedMessage>";
            }
        };
    }
}
