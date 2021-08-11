
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryOrderHintsBuilder implements Builder<CategoryOrderHints> {

    private Map<String, String> values = new HashMap<>();

    public CategoryOrderHintsBuilder values(final Map<String, String> values) {
        this.values = values;
        return this;
    }

    public CategoryOrderHintsBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, String> getValues() {
        return this.values;
    }

    public CategoryOrderHints build() {
        Objects.requireNonNull(values, CategoryOrderHints.class + ": values are missing");
        return new CategoryOrderHintsImpl(values);
    }

    /**
     * builds CategoryOrderHints without checking for non null required values
     */
    public CategoryOrderHints buildUnchecked() {
        return new CategoryOrderHintsImpl(values);
    }

    public static CategoryOrderHintsBuilder of() {
        return new CategoryOrderHintsBuilder();
    }

    public static CategoryOrderHintsBuilder of(final CategoryOrderHints template) {
        CategoryOrderHintsBuilder builder = new CategoryOrderHintsBuilder();
        builder.values = template.values();
        return builder;
    }

}
