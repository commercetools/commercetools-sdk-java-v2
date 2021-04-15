
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LastModifiedByImpl.class)
public interface LastModifiedBy extends ClientLogging {

    public static LastModifiedBy of() {
        return new LastModifiedByImpl();
    }

    public static LastModifiedBy of(final LastModifiedBy template) {
        LastModifiedByImpl instance = new LastModifiedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static LastModifiedByBuilder builder() {
        return LastModifiedByBuilder.of();
    }

    public static LastModifiedByBuilder builder(final LastModifiedBy template) {
        return LastModifiedByBuilder.of(template);
    }

    default <T> T withLastModifiedBy(Function<LastModifiedBy, T> helper) {
        return helper.apply(this);
    }
}
