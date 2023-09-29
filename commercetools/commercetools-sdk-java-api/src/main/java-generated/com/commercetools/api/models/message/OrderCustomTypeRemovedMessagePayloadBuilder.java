
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomTypeRemovedMessagePayload orderCustomTypeRemovedMessagePayload = OrderCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomTypeRemovedMessagePayloadBuilder implements Builder<OrderCustomTypeRemovedMessagePayload> {

    @Nullable
    private String previousTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public OrderCustomTypeRemovedMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     * builds OrderCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return OrderCustomTypeRemovedMessagePayload
     */
    public OrderCustomTypeRemovedMessagePayload build() {
        return new OrderCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * builds OrderCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return OrderCustomTypeRemovedMessagePayload
     */
    public OrderCustomTypeRemovedMessagePayload buildUnchecked() {
        return new OrderCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * factory method for an instance of OrderCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomTypeRemovedMessagePayloadBuilder of() {
        return new OrderCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomTypeRemovedMessagePayloadBuilder of(final OrderCustomTypeRemovedMessagePayload template) {
        OrderCustomTypeRemovedMessagePayloadBuilder builder = new OrderCustomTypeRemovedMessagePayloadBuilder();
        builder.previousTypeId = template.getPreviousTypeId();
        return builder;
    }

}
