
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTargetShippingChangeValueBuilder implements Builder<ChangeTargetShippingChangeValue> {

    public ChangeTargetShippingChangeValue build() {
        return new ChangeTargetShippingChangeValueImpl();
    }

    /**
     * builds ChangeTargetShippingChangeValue without checking for non null required values
     */
    public ChangeTargetShippingChangeValue buildUnchecked() {
        return new ChangeTargetShippingChangeValueImpl();
    }

    public static ChangeTargetShippingChangeValueBuilder of() {
        return new ChangeTargetShippingChangeValueBuilder();
    }

    public static ChangeTargetShippingChangeValueBuilder of(final ChangeTargetShippingChangeValue template) {
        ChangeTargetShippingChangeValueBuilder builder = new ChangeTargetShippingChangeValueBuilder();
        return builder;
    }

}
