
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
     */

    public OrderEditResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced OrderEdit. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public OrderEditResourceIdentifierBuilder key(@Nullable final String key) {
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

    public OrderEditResourceIdentifier build() {
        return new OrderEditResourceIdentifierImpl(id, key);
    }

    /**
     * builds OrderEditResourceIdentifier without checking for non null required values
     */
    public OrderEditResourceIdentifier buildUnchecked() {
        return new OrderEditResourceIdentifierImpl(id, key);
    }

    public static OrderEditResourceIdentifierBuilder of() {
        return new OrderEditResourceIdentifierBuilder();
    }

    public static OrderEditResourceIdentifierBuilder of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierBuilder builder = new OrderEditResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
