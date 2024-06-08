
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set ReturnInfo update action on Orders and Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfoSetMessage returnInfoSetMessage = ReturnInfoSetMessage.builder()
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
@JsonDeserialize(as = ReturnInfoSetMessageImpl.class)
public interface ReturnInfoSetMessage extends OrderMessage {

    /**
     * discriminator value for ReturnInfoSetMessage
     */
    String RETURN_INFO_SET = "ReturnInfoSet";

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @return returnInfo
     */
    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param returnInfo values to be set
     */

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param returnInfo values to be set
     */

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    /**
     * factory method
     * @return instance of ReturnInfoSetMessage
     */
    public static ReturnInfoSetMessage of() {
        return new ReturnInfoSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ReturnInfoSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfoSetMessage of(final ReturnInfoSetMessage template) {
        ReturnInfoSetMessageImpl instance = new ReturnInfoSetMessageImpl();
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
     * factory method to create a deep copy of ReturnInfoSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfoSetMessage deepCopy(@Nullable final ReturnInfoSetMessage template) {
        if (template == null) {
            return null;
        }
        ReturnInfoSetMessageImpl instance = new ReturnInfoSetMessageImpl();
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
        instance.setReturnInfo(Optional.ofNullable(template.getReturnInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReturnInfoSetMessage
     * @return builder
     */
    public static ReturnInfoSetMessageBuilder builder() {
        return ReturnInfoSetMessageBuilder.of();
    }

    /**
     * create builder for ReturnInfoSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoSetMessageBuilder builder(final ReturnInfoSetMessage template) {
        return ReturnInfoSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfoSetMessage(Function<ReturnInfoSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoSetMessage>";
            }
        };
    }
}
