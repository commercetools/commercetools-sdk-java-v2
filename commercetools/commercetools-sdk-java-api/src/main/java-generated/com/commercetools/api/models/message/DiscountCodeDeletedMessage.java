
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete DiscountCode request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDeletedMessage discountCodeDeletedMessage = DiscountCodeDeletedMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeDeletedMessageImpl.class)
public interface DiscountCodeDeletedMessage extends Message {

    /**
     * discriminator value for DiscountCodeDeletedMessage
     */
    String DISCOUNT_CODE_DELETED = "DiscountCodeDeleted";

    /**
     * factory method
     * @return instance of DiscountCodeDeletedMessage
     */
    public static DiscountCodeDeletedMessage of() {
        return new DiscountCodeDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeDeletedMessage of(final DiscountCodeDeletedMessage template) {
        DiscountCodeDeletedMessageImpl instance = new DiscountCodeDeletedMessageImpl();
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

    /**
     * factory method to create a deep copy of DiscountCodeDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeDeletedMessage deepCopy(@Nullable final DiscountCodeDeletedMessage template) {
        if (template == null) {
            return null;
        }
        DiscountCodeDeletedMessageImpl instance = new DiscountCodeDeletedMessageImpl();
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
     * builder factory method for DiscountCodeDeletedMessage
     * @return builder
     */
    public static DiscountCodeDeletedMessageBuilder builder() {
        return DiscountCodeDeletedMessageBuilder.of();
    }

    /**
     * create builder for DiscountCodeDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeDeletedMessageBuilder builder(final DiscountCodeDeletedMessage template) {
        return DiscountCodeDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeDeletedMessage(Function<DiscountCodeDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeDeletedMessage>";
            }
        };
    }
}
