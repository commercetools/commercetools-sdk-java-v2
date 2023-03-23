
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @return returnInfo
     */
    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    public void setReturnInfo(final ReturnInfo returnInfo);

    public static ReturnInfoAddedMessage of() {
        return new ReturnInfoAddedMessageImpl();
    }

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

    public static ReturnInfoAddedMessageBuilder builder() {
        return ReturnInfoAddedMessageBuilder.of();
    }

    public static ReturnInfoAddedMessageBuilder builder(final ReturnInfoAddedMessage template) {
        return ReturnInfoAddedMessageBuilder.of(template);
    }

    default <T> T withReturnInfoAddedMessage(Function<ReturnInfoAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoAddedMessage>";
            }
        };
    }
}
