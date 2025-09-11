
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderKeyReference orderKeyReference = OrderKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderKeyReferenceBuilder implements Builder<OrderKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced resource. If the referenced resource does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced resource is created.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. If the referenced resource does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced resource is created.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds OrderKeyReference with checking for non-null required values
     * @return OrderKeyReference
     */
    public OrderKeyReference build() {
        Objects.requireNonNull(key, OrderKeyReference.class + ": key is missing");
        return new OrderKeyReferenceImpl(key);
    }

    /**
     * builds OrderKeyReference without checking for non-null required values
     * @return OrderKeyReference
     */
    public OrderKeyReference buildUnchecked() {
        return new OrderKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of OrderKeyReferenceBuilder
     * @return builder
     */
    public static OrderKeyReferenceBuilder of() {
        return new OrderKeyReferenceBuilder();
    }

    /**
     * create builder for OrderKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderKeyReferenceBuilder of(final OrderKeyReference template) {
        OrderKeyReferenceBuilder builder = new OrderKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
