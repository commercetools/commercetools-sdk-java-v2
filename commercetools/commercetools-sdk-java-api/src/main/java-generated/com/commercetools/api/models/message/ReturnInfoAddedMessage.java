
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Return Info update action.</p>
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
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setReturnInfo(Optional.ofNullable(template.getReturnInfo())
                .map(com.commercetools.api.models.order.ReturnInfo::deepCopy)
                .orElse(null));
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
