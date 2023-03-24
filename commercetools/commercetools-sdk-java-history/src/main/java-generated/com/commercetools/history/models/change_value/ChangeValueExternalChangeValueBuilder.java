
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueExternalChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueExternalChangeValue changeValueExternalChangeValue = ChangeValueExternalChangeValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueExternalChangeValueBuilder implements Builder<ChangeValueExternalChangeValue> {

    /**
     * builds ChangeValueExternalChangeValue with checking for non-null required values
     * @return ChangeValueExternalChangeValue
     */
    public ChangeValueExternalChangeValue build() {
        return new ChangeValueExternalChangeValueImpl();
    }

    /**
     * builds ChangeValueExternalChangeValue without checking for non-null required values
     * @return ChangeValueExternalChangeValue
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
