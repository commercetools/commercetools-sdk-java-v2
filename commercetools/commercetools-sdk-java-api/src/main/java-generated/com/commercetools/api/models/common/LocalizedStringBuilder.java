
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedStringBuilder {

    private Map<String, String> values;

    public LocalizedStringBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    public LocalizedStringBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, String> getValues() {
        return this.values;
    }

    public LocalizedString build() {
        return new LocalizedStringImpl(values);
    }

    public static LocalizedStringBuilder of() {
        return new LocalizedStringBuilder();
    }

    public static LocalizedStringBuilder of(final LocalizedString template) {
        LocalizedStringBuilder builder = new LocalizedStringBuilder();
        builder.values = template.values();
        return builder;
    }

}
