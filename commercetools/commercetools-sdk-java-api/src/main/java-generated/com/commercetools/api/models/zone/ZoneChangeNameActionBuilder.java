package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneChangeNameActionBuilder {

    
    private String name;

    public ZoneChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }

    
    public String getName(){
        return this.name;
    }

    public ZoneChangeNameAction build() {
        return new ZoneChangeNameActionImpl(name);
    }

    public static ZoneChangeNameActionBuilder of() {
        return new ZoneChangeNameActionBuilder();
    }

    public static ZoneChangeNameActionBuilder of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionBuilder builder = new ZoneChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
