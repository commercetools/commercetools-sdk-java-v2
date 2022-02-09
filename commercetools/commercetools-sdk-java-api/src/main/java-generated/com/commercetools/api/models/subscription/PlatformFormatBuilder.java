
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PlatformFormatBuilder implements Builder<PlatformFormat> {

    public PlatformFormat build() {
        return new PlatformFormatImpl();
    }

    /**
     * builds PlatformFormat without checking for non null required values
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
