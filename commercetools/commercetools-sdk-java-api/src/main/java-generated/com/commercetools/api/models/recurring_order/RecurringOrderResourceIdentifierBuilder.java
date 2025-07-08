
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderResourceIdentifier recurringOrderResourceIdentifier = RecurringOrderResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderResourceIdentifierBuilder implements Builder<RecurringOrderResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced RecurringOrder. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced RecurringOrder. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringOrderResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced RecurringOrder. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced RecurringOrder. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds RecurringOrderResourceIdentifier with checking for non-null required values
     * @return RecurringOrderResourceIdentifier
     */
    public RecurringOrderResourceIdentifier build() {
        return new RecurringOrderResourceIdentifierImpl(id, key);
    }

    /**
     * builds RecurringOrderResourceIdentifier without checking for non-null required values
     * @return RecurringOrderResourceIdentifier
     */
    public RecurringOrderResourceIdentifier buildUnchecked() {
        return new RecurringOrderResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of RecurringOrderResourceIdentifierBuilder
     * @return builder
     */
    public static RecurringOrderResourceIdentifierBuilder of() {
        return new RecurringOrderResourceIdentifierBuilder();
    }

    /**
     * create builder for RecurringOrderResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderResourceIdentifierBuilder of(final RecurringOrderResourceIdentifier template) {
        RecurringOrderResourceIdentifierBuilder builder = new RecurringOrderResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
