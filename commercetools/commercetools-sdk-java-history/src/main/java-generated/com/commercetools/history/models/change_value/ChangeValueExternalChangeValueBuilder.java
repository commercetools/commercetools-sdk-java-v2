
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueExternalChangeValueBuilder implements Builder<ChangeValueExternalChangeValue> {

    public ChangeValueExternalChangeValue build() {
        return new ChangeValueExternalChangeValueImpl();
    }

    /**
     * builds ChangeValueExternalChangeValue without checking for non null required values
     */
    public ChangeValueExternalChangeValue buildUnchecked() {
        return new ChangeValueExternalChangeValueImpl();
    }

    public static ChangeValueExternalChangeValueBuilder of() {
        return new ChangeValueExternalChangeValueBuilder();
    }

    public static ChangeValueExternalChangeValueBuilder of(final ChangeValueExternalChangeValue template) {
        ChangeValueExternalChangeValueBuilder builder = new ChangeValueExternalChangeValueBuilder();
        return builder;
    }

}
