
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneSetKeyAction zoneSetKeyAction = ZoneSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneSetKeyActionBuilder implements Builder<ZoneSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ZoneSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ZoneSetKeyAction with checking for non-null required values
     * @return ZoneSetKeyAction
     */
    public ZoneSetKeyAction build() {
        return new ZoneSetKeyActionImpl(key);
    }

    /**
     * builds ZoneSetKeyAction without checking for non-null required values
     * @return ZoneSetKeyAction
     */
    public ZoneSetKeyAction buildUnchecked() {
        return new ZoneSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ZoneSetKeyActionBuilder
     * @return builder
     */
    public static ZoneSetKeyActionBuilder of() {
        return new ZoneSetKeyActionBuilder();
    }

    /**
     * create builder for ZoneSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneSetKeyActionBuilder of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionBuilder builder = new ZoneSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
