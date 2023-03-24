
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneSetDescriptionAction zoneSetDescriptionAction = ZoneSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneSetDescriptionActionBuilder implements Builder<ZoneSetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>Description of the Zone.</p>
     * @param description value to be set
     * @return Builder
     */

    public ZoneSetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     * builds ZoneSetDescriptionAction with checking for non-null required values
     * @return ZoneSetDescriptionAction
     */
    public ZoneSetDescriptionAction build() {
        return new ZoneSetDescriptionActionImpl(description);
    }

    /**
     * builds ZoneSetDescriptionAction without checking for non-null required values
     * @return ZoneSetDescriptionAction
     */
    public ZoneSetDescriptionAction buildUnchecked() {
        return new ZoneSetDescriptionActionImpl(description);
    }

    public static ZoneSetDescriptionActionBuilder of() {
        return new ZoneSetDescriptionActionBuilder();
    }

    public static ZoneSetDescriptionActionBuilder of(final ZoneSetDescriptionAction template) {
        ZoneSetDescriptionActionBuilder builder = new ZoneSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
