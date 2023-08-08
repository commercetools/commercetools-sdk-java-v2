
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLocaleAction stagedOrderSetLocaleAction = StagedOrderSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLocaleActionBuilder implements Builder<StagedOrderSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *  <p>Value to set. Must be one of the Project's languages. If empty, any existing value is removed.</p>
     * @param locale value to be set
     * @return Builder
     */

    public StagedOrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Value to set. Must be one of the Project's languages. If empty, any existing value is removed.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     * builds StagedOrderSetLocaleAction with checking for non-null required values
     * @return StagedOrderSetLocaleAction
     */
    public StagedOrderSetLocaleAction build() {
        return new StagedOrderSetLocaleActionImpl(locale);
    }

    /**
     * builds StagedOrderSetLocaleAction without checking for non-null required values
     * @return StagedOrderSetLocaleAction
     */
    public StagedOrderSetLocaleAction buildUnchecked() {
        return new StagedOrderSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of StagedOrderSetLocaleActionBuilder
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder of() {
        return new StagedOrderSetLocaleActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionBuilder builder = new StagedOrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
