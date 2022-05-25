
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreResourceIdentifier storeResourceIdentifier = StoreResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreResourceIdentifierBuilder implements Builder<StoreResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public StoreResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public StoreResourceIdentifierBuilder key(@Nullable final String key) {
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

    public StoreResourceIdentifier build() {
        return new StoreResourceIdentifierImpl(id, key);
    }

    /**
     * builds StoreResourceIdentifier without checking for non null required values
     */
    public StoreResourceIdentifier buildUnchecked() {
        return new StoreResourceIdentifierImpl(id, key);
    }

    public static StoreResourceIdentifierBuilder of() {
        return new StoreResourceIdentifierBuilder();
    }

    public static StoreResourceIdentifierBuilder of(final StoreResourceIdentifier template) {
        StoreResourceIdentifierBuilder builder = new StoreResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
