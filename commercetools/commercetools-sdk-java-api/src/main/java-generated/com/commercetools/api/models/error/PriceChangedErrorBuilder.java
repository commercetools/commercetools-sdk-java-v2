
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PriceChangedErrorBuilder implements Builder<PriceChangedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> lineItems;

    private Boolean shipping;

    public PriceChangedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public PriceChangedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public PriceChangedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public PriceChangedErrorBuilder lineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public PriceChangedErrorBuilder lineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public PriceChangedErrorBuilder plusLineItems(final String... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    public PriceChangedErrorBuilder shipping(final Boolean shipping) {
        this.shipping = shipping;
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

    public Boolean getShipping() {
        return this.shipping;
    }

    public PriceChangedError build() {
        Objects.requireNonNull(message, PriceChangedError.class + ": message is missing");
        Objects.requireNonNull(values, PriceChangedError.class + ": values are missing");
        Objects.requireNonNull(lineItems, PriceChangedError.class + ": lineItems is missing");
        Objects.requireNonNull(shipping, PriceChangedError.class + ": shipping is missing");
        return new PriceChangedErrorImpl(message, values, lineItems, shipping);
    }

    /**
     * builds PriceChangedError without checking for non null required values
     */
    public PriceChangedError buildUnchecked() {
        return new PriceChangedErrorImpl(message, values, lineItems, shipping);
    }

    public static PriceChangedErrorBuilder of() {
        return new PriceChangedErrorBuilder();
    }

    public static PriceChangedErrorBuilder of(final PriceChangedError template) {
        PriceChangedErrorBuilder builder = new PriceChangedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.lineItems = template.getLineItems();
        builder.shipping = template.getShipping();
        return builder;
    }

}
