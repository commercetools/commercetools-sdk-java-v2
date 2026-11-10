
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyResourceIdentifier recurrencePolicyResourceIdentifier = RecurrencePolicyResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyResourceIdentifierBuilder implements Builder<RecurrencePolicyResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurrencePolicyResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurrencePolicyResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds RecurrencePolicyResourceIdentifier with checking for non-null required values
     * @return RecurrencePolicyResourceIdentifier
     */
    public RecurrencePolicyResourceIdentifier build() {
        return new RecurrencePolicyResourceIdentifierImpl(id, key);
    }

    /**
     * builds RecurrencePolicyResourceIdentifier without checking for non-null required values
     * @return RecurrencePolicyResourceIdentifier
     */
    public RecurrencePolicyResourceIdentifier buildUnchecked() {
        return new RecurrencePolicyResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of RecurrencePolicyResourceIdentifierBuilder
     * @return builder
     */
    public static RecurrencePolicyResourceIdentifierBuilder of() {
        return new RecurrencePolicyResourceIdentifierBuilder();
    }

    /**
     * create builder for RecurrencePolicyResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyResourceIdentifierBuilder of(final RecurrencePolicyResourceIdentifier template) {
        RecurrencePolicyResourceIdentifierBuilder builder = new RecurrencePolicyResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
