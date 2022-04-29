
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LanguageUsedInStoresErrorImpl.class)
public interface LanguageUsedInStoresError extends ErrorObject {

    String LANGUAGE_USED_IN_STORES = "LanguageUsedInStores";

    public static LanguageUsedInStoresError of() {
        return new LanguageUsedInStoresErrorImpl();
    }

    public static LanguageUsedInStoresError of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorImpl instance = new LanguageUsedInStoresErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static LanguageUsedInStoresErrorBuilder builder() {
        return LanguageUsedInStoresErrorBuilder.of();
    }

    public static LanguageUsedInStoresErrorBuilder builder(final LanguageUsedInStoresError template) {
        return LanguageUsedInStoresErrorBuilder.of(template);
    }

    default <T> T withLanguageUsedInStoresError(Function<LanguageUsedInStoresError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LanguageUsedInStoresError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LanguageUsedInStoresError>() {
            @Override
            public String toString() {
                return "TypeReference<LanguageUsedInStoresError>";
            }
        };
    }
}
