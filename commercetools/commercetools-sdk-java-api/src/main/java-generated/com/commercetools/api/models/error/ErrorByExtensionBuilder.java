
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ErrorByExtensionBuilder {

    private String id;

    @Nullable
    private String key;

    public ErrorByExtensionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ErrorByExtensionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ErrorByExtension build() {
        return new ErrorByExtensionImpl(id, key);
    }

    public static ErrorByExtensionBuilder of() {
        return new ErrorByExtensionBuilder();
    }

    public static ErrorByExtensionBuilder of(final ErrorByExtension template) {
        ErrorByExtensionBuilder builder = new ErrorByExtensionBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
