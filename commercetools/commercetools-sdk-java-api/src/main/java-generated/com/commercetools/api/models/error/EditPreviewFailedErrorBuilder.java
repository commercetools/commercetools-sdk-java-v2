
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EditPreviewFailedErrorBuilder implements Builder<EditPreviewFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    public EditPreviewFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public EditPreviewFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public EditPreviewFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult() {
        return this.result;
    }

    public EditPreviewFailedError build() {
        Objects.requireNonNull(message, EditPreviewFailedError.class + ": message is missing");
        Objects.requireNonNull(values, EditPreviewFailedError.class + ": values are missing");
        Objects.requireNonNull(result, EditPreviewFailedError.class + ": result is missing");
        return new EditPreviewFailedErrorImpl(message, values, result);
    }

    /**
     * builds EditPreviewFailedError without checking for non null required values
     */
    public EditPreviewFailedError buildUnchecked() {
        return new EditPreviewFailedErrorImpl(message, values, result);
    }

    public static EditPreviewFailedErrorBuilder of() {
        return new EditPreviewFailedErrorBuilder();
    }

    public static EditPreviewFailedErrorBuilder of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorBuilder builder = new EditPreviewFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.result = template.getResult();
        return builder;
    }

}
