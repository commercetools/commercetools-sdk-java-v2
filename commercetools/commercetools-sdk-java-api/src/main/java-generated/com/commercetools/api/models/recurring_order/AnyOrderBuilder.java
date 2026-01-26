
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AnyOrderBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnyOrder anyOrder = AnyOrder.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AnyOrderBuilder implements Builder<AnyOrder> {

    /**
     * builds AnyOrder with checking for non-null required values
     * @return AnyOrder
     */
    public AnyOrder build() {
        return new AnyOrderImpl();
    }

    /**
     * builds AnyOrder without checking for non-null required values
     * @return AnyOrder
     */
    public AnyOrder buildUnchecked() {
        return new AnyOrderImpl();
    }

    /**
     * factory method for an instance of AnyOrderBuilder
     * @return builder
     */
    public static AnyOrderBuilder of() {
        return new AnyOrderBuilder();
    }

    /**
     * create builder for AnyOrder instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnyOrderBuilder of(final AnyOrder template) {
        AnyOrderBuilder builder = new AnyOrderBuilder();
        return builder;
    }

}
