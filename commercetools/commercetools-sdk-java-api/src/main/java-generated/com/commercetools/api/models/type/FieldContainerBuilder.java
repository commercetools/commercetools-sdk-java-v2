
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldContainerBuilder {

    private Map<String, java.lang.Object> values;

    public FieldContainerBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public FieldContainerBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public FieldContainer build() {
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
