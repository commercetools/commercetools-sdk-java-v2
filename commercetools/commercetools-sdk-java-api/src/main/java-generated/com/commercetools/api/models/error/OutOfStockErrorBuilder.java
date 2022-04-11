
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OutOfStockErrorBuilder implements Builder<OutOfStockError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> lineItems;

    private java.util.List<String> skus;

    public OutOfStockErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public OutOfStockErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public OutOfStockErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public OutOfStockErrorBuilder lineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public OutOfStockErrorBuilder lineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public OutOfStockErrorBuilder plusLineItems(final String... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    public OutOfStockErrorBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    public OutOfStockErrorBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    public OutOfStockErrorBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public OutOfStockError build() {
        Objects.requireNonNull(message, OutOfStockError.class + ": message is missing");
        Objects.requireNonNull(values, OutOfStockError.class + ": values are missing");
        Objects.requireNonNull(lineItems, OutOfStockError.class + ": lineItems is missing");
        Objects.requireNonNull(skus, OutOfStockError.class + ": skus is missing");
        return new OutOfStockErrorImpl(message, values, lineItems, skus);
    }

    /**
     * builds OutOfStockError without checking for non null required values
     */
    public OutOfStockError buildUnchecked() {
        return new OutOfStockErrorImpl(message, values, lineItems, skus);
    }

    public static OutOfStockErrorBuilder of() {
        return new OutOfStockErrorBuilder();
    }

    public static OutOfStockErrorBuilder of(final OutOfStockError template) {
        OutOfStockErrorBuilder builder = new OutOfStockErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.lineItems = template.getLineItems();
        builder.skus = template.getSkus();
        return builder;
    }

}
