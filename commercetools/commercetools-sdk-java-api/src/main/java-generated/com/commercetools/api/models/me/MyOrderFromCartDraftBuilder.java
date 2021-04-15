
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyOrderFromCartDraftBuilder {

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
