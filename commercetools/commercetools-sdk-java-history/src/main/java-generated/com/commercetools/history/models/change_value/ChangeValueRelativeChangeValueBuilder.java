
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
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, 1000 results in a 10% price reduction.</p>
     * @param permyriad value to be set
     * @return Builder
     */

    public ChangeValueRelativeChangeValueBuilder permyriad(final Integer permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, 1000 results in a 10% price reduction.</p>
     * @return permyriad
     */

    public Integer getPermyriad() {
        return this.permyriad;
    }

    /**
     * builds ChangeValueRelativeChangeValue with checking for non-null required values
     * @return ChangeValueRelativeChangeValue
     */
    public ChangeValueRelativeChangeValue build() {
        Objects.requireNonNull(permyriad, ChangeValueRelativeChangeValue.class + ": permyriad is missing");
        return new ChangeValueRelativeChangeValueImpl(permyriad);
    }

    /**
     * builds ChangeValueRelativeChangeValue without checking for non-null required values
     * @return ChangeValueRelativeChangeValue
     */
    public ChangeValueRelativeChangeValue buildUnchecked() {
        return new ChangeValueRelativeChangeValueImpl(permyriad);
    }

    /**
     * factory method for an instance of ChangeValueRelativeChangeValueBuilder
     * @return builder
     */
    public static ChangeValueRelativeChangeValueBuilder of() {
        return new ChangeValueRelativeChangeValueBuilder();
    }

    /**
     * create builder for ChangeValueRelativeChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueRelativeChangeValueBuilder of(final ChangeValueRelativeChangeValue template) {
        ChangeValueRelativeChangeValueBuilder builder = new ChangeValueRelativeChangeValueBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
