
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditPreviewFailureBuilder implements Builder<OrderEditPreviewFailure> {

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    public OrderEditPreviewFailureBuilder errors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public OrderEditPreviewFailureBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    public OrderEditPreviewFailure build() {
        Objects.requireNonNull(errors, OrderEditPreviewFailure.class + ": errors is missing");
        return new OrderEditPreviewFailureImpl(errors);
    }

    /**
     * builds OrderEditPreviewFailure without checking for non null required values
     */
    public OrderEditPreviewFailure buildUnchecked() {
        return new OrderEditPreviewFailureImpl(errors);
    }

    public static OrderEditPreviewFailureBuilder of() {
        return new OrderEditPreviewFailureBuilder();
    }

    public static OrderEditPreviewFailureBuilder of(final OrderEditPreviewFailure template) {
        OrderEditPreviewFailureBuilder builder = new OrderEditPreviewFailureBuilder();
        builder.errors = template.getErrors();
        return builder;
    }

}
