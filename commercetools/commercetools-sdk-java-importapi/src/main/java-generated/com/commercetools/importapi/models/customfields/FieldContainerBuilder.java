
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldContainerBuilder implements Builder<FieldContainer> {

    private Map<String, com.commercetools.importapi.models.customfields.CustomField> values = new HashMap<>();

    public FieldContainerBuilder values(
            final Map<String, com.commercetools.importapi.models.customfields.CustomField> values) {
        this.values = values;
        return this;
    }

    public FieldContainerBuilder addValue(final String key,
            final com.commercetools.importapi.models.customfields.CustomField value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.importapi.models.customfields.CustomField> getValues() {
        return this.values;
    }

    public FieldContainer build() {
        Objects.requireNonNull(values, FieldContainer.class + ": values are missing");
        return new FieldContainerImpl(values);
    }

    /**
     * builds FieldContainer without checking for non null required values
     */
    public FieldContainer buildUnchecked() {
        return new FieldContainerImpl(values);
    }

    public static FieldContainerBuilder of() {
        return new FieldContainerBuilder();
    }

    public static FieldContainerBuilder of(final FieldContainer template) {
        FieldContainerBuilder builder = new FieldContainerBuilder();
        builder.values = template.values();
        return builder;
    }

}
