
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoAddedMessagePayloadBuilder
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
public class ReturnInfoAddedMessagePayloadBuilder implements Builder<ReturnInfoAddedMessagePayload> {

    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     */

    public ReturnInfoAddedMessagePayloadBuilder returnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     */

    public ReturnInfoAddedMessagePayloadBuilder returnInfo(
            final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    public ReturnInfoAddedMessagePayload build() {
        Objects.requireNonNull(returnInfo, ReturnInfoAddedMessagePayload.class + ": returnInfo is missing");
        return new ReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    /**
     * builds ReturnInfoAddedMessagePayload without checking for non null required values
     */
    public ReturnInfoAddedMessagePayload buildUnchecked() {
        return new ReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    public static ReturnInfoAddedMessagePayloadBuilder of() {
        return new ReturnInfoAddedMessagePayloadBuilder();
    }

    public static ReturnInfoAddedMessagePayloadBuilder of(final ReturnInfoAddedMessagePayload template) {
        ReturnInfoAddedMessagePayloadBuilder builder = new ReturnInfoAddedMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
