
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyOrderFromQuoteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyOrderFromQuoteDraft myOrderFromQuoteDraft = MyOrderFromQuoteDraft.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyOrderFromQuoteDraftBuilder implements Builder<MyOrderFromQuoteDraft> {

    private String id;

    private Long version;

    @Nullable
    private Boolean quoteStateToAccepted;

    /**
     *  <p><code>id</code> of the Quote from which the Order is created.</p>
     * @param id value to be set
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current <code>version</code> of the Quote from which the Order is created.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted value to be set
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder quoteStateToAccepted(@Nullable final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
        return this;
    }

    /**
     *  <p><code>id</code> of the Quote from which the Order is created.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current <code>version</code> of the Quote from which the Order is created.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     * @return quoteStateToAccepted
     */

    @Nullable
    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    /**
     * builds MyOrderFromQuoteDraft with checking for non-null required values
     * @return MyOrderFromQuoteDraft
     */
    public MyOrderFromQuoteDraft build() {
        Objects.requireNonNull(id, MyOrderFromQuoteDraft.class + ": id is missing");
        Objects.requireNonNull(version, MyOrderFromQuoteDraft.class + ": version is missing");
        return new MyOrderFromQuoteDraftImpl(id, version, quoteStateToAccepted);
    }

    /**
     * builds MyOrderFromQuoteDraft without checking for non-null required values
     * @return MyOrderFromQuoteDraft
     */
    public MyOrderFromQuoteDraft buildUnchecked() {
        return new MyOrderFromQuoteDraftImpl(id, version, quoteStateToAccepted);
    }

    /**
     * factory method for an instance of MyOrderFromQuoteDraftBuilder
     * @return builder
     */
    public static MyOrderFromQuoteDraftBuilder of() {
        return new MyOrderFromQuoteDraftBuilder();
    }

    /**
     * create builder for MyOrderFromQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyOrderFromQuoteDraftBuilder of(final MyOrderFromQuoteDraft template) {
        MyOrderFromQuoteDraftBuilder builder = new MyOrderFromQuoteDraftBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.quoteStateToAccepted = template.getQuoteStateToAccepted();
        return builder;
    }

}
