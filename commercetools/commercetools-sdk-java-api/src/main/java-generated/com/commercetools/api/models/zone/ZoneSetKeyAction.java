
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneSetKeyActionImpl.class)
public interface ZoneSetKeyAction extends ZoneUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ZoneSetKeyAction of() {
        return new ZoneSetKeyActionImpl();
    }

    public static ZoneSetKeyAction of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ZoneSetKeyActionBuilder builder() {
        return ZoneSetKeyActionBuilder.of();
    }

    public static ZoneSetKeyActionBuilder builder(final ZoneSetKeyAction template) {
        return ZoneSetKeyActionBuilder.of(template);
    }

    default <T> T withZoneSetKeyAction(Function<ZoneSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneSetKeyAction>";
            }
        };
    }
}
