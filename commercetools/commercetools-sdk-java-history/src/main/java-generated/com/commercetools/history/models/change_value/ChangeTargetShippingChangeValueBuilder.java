package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeTargetChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetShippingChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTargetShippingChangeValueBuilder implements Builder<ChangeTargetShippingChangeValue> {




    /**
     * builds ChangeTargetShippingChangeValue with checking for non-null required values
     * @return ChangeTargetShippingChangeValue
     */
    public ChangeTargetShippingChangeValue build() {
        return new ChangeTargetShippingChangeValueImpl();
    }
    
    /**
     * builds ChangeTargetShippingChangeValue without checking for non-null required values
     * @return ChangeTargetShippingChangeValue
     */
    public ChangeTargetShippingChangeValue buildUnchecked() {
        return new ChangeTargetShippingChangeValueImpl();
    }

    /**
     * factory method for an instance of ChangeTargetShippingChangeValueBuilder
     * @return builder 
     */
    public static ChangeTargetShippingChangeValueBuilder of() {
        return new ChangeTargetShippingChangeValueBuilder();
    }

    /**
     * create builder for ChangeTargetShippingChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetShippingChangeValueBuilder of(final ChangeTargetShippingChangeValue template) {
        ChangeTargetShippingChangeValueBuilder builder = new ChangeTargetShippingChangeValueBuilder();
        return builder;
    }

}
