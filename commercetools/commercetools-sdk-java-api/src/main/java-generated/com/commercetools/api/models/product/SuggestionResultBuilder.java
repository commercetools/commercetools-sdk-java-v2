
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SuggestionResultBuilder {

    private Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values;

    public SuggestionResultBuilder values(
            final Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values) {
        this.values = values;
        return this;
    }

    public SuggestionResultBuilder addValue(final String key,
            final java.util.List<com.commercetools.api.models.product.Suggestion> value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> getValues() {
        return this.values;
    }

    public SuggestionResult build() {
        return new SuggestionResultImpl(values);
    }

    public static SuggestionResultBuilder of() {
        return new SuggestionResultBuilder();
    }

    public static SuggestionResultBuilder of(final SuggestionResult template) {
        SuggestionResultBuilder builder = new SuggestionResultBuilder();
        builder.values = template.values();
        return builder;
    }

}
