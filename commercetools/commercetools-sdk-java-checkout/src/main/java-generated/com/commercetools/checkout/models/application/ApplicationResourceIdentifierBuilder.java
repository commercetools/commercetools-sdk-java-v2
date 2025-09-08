
package com.commercetools.checkout.models.application;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationResourceIdentifier applicationResourceIdentifier = ApplicationResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationResourceIdentifierBuilder implements Builder<ApplicationResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Application. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApplicationResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Application. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public ApplicationResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Application. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Application. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ApplicationResourceIdentifier with checking for non-null required values
     * @return ApplicationResourceIdentifier
     */
    public ApplicationResourceIdentifier build() {
        return new ApplicationResourceIdentifierImpl(id, key);
    }

    /**
     * builds ApplicationResourceIdentifier without checking for non-null required values
     * @return ApplicationResourceIdentifier
     */
    public ApplicationResourceIdentifier buildUnchecked() {
        return new ApplicationResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ApplicationResourceIdentifierBuilder
     * @return builder
     */
    public static ApplicationResourceIdentifierBuilder of() {
        return new ApplicationResourceIdentifierBuilder();
    }

    /**
     * create builder for ApplicationResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationResourceIdentifierBuilder of(final ApplicationResourceIdentifier template) {
        ApplicationResourceIdentifierBuilder builder = new ApplicationResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
