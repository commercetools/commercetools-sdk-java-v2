
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoSetMessagePayloadBuilder
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
public class ReturnInfoSetMessagePayloadBuilder implements Builder<ReturnInfoSetMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder returnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder plusReturnInfo(
            @Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.addAll(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder addReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfo> builder) {
        return plusReturnInfo(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()));
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public ReturnInfoSetMessagePayloadBuilder setReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfo> builder) {
        return returnInfo(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()));
    }

    /**
     *  <p>The ReturnInfo that was set on the Order or Order Edit.</p>
     * @return returnInfo
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    /**
     * builds ReturnInfoSetMessagePayload with checking for non-null required values
     * @return ReturnInfoSetMessagePayload
     */
    public ReturnInfoSetMessagePayload build() {
        return new ReturnInfoSetMessagePayloadImpl(returnInfo);
    }

    /**
     * builds ReturnInfoSetMessagePayload without checking for non-null required values
     * @return ReturnInfoSetMessagePayload
     */
    public ReturnInfoSetMessagePayload buildUnchecked() {
        return new ReturnInfoSetMessagePayloadImpl(returnInfo);
    }

    /**
     * factory method for an instance of ReturnInfoSetMessagePayloadBuilder
     * @return builder
     */
    public static ReturnInfoSetMessagePayloadBuilder of() {
        return new ReturnInfoSetMessagePayloadBuilder();
    }

    /**
     * create builder for ReturnInfoSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoSetMessagePayloadBuilder of(final ReturnInfoSetMessagePayload template) {
        ReturnInfoSetMessagePayloadBuilder builder = new ReturnInfoSetMessagePayloadBuilder();
        builder.returnInfo = template.getReturnInfo();
        return builder;
    }

}
