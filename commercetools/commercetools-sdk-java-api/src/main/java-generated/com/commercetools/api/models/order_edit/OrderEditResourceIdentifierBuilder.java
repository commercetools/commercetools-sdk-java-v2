
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditResourceIdentifier orderEditResourceIdentifier = OrderEditResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditResourceIdentifierBuilder implements Builder<OrderEditResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderEditResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderEditResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds OrderEditResourceIdentifier with checking for non-null required values
     * @return OrderEditResourceIdentifier
     */
    public OrderEditResourceIdentifier build() {
        return new OrderEditResourceIdentifierImpl(id, key);
    }

    /**
     * builds OrderEditResourceIdentifier without checking for non-null required values
     * @return OrderEditResourceIdentifier
     */
    public OrderEditResourceIdentifier buildUnchecked() {
        return new OrderEditResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of OrderEditResourceIdentifierBuilder
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder of() {
        return new OrderEditResourceIdentifierBuilder();
    }

    /**
     * create builder for OrderEditResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierBuilder builder = new OrderEditResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
