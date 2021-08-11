
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidItemShippingDetailsErrorBuilder implements Builder<InvalidItemShippingDetailsError> {

    private String message;

    private String subject;

    private String itemId;

    public InvalidItemShippingDetailsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidItemShippingDetailsErrorBuilder subject(final String subject) {
        this.subject = subject;
        return this;
    }

    public InvalidItemShippingDetailsErrorBuilder itemId(final String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getItemId() {
        return this.itemId;
    }

    public InvalidItemShippingDetailsError build() {
        Objects.requireNonNull(message, InvalidItemShippingDetailsError.class + ": message is missing");
        Objects.requireNonNull(subject, InvalidItemShippingDetailsError.class + ": subject is missing");
        Objects.requireNonNull(itemId, InvalidItemShippingDetailsError.class + ": itemId is missing");
        return new InvalidItemShippingDetailsErrorImpl(message, subject, itemId);
    }

    /**
     * builds InvalidItemShippingDetailsError without checking for non null required values
     */
    public InvalidItemShippingDetailsError buildUnchecked() {
        return new InvalidItemShippingDetailsErrorImpl(message, subject, itemId);
    }

    public static InvalidItemShippingDetailsErrorBuilder of() {
        return new InvalidItemShippingDetailsErrorBuilder();
    }

    public static InvalidItemShippingDetailsErrorBuilder of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorBuilder builder = new InvalidItemShippingDetailsErrorBuilder();
        builder.message = template.getMessage();
        builder.subject = template.getSubject();
        builder.itemId = template.getItemId();
        return builder;
    }

}
