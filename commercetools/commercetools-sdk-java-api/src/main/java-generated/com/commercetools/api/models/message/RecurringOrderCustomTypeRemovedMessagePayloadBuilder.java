
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomTypeRemovedMessagePayload recurringOrderCustomTypeRemovedMessagePayload = RecurringOrderCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomTypeRemovedMessagePayloadBuilder
        implements Builder<RecurringOrderCustomTypeRemovedMessagePayload> {

    @Nullable
    private String previousTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public RecurringOrderCustomTypeRemovedMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
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
     * builds RecurringOrderCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return RecurringOrderCustomTypeRemovedMessagePayload
     */
    public RecurringOrderCustomTypeRemovedMessagePayload build() {
        return new RecurringOrderCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * builds RecurringOrderCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return RecurringOrderCustomTypeRemovedMessagePayload
     */
    public RecurringOrderCustomTypeRemovedMessagePayload buildUnchecked() {
        return new RecurringOrderCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * factory method for an instance of RecurringOrderCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessagePayloadBuilder of() {
        return new RecurringOrderCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessagePayloadBuilder of(
            final RecurringOrderCustomTypeRemovedMessagePayload template) {
        RecurringOrderCustomTypeRemovedMessagePayloadBuilder builder = new RecurringOrderCustomTypeRemovedMessagePayloadBuilder();
        builder.previousTypeId = template.getPreviousTypeId();
        return builder;
    }

}
