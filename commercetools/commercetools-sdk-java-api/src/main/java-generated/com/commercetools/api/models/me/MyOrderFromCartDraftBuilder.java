
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyOrderFromCartDraftBuilder implements Builder<MyOrderFromCartDraft> {

    private String id;

    private Long version;

    public MyOrderFromCartDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

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
