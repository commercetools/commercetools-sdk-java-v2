
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderKeySetMessagePayload recurringOrderKeySetMessagePayload = RecurringOrderKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderKeySetMessagePayloadBuilder implements Builder<RecurringOrderKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the RecurringOrder after the Set Key update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringOrderKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the RecurringOrder before the Set Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public RecurringOrderKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the RecurringOrder after the Set Key update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the RecurringOrder before the Set Key update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds RecurringOrderKeySetMessagePayload with checking for non-null required values
     * @return RecurringOrderKeySetMessagePayload
     */
    public RecurringOrderKeySetMessagePayload build() {
        return new RecurringOrderKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds RecurringOrderKeySetMessagePayload without checking for non-null required values
     * @return RecurringOrderKeySetMessagePayload
     */
    public RecurringOrderKeySetMessagePayload buildUnchecked() {
        return new RecurringOrderKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of RecurringOrderKeySetMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderKeySetMessagePayloadBuilder of() {
        return new RecurringOrderKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderKeySetMessagePayloadBuilder of(final RecurringOrderKeySetMessagePayload template) {
        RecurringOrderKeySetMessagePayloadBuilder builder = new RecurringOrderKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
