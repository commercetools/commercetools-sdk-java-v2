
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneSetDescriptionActionBuilder implements Builder<ZoneSetDescriptionAction> {

    @Nullable
    private String description;

    public ZoneSetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public ZoneSetDescriptionAction build() {
        return new ZoneSetDescriptionActionImpl(description);
    }

    /**
     * builds ZoneSetDescriptionAction without checking for non null required values
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
