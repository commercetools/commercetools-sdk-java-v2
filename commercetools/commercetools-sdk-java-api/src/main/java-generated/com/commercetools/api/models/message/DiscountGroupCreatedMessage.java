
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_group.DiscountGroup;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-groups:POST" rel="nofollow">Create DiscountGroup</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupCreatedMessage discountGroupCreatedMessage = DiscountGroupCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountGroup(discountGroupBuilder -> discountGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupCreatedMessageImpl.class)
public interface DiscountGroupCreatedMessage extends Message {

    /**
     * discriminator value for DiscountGroupCreatedMessage
     */
    String DISCOUNT_GROUP_CREATED = "DiscountGroupCreated";

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @return discountGroup
     */
    @NotNull
    @Valid
    @JsonProperty("discountGroup")
    public DiscountGroup getDiscountGroup();

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @param discountGroup value to be set
     */

    public void setDiscountGroup(final DiscountGroup discountGroup);

    /**
     * factory method
     * @return instance of DiscountGroupCreatedMessage
     */
    public static DiscountGroupCreatedMessage of() {
        return new DiscountGroupCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupCreatedMessage of(final DiscountGroupCreatedMessage template) {
        DiscountGroupCreatedMessageImpl instance = new DiscountGroupCreatedMessageImpl();
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
        instance.setDiscountGroup(template.getDiscountGroup());
        return instance;
    }

    public DiscountGroupCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupCreatedMessage deepCopy(@Nullable final DiscountGroupCreatedMessage template) {
        if (template == null) {
            return null;
        }
        DiscountGroupCreatedMessageImpl instance = new DiscountGroupCreatedMessageImpl();
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
        instance.setDiscountGroup(
            com.commercetools.api.models.discount_group.DiscountGroup.deepCopy(template.getDiscountGroup()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupCreatedMessage
     * @return builder
     */
    public static DiscountGroupCreatedMessageBuilder builder() {
        return DiscountGroupCreatedMessageBuilder.of();
    }

    /**
     * create builder for DiscountGroupCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupCreatedMessageBuilder builder(final DiscountGroupCreatedMessage template) {
        return DiscountGroupCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupCreatedMessage(Function<DiscountGroupCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupCreatedMessage>";
            }
        };
    }
}
