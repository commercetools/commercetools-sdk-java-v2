
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizedStringFieldBuilder {

    private com.commercetools.importapi.models.common.LocalizedString value;

    public LocalizedStringFieldBuilder value(final com.commercetools.importapi.models.common.LocalizedString value) {
        this.value = value;
        return this;
    }

    public com.commercetools.importapi.models.common.LocalizedString getValue() {
        return this.value;
    }

    public LocalizedStringField build() {
        return new LocalizedStringFieldImpl(value);
    }

    public static LocalizedStringFieldBuilder of() {
        return new LocalizedStringFieldBuilder();
    }

    public static LocalizedStringFieldBuilder of(final LocalizedStringField template) {
        LocalizedStringFieldBuilder builder = new LocalizedStringFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
