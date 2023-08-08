
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.order.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set ReturnInfo update action on Orders and Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfoSetMessagePayload returnInfoSetMessagePayload = ReturnInfoSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoSetMessagePayloadImpl.class)
public interface ReturnInfoSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ReturnInfoSetMessagePayload
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
     * @return instance of ReturnInfoSetMessagePayload
     */
    public static ReturnInfoSetMessagePayload of() {
        return new ReturnInfoSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ReturnInfoSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfoSetMessagePayload of(final ReturnInfoSetMessagePayload template) {
        ReturnInfoSetMessagePayloadImpl instance = new ReturnInfoSetMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReturnInfoSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfoSetMessagePayload deepCopy(@Nullable final ReturnInfoSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ReturnInfoSetMessagePayloadImpl instance = new ReturnInfoSetMessagePayloadImpl();
        instance.setReturnInfo(Optional.ofNullable(template.getReturnInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReturnInfoSetMessagePayload
     * @return builder
     */
    public static ReturnInfoSetMessagePayloadBuilder builder() {
        return ReturnInfoSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ReturnInfoSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoSetMessagePayloadBuilder builder(final ReturnInfoSetMessagePayload template) {
        return ReturnInfoSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfoSetMessagePayload(Function<ReturnInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoSetMessagePayload>";
            }
        };
    }
}
