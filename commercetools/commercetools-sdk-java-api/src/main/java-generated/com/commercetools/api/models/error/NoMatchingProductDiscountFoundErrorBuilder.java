
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class NoMatchingProductDiscountFoundErrorBuilder implements Builder<NoMatchingProductDiscountFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public NoMatchingProductDiscountFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public NoMatchingProductDiscountFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public NoMatchingProductDiscountFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public NoMatchingProductDiscountFoundError build() {
        Objects.requireNonNull(message, NoMatchingProductDiscountFoundError.class + ": message is missing");
        Objects.requireNonNull(values, NoMatchingProductDiscountFoundError.class + ": values are missing");
        return new NoMatchingProductDiscountFoundErrorImpl(message, values);
    }

    /**
     * builds NoMatchingProductDiscountFoundError without checking for non null required values
     */
    public NoMatchingProductDiscountFoundError buildUnchecked() {
        return new NoMatchingProductDiscountFoundErrorImpl(message, values);
    }

    public static NoMatchingProductDiscountFoundErrorBuilder of() {
        return new NoMatchingProductDiscountFoundErrorBuilder();
    }

    public static NoMatchingProductDiscountFoundErrorBuilder of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorBuilder builder = new NoMatchingProductDiscountFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
