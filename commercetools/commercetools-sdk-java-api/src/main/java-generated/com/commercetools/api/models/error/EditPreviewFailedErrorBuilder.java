
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EditPreviewFailedErrorBuilder {

    private String message;

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    public EditPreviewFailedErrorBuilder message(final String message) {
        this.message = message;
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
