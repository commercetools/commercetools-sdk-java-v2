
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
 *     ReturnInfoAddedMessagePayload returnInfoAddedMessagePayload = ReturnInfoAddedMessagePayload.builder()
 *             .returnInfo(returnInfoBuilder -> returnInfoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoAddedMessagePayloadImpl.class)
public interface ReturnInfoAddedMessagePayload extends OrderMessagePayload {

    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    public void setReturnInfo(final ReturnInfo returnInfo);

    public static ReturnInfoAddedMessagePayload of() {
        return new ReturnInfoAddedMessagePayloadImpl();
    }

    public static ReturnInfoAddedMessagePayload of(final ReturnInfoAddedMessagePayload template) {
        ReturnInfoAddedMessagePayloadImpl instance = new ReturnInfoAddedMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static ReturnInfoAddedMessagePayloadBuilder builder() {
        return ReturnInfoAddedMessagePayloadBuilder.of();
    }

    public static ReturnInfoAddedMessagePayloadBuilder builder(final ReturnInfoAddedMessagePayload template) {
        return ReturnInfoAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withReturnInfoAddedMessagePayload(Function<ReturnInfoAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoAddedMessagePayload>";
            }
        };
    }
}
