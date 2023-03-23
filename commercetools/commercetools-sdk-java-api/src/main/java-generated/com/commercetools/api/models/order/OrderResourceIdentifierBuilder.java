
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderResourceIdentifier orderResourceIdentifier = OrderResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderResourceIdentifierBuilder implements Builder<OrderResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     * @param id
     * @return Builder
     */

    public OrderResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     * @param key
     * @return Builder
     */

    public OrderResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public OrderResourceIdentifier build() {
        return new OrderResourceIdentifierImpl(id, key);
    }

    /**
     * builds OrderResourceIdentifier without checking for non null required values
     */
    public OrderResourceIdentifier buildUnchecked() {
        return new OrderResourceIdentifierImpl(id, key);
    }

    public static OrderResourceIdentifierBuilder of() {
        return new OrderResourceIdentifierBuilder();
    }

    public static OrderResourceIdentifierBuilder of(final OrderResourceIdentifier template) {
        OrderResourceIdentifierBuilder builder = new OrderResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
