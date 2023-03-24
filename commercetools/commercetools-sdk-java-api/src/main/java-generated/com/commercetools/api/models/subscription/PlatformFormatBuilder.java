
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PlatformFormatBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PlatformFormat platformFormat = PlatformFormat.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PlatformFormatBuilder implements Builder<PlatformFormat> {

    /**
     * builds PlatformFormat with checking for non-null required values
     * @return PlatformFormat
     */
    public PlatformFormat build() {
        return new PlatformFormatImpl();
    }

    /**
     * builds PlatformFormat without checking for non-null required values
     * @return PlatformFormat
     */
    public PlatformFormat buildUnchecked() {
        return new PlatformFormatImpl();
    }

    public static PlatformFormatBuilder of() {
        return new PlatformFormatBuilder();
    }

    public static PlatformFormatBuilder of(final PlatformFormat template) {
        PlatformFormatBuilder builder = new PlatformFormatBuilder();
        return builder;
    }

}
