
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class BooleanSetFieldBuilder {

    private java.util.List<Boolean> value;

    public BooleanSetFieldBuilder value(final Boolean... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public BooleanSetFieldBuilder value(final java.util.List<Boolean> value) {
        this.value = value;
        return this;
    }

    public java.util.List<Boolean> getValue() {
        return this.value;
    }

    public BooleanSetField build() {
        return new BooleanSetFieldImpl(value);
    }

    public static BooleanSetFieldBuilder of() {
        return new BooleanSetFieldBuilder();
    }

    public static BooleanSetFieldBuilder of(final BooleanSetField template) {
        BooleanSetFieldBuilder builder = new BooleanSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
