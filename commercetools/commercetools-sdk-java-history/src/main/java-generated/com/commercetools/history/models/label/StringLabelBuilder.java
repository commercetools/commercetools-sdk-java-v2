
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StringLabelBuilder implements Builder<StringLabel> {

    private String value;

    public StringLabelBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public StringLabel build() {
        Objects.requireNonNull(value, StringLabel.class + ": value is missing");
        return new StringLabelImpl(value);
    }

    /**
     * builds StringLabel without checking for non null required values
     */
    public StringLabel buildUnchecked() {
        return new StringLabelImpl(value);
    }

    public static StringLabelBuilder of() {
        return new StringLabelBuilder();
    }

    public static StringLabelBuilder of(final StringLabel template) {
        StringLabelBuilder builder = new StringLabelBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
