
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StringFieldBuilder {

    private String value;

    public StringFieldBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public StringField build() {
        return new StringFieldImpl(value);
    }

    public static StringFieldBuilder of() {
        return new StringFieldBuilder();
    }

    public static StringFieldBuilder of(final StringField template) {
        StringFieldBuilder builder = new StringFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
