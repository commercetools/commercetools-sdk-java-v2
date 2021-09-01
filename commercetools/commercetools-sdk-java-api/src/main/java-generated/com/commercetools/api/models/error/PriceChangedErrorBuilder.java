
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceChangedErrorBuilder implements Builder<PriceChangedError> {

    private String message;

    private java.util.List<String> lineItems;

    private Boolean shipping;

    public PriceChangedErrorBuilder message(final String message) {
        this.message = message;
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

    public PriceChangedErrorBuilder shipping(final Boolean shipping) {
        this.shipping = shipping;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    public Boolean getShipping() {
        return this.shipping;
    }

    public PriceChangedError build() {
        Objects.requireNonNull(message, PriceChangedError.class + ": message is missing");
        Objects.requireNonNull(lineItems, PriceChangedError.class + ": lineItems is missing");
        Objects.requireNonNull(shipping, PriceChangedError.class + ": shipping is missing");
        return new PriceChangedErrorImpl(message, lineItems, shipping);
    }

    /**
     * builds PriceChangedError without checking for non null required values
     */
    public PriceChangedError buildUnchecked() {
        return new PriceChangedErrorImpl(message, lineItems, shipping);
    }

    public static PriceChangedErrorBuilder of() {
        return new PriceChangedErrorBuilder();
    }

    public static PriceChangedErrorBuilder of(final PriceChangedError template) {
        PriceChangedErrorBuilder builder = new PriceChangedErrorBuilder();
        builder.message = template.getMessage();
        builder.lineItems = template.getLineItems();
        builder.shipping = template.getShipping();
        return builder;
    }

}
