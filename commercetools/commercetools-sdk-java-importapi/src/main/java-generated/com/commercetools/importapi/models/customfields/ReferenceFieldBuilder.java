
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferenceFieldBuilder implements Builder<ReferenceField> {

    private com.commercetools.importapi.models.common.KeyReference value;

    public ReferenceFieldBuilder value(final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
        return this;
    }

    public ReferenceFieldBuilder value(
            Function<com.commercetools.importapi.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.importapi.models.common.KeyReference>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.KeyReferenceBuilder.of()).build();
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
