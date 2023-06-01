package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.commercetools.history.models.change_value.ChangeValueExternalChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of ChangeValueExternalChangeValueBuilder
     * @return builder 
     */
    public static ChangeValueExternalChangeValueBuilder of() {
        return new ChangeValueExternalChangeValueBuilder();
    }

    /**
     * create builder for ChangeValueExternalChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueExternalChangeValueBuilder of(final ChangeValueExternalChangeValue template) {
        ChangeValueExternalChangeValueBuilder builder = new ChangeValueExternalChangeValueBuilder();
        return builder;
    }

}
