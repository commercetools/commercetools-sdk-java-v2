package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneSetKeyActionBuilder {

    
    @Nullable
    private String key;

    
    public ZoneSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    
    @Nullable
    public String getKey(){
        return this.key;
    }

    public ZoneSetKeyAction build() {
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
