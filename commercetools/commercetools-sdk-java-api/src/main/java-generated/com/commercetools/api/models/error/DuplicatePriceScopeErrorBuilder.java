
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicatePriceScopeErrorBuilder implements Builder<DuplicatePriceScopeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<com.commercetools.api.models.common.Price> conflictingPrices;

    public DuplicatePriceScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicatePriceScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DuplicatePriceScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DuplicatePriceScopeErrorBuilder conflictingPrices(
            final com.commercetools.api.models.common.Price... conflictingPrices) {
        this.conflictingPrices = new ArrayList<>(Arrays.asList(conflictingPrices));
        return this;
    }

    public DuplicatePriceScopeErrorBuilder conflictingPrices(
            final java.util.List<com.commercetools.api.models.common.Price> conflictingPrices) {
        this.conflictingPrices = conflictingPrices;
        return this;
    }

    public DuplicatePriceScopeErrorBuilder plusConflictingPrices(
            final com.commercetools.api.models.common.Price... conflictingPrices) {
        if (this.conflictingPrices == null) {
            this.conflictingPrices = new ArrayList<>();
        }
        this.conflictingPrices.addAll(Arrays.asList(conflictingPrices));
        return this;
    }

    public DuplicatePriceScopeErrorBuilder plusConflictingPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.conflictingPrices == null) {
            this.conflictingPrices = new ArrayList<>();
        }
        this.conflictingPrices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    public DuplicatePriceScopeErrorBuilder withConflictingPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrices = new ArrayList<>();
        this.conflictingPrices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getConflictingPrices() {
        return this.conflictingPrices;
    }

    public DuplicatePriceScopeError build() {
        Objects.requireNonNull(message, DuplicatePriceScopeError.class + ": message is missing");
        Objects.requireNonNull(values, DuplicatePriceScopeError.class + ": values are missing");
        Objects.requireNonNull(conflictingPrices, DuplicatePriceScopeError.class + ": conflictingPrices is missing");
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrices);
    }

    /**
     * builds DuplicatePriceScopeError without checking for non null required values
     */
    public DuplicatePriceScopeError buildUnchecked() {
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrices);
    }

    public static DuplicatePriceScopeErrorBuilder of() {
        return new DuplicatePriceScopeErrorBuilder();
    }

    public static DuplicatePriceScopeErrorBuilder of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorBuilder builder = new DuplicatePriceScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrices = template.getConflictingPrices();
        return builder;
    }

}
