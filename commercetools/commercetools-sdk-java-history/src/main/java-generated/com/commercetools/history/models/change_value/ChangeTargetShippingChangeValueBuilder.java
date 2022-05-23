
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetShippingChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetShippingChangeValue changeTargetShippingChangeValue = ChangeTargetShippingChangeValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetShippingChangeValueBuilder implements Builder<ChangeTargetShippingChangeValue> {

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
