
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueRelativeChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueRelativeChangeValue changeValueRelativeChangeValue = ChangeValueRelativeChangeValue.builder()
 *             .permyriad(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueRelativeChangeValueBuilder implements Builder<ChangeValueRelativeChangeValue> {

    private Integer permyriad;

    /**
     *
     */

    public ChangeValueRelativeChangeValueBuilder permyriad(final Integer permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Integer getPermyriad() {
        return this.permyriad;
    }

    public ChangeValueRelativeChangeValue build() {
        Objects.requireNonNull(permyriad, ChangeValueRelativeChangeValue.class + ": permyriad is missing");
        return new ChangeValueRelativeChangeValueImpl(permyriad);
    }

    /**
     * builds ChangeValueRelativeChangeValue without checking for non null required values
     */
    public ChangeValueRelativeChangeValue buildUnchecked() {
        return new ChangeValueRelativeChangeValueImpl(permyriad);
    }

    public static ChangeValueRelativeChangeValueBuilder of() {
        return new ChangeValueRelativeChangeValueBuilder();
    }

    public static ChangeValueRelativeChangeValueBuilder of(final ChangeValueRelativeChangeValue template) {
        ChangeValueRelativeChangeValueBuilder builder = new ChangeValueRelativeChangeValueBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
