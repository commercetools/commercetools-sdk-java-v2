
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionResourceIdentifier extensionResourceIdentifier = ExtensionResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionResourceIdentifierBuilder implements Builder<ExtensionResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public ExtensionResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public ExtensionResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ExtensionResourceIdentifier with checking for non-null required values
     * @return ExtensionResourceIdentifier
     */
    public ExtensionResourceIdentifier build() {
        return new ExtensionResourceIdentifierImpl(id, key);
    }

    /**
     * builds ExtensionResourceIdentifier without checking for non-null required values
     * @return ExtensionResourceIdentifier
     */
    public ExtensionResourceIdentifier buildUnchecked() {
        return new ExtensionResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ExtensionResourceIdentifierBuilder
     * @return builder
     */
    public static ExtensionResourceIdentifierBuilder of() {
        return new ExtensionResourceIdentifierBuilder();
    }

    /**
     * create builder for ExtensionResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionResourceIdentifierBuilder of(final ExtensionResourceIdentifier template) {
        ExtensionResourceIdentifierBuilder builder = new ExtensionResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
