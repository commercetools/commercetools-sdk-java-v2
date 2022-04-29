
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CreatedByImpl.class)
public interface CreatedBy extends ClientLogging {

    public static CreatedBy of() {
        return new CreatedByImpl();
    }

    public static CreatedBy of(final CreatedBy template) {
        CreatedByImpl instance = new CreatedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static CreatedByBuilder builder() {
        return CreatedByBuilder.of();
    }

    public static CreatedByBuilder builder(final CreatedBy template) {
        return CreatedByBuilder.of(template);
    }

    default <T> T withCreatedBy(Function<CreatedBy, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CreatedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CreatedBy>() {
            @Override
            public String toString() {
                return "TypeReference<CreatedBy>";
            }
        };
    }
}
