
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneSetKeyActionBuilder implements Builder<ZoneSetKeyAction> {

    @Nullable
    private String key;

    public ZoneSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ZoneSetKeyAction build() {
        return new ZoneSetKeyActionImpl(key);
    }

    /**
     * builds ZoneSetKeyAction without checking for non null required values
     */
    public ZoneSetKeyAction buildUnchecked() {
        return new ZoneSetKeyActionImpl(key);
    }

    public static ZoneSetKeyActionBuilder of() {
        return new ZoneSetKeyActionBuilder();
    }

    public static ZoneSetKeyActionBuilder of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionBuilder builder = new ZoneSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
