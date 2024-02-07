
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create DiscountCode request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeCreatedMessage discountCodeCreatedMessage = DiscountCodeCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeCreatedMessageImpl.class)
public interface DiscountCodeCreatedMessage extends Message {

    /**
     * discriminator value for DiscountCodeCreatedMessage
     */
    String DISCOUNT_CODE_CREATED = "DiscountCodeCreated";

    /**
     *  <p>The Discount Code that was created.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCode getDiscountCode();

    /**
     *  <p>The Discount Code that was created.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCode discountCode);

    /**
     * factory method
     * @return instance of DiscountCodeCreatedMessage
     */
    public static DiscountCodeCreatedMessage of() {
        return new DiscountCodeCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeCreatedMessage of(final DiscountCodeCreatedMessage template) {
        DiscountCodeCreatedMessageImpl instance = new DiscountCodeCreatedMessageImpl();
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
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeCreatedMessage deepCopy(@Nullable final DiscountCodeCreatedMessage template) {
        if (template == null) {
            return null;
        }
        DiscountCodeCreatedMessageImpl instance = new DiscountCodeCreatedMessageImpl();
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
            com.commercetools.api.models.discount_code.DiscountCode.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeCreatedMessage
     * @return builder
     */
    public static DiscountCodeCreatedMessageBuilder builder() {
        return DiscountCodeCreatedMessageBuilder.of();
    }

    /**
     * create builder for DiscountCodeCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeCreatedMessageBuilder builder(final DiscountCodeCreatedMessage template) {
        return DiscountCodeCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeCreatedMessage(Function<DiscountCodeCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeCreatedMessage>";
            }
        };
    }
}
