
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneResourceIdentifier zoneResourceIdentifier = ZoneResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneResourceIdentifierBuilder implements Builder<ZoneResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public ZoneResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public ZoneResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ZoneResourceIdentifier with checking for non-null required values
     * @return ZoneResourceIdentifier
     */
    public ZoneResourceIdentifier build() {
        return new ZoneResourceIdentifierImpl(id, key);
    }

    /**
     * builds ZoneResourceIdentifier without checking for non-null required values
     * @return ZoneResourceIdentifier
     */
    public ZoneResourceIdentifier buildUnchecked() {
        return new ZoneResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ZoneResourceIdentifierBuilder
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder of() {
        return new ZoneResourceIdentifierBuilder();
    }

    /**
     * create builder for ZoneResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierBuilder builder = new ZoneResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
