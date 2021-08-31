
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceFieldBuilder implements Builder<ReferenceField> {

    private com.commercetools.importapi.models.common.KeyReference value;

    public ReferenceFieldBuilder value(final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
        return this;
    }

    public com.commercetools.importapi.models.common.KeyReference getValue() {
        return this.value;
    }

    public ReferenceField build() {
        Objects.requireNonNull(value, ReferenceField.class + ": value is missing");
        return new ReferenceFieldImpl(value);
    }

    /**
     * builds ReferenceField without checking for non null required values
     */
    public ReferenceField buildUnchecked() {
        return new ReferenceFieldImpl(value);
    }

    public static ReferenceFieldBuilder of() {
        return new ReferenceFieldBuilder();
    }

    public static ReferenceFieldBuilder of(final ReferenceField template) {
        ReferenceFieldBuilder builder = new ReferenceFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
