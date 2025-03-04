
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StackingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Stacking stacking = Stacking.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StackingBuilder implements Builder<Stacking> {

    /**
     * builds Stacking with checking for non-null required values
     * @return Stacking
     */
    public Stacking build() {
        return new StackingImpl();
    }

    /**
     * builds Stacking without checking for non-null required values
     * @return Stacking
     */
    public Stacking buildUnchecked() {
        return new StackingImpl();
    }

    /**
     * factory method for an instance of StackingBuilder
     * @return builder
     */
    public static StackingBuilder of() {
        return new StackingBuilder();
    }

    /**
     * create builder for Stacking instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StackingBuilder of(final Stacking template) {
        StackingBuilder builder = new StackingBuilder();
        return builder;
    }

}
