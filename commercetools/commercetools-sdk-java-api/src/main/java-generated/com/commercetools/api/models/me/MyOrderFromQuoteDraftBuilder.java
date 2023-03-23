
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
     *  <p>Unique identifier of the Quote from which the Order is created.</p>
     * @param id
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
     * @param version
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted
     * @return Builder
     */

    public MyOrderFromQuoteDraftBuilder quoteStateToAccepted(@Nullable final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    public MyOrderFromQuoteDraft build() {
        Objects.requireNonNull(id, MyOrderFromQuoteDraft.class + ": id is missing");
        Objects.requireNonNull(version, MyOrderFromQuoteDraft.class + ": version is missing");
        return new MyOrderFromQuoteDraftImpl(id, version, quoteStateToAccepted);
    }

    /**
     * builds MyOrderFromQuoteDraft without checking for non null required values
     */
    public MyOrderFromQuoteDraft buildUnchecked() {
        return new MyOrderFromQuoteDraftImpl(id, version, quoteStateToAccepted);
    }

    public static MyOrderFromQuoteDraftBuilder of() {
        return new MyOrderFromQuoteDraftBuilder();
    }

    public static MyOrderFromQuoteDraftBuilder of(final MyOrderFromQuoteDraft template) {
        MyOrderFromQuoteDraftBuilder builder = new MyOrderFromQuoteDraftBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.quoteStateToAccepted = template.getQuoteStateToAccepted();
        return builder;
    }

}
