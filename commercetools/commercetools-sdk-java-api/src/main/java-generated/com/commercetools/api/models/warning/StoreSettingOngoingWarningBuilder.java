
package com.commercetools.api.models.warning;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSettingOngoingWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSettingOngoingWarning storeSettingOngoingWarning = StoreSettingOngoingWarning.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSettingOngoingWarningBuilder implements Builder<StoreSettingOngoingWarning> {

    private String message;

    /**
     *  <p><code>"The store setting is still ongoing."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public StoreSettingOngoingWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p><code>"The store setting is still ongoing."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * builds StoreSettingOngoingWarning with checking for non-null required values
     * @return StoreSettingOngoingWarning
     */
    public StoreSettingOngoingWarning build() {
        Objects.requireNonNull(message, StoreSettingOngoingWarning.class + ": message is missing");
        return new StoreSettingOngoingWarningImpl(message);
    }

    /**
     * builds StoreSettingOngoingWarning without checking for non-null required values
     * @return StoreSettingOngoingWarning
     */
    public StoreSettingOngoingWarning buildUnchecked() {
        return new StoreSettingOngoingWarningImpl(message);
    }

    /**
     * factory method for an instance of StoreSettingOngoingWarningBuilder
     * @return builder
     */
    public static StoreSettingOngoingWarningBuilder of() {
        return new StoreSettingOngoingWarningBuilder();
    }

    /**
     * create builder for StoreSettingOngoingWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSettingOngoingWarningBuilder of(final StoreSettingOngoingWarning template) {
        StoreSettingOngoingWarningBuilder builder = new StoreSettingOngoingWarningBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
