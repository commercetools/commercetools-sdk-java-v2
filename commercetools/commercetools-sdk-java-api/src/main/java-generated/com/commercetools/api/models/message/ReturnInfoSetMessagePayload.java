
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
 *     ReturnInfoSetMessagePayload returnInfoSetMessagePayload = ReturnInfoSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoSetMessagePayloadImpl.class)
public interface ReturnInfoSetMessagePayload extends OrderMessagePayload {

    String RETURN_INFO_SET = "ReturnInfoSet";

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @return returnInfo
     */
    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    public static ReturnInfoSetMessagePayload of() {
        return new ReturnInfoSetMessagePayloadImpl();
    }

    public static ReturnInfoSetMessagePayload of(final ReturnInfoSetMessagePayload template) {
        ReturnInfoSetMessagePayloadImpl instance = new ReturnInfoSetMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static ReturnInfoSetMessagePayloadBuilder builder() {
        return ReturnInfoSetMessagePayloadBuilder.of();
    }

    public static ReturnInfoSetMessagePayloadBuilder builder(final ReturnInfoSetMessagePayload template) {
        return ReturnInfoSetMessagePayloadBuilder.of(template);
    }

    default <T> T withReturnInfoSetMessagePayload(Function<ReturnInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoSetMessagePayload>";
            }
        };
    }
}
