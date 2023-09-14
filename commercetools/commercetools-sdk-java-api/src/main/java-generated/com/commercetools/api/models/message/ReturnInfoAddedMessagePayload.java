
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
 *  <p>Generated after a successful Add ReturnInfo update action.</p>
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

    /**
     * discriminator value for ReturnInfoAddedMessagePayload
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
     * @return instance of ReturnInfoAddedMessagePayload
     */
    public static ReturnInfoAddedMessagePayload of() {
        return new ReturnInfoAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ReturnInfoAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfoAddedMessagePayload of(final ReturnInfoAddedMessagePayload template) {
        ReturnInfoAddedMessagePayloadImpl instance = new ReturnInfoAddedMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReturnInfoAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfoAddedMessagePayload deepCopy(@Nullable final ReturnInfoAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ReturnInfoAddedMessagePayloadImpl instance = new ReturnInfoAddedMessagePayloadImpl();
        instance.setReturnInfo(com.commercetools.api.models.order.ReturnInfo.deepCopy(template.getReturnInfo()));
        return instance;
    }

    /**
     * builder factory method for ReturnInfoAddedMessagePayload
     * @return builder
     */
    public static ReturnInfoAddedMessagePayloadBuilder builder() {
        return ReturnInfoAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ReturnInfoAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoAddedMessagePayloadBuilder builder(final ReturnInfoAddedMessagePayload template) {
        return ReturnInfoAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfoAddedMessagePayload(Function<ReturnInfoAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoAddedMessagePayload>";
            }
        };
    }
}
