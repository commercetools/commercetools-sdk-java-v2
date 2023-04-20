
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
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoAddedMessagePayloadBuilder returnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoAddedMessagePayloadBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfo> builder) {
        this.returnInfo = builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of());
        return this;
    }

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public ReturnInfoAddedMessagePayloadBuilder returnInfo(
            final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    /**
     *  <p>The ReturnInfo that was added to the Order.</p>
     * @return returnInfo
     */

    public com.commercetools.api.models.order.ReturnInfo getReturnInfo() {
        return this.returnInfo;
    }

    /**
     * builds ReturnInfoAddedMessagePayload with checking for non-null required values
     * @return ReturnInfoAddedMessagePayload
     */
    public ReturnInfoAddedMessagePayload build() {
        Objects.requireNonNull(returnInfo, ReturnInfoAddedMessagePayload.class + ": returnInfo is missing");
        return new ReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    /**
     * builds ReturnInfoAddedMessagePayload without checking for non-null required values
     * @return ReturnInfoAddedMessagePayload
     */
    public ReturnInfoAddedMessagePayload buildUnchecked() {
        return new ReturnInfoAddedMessagePayloadImpl(returnInfo);
    }

    /**
     * factory method for an instance of ReturnInfoAddedMessagePayloadBuilder
     * @return builder
     */
    public static ReturnInfoAddedMessagePayloadBuilder of() {
        return new ReturnInfoAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ReturnInfoAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoAddedMessagePayloadBuilder of(final ReturnInfoAddedMessagePayload template) {
        ReturnInfoAddedMessagePayloadBuilder builder = new ReturnInfoAddedMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
