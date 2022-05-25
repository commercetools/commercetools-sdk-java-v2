
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceResourceIdentifier standalonePriceResourceIdentifier = StandalonePriceResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceResourceIdentifierBuilder implements Builder<StandalonePriceResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public StandalonePriceResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public StandalonePriceResourceIdentifierBuilder key(@Nullable final String key) {
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

    public StandalonePriceResourceIdentifier build() {
        return new StandalonePriceResourceIdentifierImpl(id, key);
    }

    /**
     * builds StandalonePriceResourceIdentifier without checking for non null required values
     */
    public StandalonePriceResourceIdentifier buildUnchecked() {
        return new StandalonePriceResourceIdentifierImpl(id, key);
    }

    public static StandalonePriceResourceIdentifierBuilder of() {
        return new StandalonePriceResourceIdentifierBuilder();
    }

    public static StandalonePriceResourceIdentifierBuilder of(final StandalonePriceResourceIdentifier template) {
        StandalonePriceResourceIdentifierBuilder builder = new StandalonePriceResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
