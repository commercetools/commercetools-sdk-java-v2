
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LanguageUsedInStoresErrorBuilder implements Builder<LanguageUsedInStoresError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public LanguageUsedInStoresErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public LanguageUsedInStoresErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public LanguageUsedInStoresErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public LanguageUsedInStoresError build() {
        Objects.requireNonNull(message, LanguageUsedInStoresError.class + ": message is missing");
        Objects.requireNonNull(values, LanguageUsedInStoresError.class + ": values are missing");
        return new LanguageUsedInStoresErrorImpl(message, values);
    }

    /**
     * builds LanguageUsedInStoresError without checking for non null required values
     */
    public LanguageUsedInStoresError buildUnchecked() {
        return new LanguageUsedInStoresErrorImpl(message, values);
    }

    public static LanguageUsedInStoresErrorBuilder of() {
        return new LanguageUsedInStoresErrorBuilder();
    }

    public static LanguageUsedInStoresErrorBuilder of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorBuilder builder = new LanguageUsedInStoresErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
