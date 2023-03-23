
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyOrderFromCartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyOrderFromCartDraft myOrderFromCartDraft = MyOrderFromCartDraft.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyOrderFromCartDraftBuilder implements Builder<MyOrderFromCartDraft> {

    private String id;

    private Long version;

    /**
     *  <p>Unique identifier of the Cart that initiates an Order creation.</p>
     * @param id
     * @return Builder
     */

    public MyOrderFromCartDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param version
     * @return Builder
     */

    public MyOrderFromCartDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public MyOrderFromCartDraft build() {
        Objects.requireNonNull(id, MyOrderFromCartDraft.class + ": id is missing");
        Objects.requireNonNull(version, MyOrderFromCartDraft.class + ": version is missing");
        return new MyOrderFromCartDraftImpl(id, version);
    }

    /**
     * builds MyOrderFromCartDraft without checking for non null required values
     */
    public MyOrderFromCartDraft buildUnchecked() {
        return new MyOrderFromCartDraftImpl(id, version);
    }

    public static MyOrderFromCartDraftBuilder of() {
        return new MyOrderFromCartDraftBuilder();
    }

    public static MyOrderFromCartDraftBuilder of(final MyOrderFromCartDraft template) {
        MyOrderFromCartDraftBuilder builder = new MyOrderFromCartDraftBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        return builder;
    }

}
