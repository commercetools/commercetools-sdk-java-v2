
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceActiveChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceActiveChangedMessagePayload standalonePriceActiveChangedMessagePayload = StandalonePriceActiveChangedMessagePayload.builder()
 *             .active(true)
 *             .oldActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceActiveChangedMessagePayloadBuilder
        implements Builder<StandalonePriceActiveChangedMessagePayload> {

    private Boolean active;

    private Boolean oldActive;

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the Change Active update action.</p>
     * @param active value to be set
     * @return Builder
     */

    public StandalonePriceActiveChangedMessagePayloadBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the Change Active update action.</p>
     * @param oldActive value to be set
     * @return Builder
     */

    public StandalonePriceActiveChangedMessagePayloadBuilder oldActive(final Boolean oldActive) {
        this.oldActive = oldActive;
        return this;
    }

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the Change Active update action.</p>
     * @return active
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the Change Active update action.</p>
     * @return oldActive
     */

    public Boolean getOldActive() {
        return this.oldActive;
    }

    /**
     * builds StandalonePriceActiveChangedMessagePayload with checking for non-null required values
     * @return StandalonePriceActiveChangedMessagePayload
     */
    public StandalonePriceActiveChangedMessagePayload build() {
        Objects.requireNonNull(active, StandalonePriceActiveChangedMessagePayload.class + ": active is missing");
        Objects.requireNonNull(oldActive, StandalonePriceActiveChangedMessagePayload.class + ": oldActive is missing");
        return new StandalonePriceActiveChangedMessagePayloadImpl(active, oldActive);
    }

    /**
     * builds StandalonePriceActiveChangedMessagePayload without checking for non-null required values
     * @return StandalonePriceActiveChangedMessagePayload
     */
    public StandalonePriceActiveChangedMessagePayload buildUnchecked() {
        return new StandalonePriceActiveChangedMessagePayloadImpl(active, oldActive);
    }

    /**
     * factory method for an instance of StandalonePriceActiveChangedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceActiveChangedMessagePayloadBuilder of() {
        return new StandalonePriceActiveChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceActiveChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceActiveChangedMessagePayloadBuilder of(
            final StandalonePriceActiveChangedMessagePayload template) {
        StandalonePriceActiveChangedMessagePayloadBuilder builder = new StandalonePriceActiveChangedMessagePayloadBuilder();
        builder.active = template.getActive();
        builder.oldActive = template.getOldActive();
        return builder;
    }

}
