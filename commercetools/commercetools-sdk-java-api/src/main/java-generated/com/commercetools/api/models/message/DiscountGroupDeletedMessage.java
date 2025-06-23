
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete DiscountGroup request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupDeletedMessage discountGroupDeletedMessage = DiscountGroupDeletedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupDeletedMessageImpl.class)
public interface DiscountGroupDeletedMessage extends Message {

    /**
     * discriminator value for DiscountGroupDeletedMessage
     */
    String DISCOUNT_GROUP_DELETED = "DiscountGroupDeleted";

    /**
     * factory method
     * @return instance of DiscountGroupDeletedMessage
     */
    public static DiscountGroupDeletedMessage of() {
        return new DiscountGroupDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupDeletedMessage of(final DiscountGroupDeletedMessage template) {
        DiscountGroupDeletedMessageImpl instance = new DiscountGroupDeletedMessageImpl();
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

    public DiscountGroupDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupDeletedMessage deepCopy(@Nullable final DiscountGroupDeletedMessage template) {
        if (template == null) {
            return null;
        }
        DiscountGroupDeletedMessageImpl instance = new DiscountGroupDeletedMessageImpl();
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
     * builder factory method for DiscountGroupDeletedMessage
     * @return builder
     */
    public static DiscountGroupDeletedMessageBuilder builder() {
        return DiscountGroupDeletedMessageBuilder.of();
    }

    /**
     * create builder for DiscountGroupDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupDeletedMessageBuilder builder(final DiscountGroupDeletedMessage template) {
        return DiscountGroupDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupDeletedMessage(Function<DiscountGroupDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupDeletedMessage>";
            }
        };
    }
}
