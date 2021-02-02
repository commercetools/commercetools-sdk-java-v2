
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FacetResultsBuilder {

    private Map<String, java.lang.Object> values;

    public FacetResultsBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public FacetResultsBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public FacetResults build() {
        return new FacetResultsImpl(values);
    }

    public static FacetResultsBuilder of() {
        return new FacetResultsBuilder();
    }

    public static FacetResultsBuilder of(final FacetResults template) {
        FacetResultsBuilder builder = new FacetResultsBuilder();
        builder.values = template.values();
        return builder;
    }

}
