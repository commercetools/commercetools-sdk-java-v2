
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add ReturnInfo update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfoAddedMessage returnInfoAddedMessage = ReturnInfoAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .returnInfo(returnInfoBuilder -> returnInfoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ReturnInfoAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoAddedMessageImpl.class)
public interface ReturnInfoAddedMessage extends OrderMessage {

    /**
     * discriminator value for ReturnInfoAddedMessage
     */
    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @return returnInfo
     */
    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @param returnInfo value to be set
     */

    public void setReturnInfo(final ReturnInfo returnInfo);

    /**
     * factory method
     * @return instance of ReturnInfoAddedMessage
     */
    public static ReturnInfoAddedMessage of() {
        return new ReturnInfoAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ReturnInfoAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfoAddedMessage of(final ReturnInfoAddedMessage template) {
        ReturnInfoAddedMessageImpl instance = new ReturnInfoAddedMessageImpl();
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
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public ReturnInfoAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of ReturnInfoAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfoAddedMessage deepCopy(@Nullable final ReturnInfoAddedMessage template) {
        if (template == null) {
            return null;
        }
        ReturnInfoAddedMessageImpl instance = new ReturnInfoAddedMessageImpl();
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
        instance.setReturnInfo(com.commercetools.api.models.order.ReturnInfo.deepCopy(template.getReturnInfo()));
        return instance;
    }

    /**
     * builder factory method for ReturnInfoAddedMessage
     * @return builder
     */
    public static ReturnInfoAddedMessageBuilder builder() {
        return ReturnInfoAddedMessageBuilder.of();
    }

    /**
     * create builder for ReturnInfoAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoAddedMessageBuilder builder(final ReturnInfoAddedMessage template) {
        return ReturnInfoAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfoAddedMessage(Function<ReturnInfoAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoAddedMessage>";
            }
        };
    }
}
