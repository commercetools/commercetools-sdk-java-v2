
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OutOfStockErrorBuilder {

    private String message;

    private java.util.List<String> lineItems;

    private java.util.List<String> skus;

    public OutOfStockErrorBuilder message(final String message) {
        this.message = message;
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

    public OutOfStockErrorBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    public OutOfStockErrorBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public OutOfStockError build() {
        return new OutOfStockErrorImpl(message, lineItems, skus);
    }

    public static OutOfStockErrorBuilder of() {
        return new OutOfStockErrorBuilder();
    }

    public static OutOfStockErrorBuilder of(final OutOfStockError template) {
        OutOfStockErrorBuilder builder = new OutOfStockErrorBuilder();
        builder.message = template.getMessage();
        builder.lineItems = template.getLineItems();
        builder.skus = template.getSkus();
        return builder;
    }

}
