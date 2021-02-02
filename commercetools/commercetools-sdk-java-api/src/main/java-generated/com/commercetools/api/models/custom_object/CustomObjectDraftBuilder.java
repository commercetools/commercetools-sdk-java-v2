
package com.commercetools.api.models.custom_object;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectDraftBuilder {

    private String container;

    private String key;

    private java.lang.Object value;

    @Nullable
    private Long version;

    public CustomObjectDraftBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public CustomObjectDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CustomObjectDraftBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public CustomObjectDraftBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public CustomObjectDraft build() {
        return new CustomObjectDraftImpl(container, key, value, version);
    }

    public static CustomObjectDraftBuilder of() {
        return new CustomObjectDraftBuilder();
    }

    public static CustomObjectDraftBuilder of(final CustomObjectDraft template) {
        CustomObjectDraftBuilder builder = new CustomObjectDraftBuilder();
        builder.container = template.getContainer();
        builder.key = template.getKey();
        builder.value = template.getValue();
        builder.version = template.getVersion();
        return builder;
    }

}
