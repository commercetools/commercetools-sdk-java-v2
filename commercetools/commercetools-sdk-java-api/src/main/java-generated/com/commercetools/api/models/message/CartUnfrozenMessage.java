
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUnfreezeCartAction" rel="nofollow">Unfreeze Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfrozenMessage cartUnfrozenMessage = CartUnfrozenMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CartUnfrozen")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUnfrozenMessageImpl.class)
public interface CartUnfrozenMessage extends Message {

    /**
     * discriminator value for CartUnfrozenMessage
     */
    String CART_UNFROZEN = "CartUnfrozen";

    /**
     * factory method
     * @return instance of CartUnfrozenMessage
     */
    public static CartUnfrozenMessage of() {
        return new CartUnfrozenMessageImpl();
    }

    /**
     * factory method to create a shallow copy CartUnfrozenMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUnfrozenMessage of(final CartUnfrozenMessage template) {
        CartUnfrozenMessageImpl instance = new CartUnfrozenMessageImpl();
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

    public CartUnfrozenMessage copyDeep();

    /**
     * factory method to create a deep copy of CartUnfrozenMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUnfrozenMessage deepCopy(@Nullable final CartUnfrozenMessage template) {
        if (template == null) {
            return null;
        }
        CartUnfrozenMessageImpl instance = new CartUnfrozenMessageImpl();
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
     * builder factory method for CartUnfrozenMessage
     * @return builder
     */
    public static CartUnfrozenMessageBuilder builder() {
        return CartUnfrozenMessageBuilder.of();
    }

    /**
     * create builder for CartUnfrozenMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnfrozenMessageBuilder builder(final CartUnfrozenMessage template) {
        return CartUnfrozenMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUnfrozenMessage(Function<CartUnfrozenMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUnfrozenMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUnfrozenMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnfrozenMessage>";
            }
        };
    }
}
