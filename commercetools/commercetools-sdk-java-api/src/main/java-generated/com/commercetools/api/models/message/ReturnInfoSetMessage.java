
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Return Info update action on Orders and Order Edits.</p>
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

    String RETURN_INFO_SET = "ReturnInfoSet";

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     */
    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    public static ReturnInfoSetMessage of() {
        return new ReturnInfoSetMessageImpl();
    }

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

    public static ReturnInfoSetMessageBuilder builder() {
        return ReturnInfoSetMessageBuilder.of();
    }

    public static ReturnInfoSetMessageBuilder builder(final ReturnInfoSetMessage template) {
        return ReturnInfoSetMessageBuilder.of(template);
    }

    default <T> T withReturnInfoSetMessage(Function<ReturnInfoSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoSetMessage>";
            }
        };
    }
}
