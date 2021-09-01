
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EditPreviewFailedErrorBuilder implements Builder<EditPreviewFailedError> {

    private String message;

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    public EditPreviewFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public EditPreviewFailedErrorBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder, com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of())
                .build();
        return this;
    }

    public EditPreviewFailedErrorBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult() {
        return this.result;
    }

    public EditPreviewFailedError build() {
        Objects.requireNonNull(message, EditPreviewFailedError.class + ": message is missing");
        Objects.requireNonNull(result, EditPreviewFailedError.class + ": result is missing");
        return new EditPreviewFailedErrorImpl(message, result);
    }

    /**
     * builds EditPreviewFailedError without checking for non null required values
     */
    public EditPreviewFailedError buildUnchecked() {
        return new EditPreviewFailedErrorImpl(message, result);
    }

    public static EditPreviewFailedErrorBuilder of() {
        return new EditPreviewFailedErrorBuilder();
    }

    public static EditPreviewFailedErrorBuilder of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorBuilder builder = new EditPreviewFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.result = template.getResult();
        return builder;
    }

}
