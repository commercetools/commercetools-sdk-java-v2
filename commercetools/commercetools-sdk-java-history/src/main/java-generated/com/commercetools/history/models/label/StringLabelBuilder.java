
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StringLabelBuilder {

    private String value;

    public StringLabelBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public StringLabel build() {
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
