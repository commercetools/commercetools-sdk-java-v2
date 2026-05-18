
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetKeyUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetKeyUpdateAction setKeyUpdateAction = SetKeyUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetKeyUpdateActionBuilder implements Builder<SetKeyUpdateAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public SetKeyUpdateActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds SetKeyUpdateAction with checking for non-null required values
     * @return SetKeyUpdateAction
     */
    public SetKeyUpdateAction build() {
        return new SetKeyUpdateActionImpl(key);
    }

    /**
     * builds SetKeyUpdateAction without checking for non-null required values
     * @return SetKeyUpdateAction
     */
    public SetKeyUpdateAction buildUnchecked() {
        return new SetKeyUpdateActionImpl(key);
    }

    /**
     * factory method for an instance of SetKeyUpdateActionBuilder
     * @return builder
     */
    public static SetKeyUpdateActionBuilder of() {
        return new SetKeyUpdateActionBuilder();
    }

    /**
     * create builder for SetKeyUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetKeyUpdateActionBuilder of(final SetKeyUpdateAction template) {
        SetKeyUpdateActionBuilder builder = new SetKeyUpdateActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
