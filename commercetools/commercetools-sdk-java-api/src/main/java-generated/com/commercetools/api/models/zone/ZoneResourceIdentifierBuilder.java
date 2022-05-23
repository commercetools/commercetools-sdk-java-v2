
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
     <*  <p>Platform-generated unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public ZoneResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public ZoneResourceIdentifierBuilder key(@Nullable final String key) {
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

    public ZoneResourceIdentifier build() {
        return new ZoneResourceIdentifierImpl(id, key);
    }

    /**
     * builds ZoneResourceIdentifier without checking for non null required values
     */
    public ZoneResourceIdentifier buildUnchecked() {
        return new ZoneResourceIdentifierImpl(id, key);
    }

    public static ZoneResourceIdentifierBuilder of() {
        return new ZoneResourceIdentifierBuilder();
    }

    public static ZoneResourceIdentifierBuilder of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierBuilder builder = new ZoneResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
