
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ConcurrentModificationErrorBuilder implements Builder<ConcurrentModificationError> {

    private String message;

    @Nullable
    private Long currentVersion;

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ConcurrentModificationErrorBuilder currentVersion(@Nullable final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public ConcurrentModificationError build() {
        Objects.requireNonNull(message, ConcurrentModificationError.class + ": message is missing");
        return new ConcurrentModificationErrorImpl(message, currentVersion);
    }

    /**
     * builds ConcurrentModificationError without checking for non null required values
     */
    public ConcurrentModificationError buildUnchecked() {
        return new ConcurrentModificationErrorImpl(message, currentVersion);
    }

    public static ConcurrentModificationErrorBuilder of() {
        return new ConcurrentModificationErrorBuilder();
    }

    public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
        builder.message = template.getMessage();
        builder.currentVersion = template.getCurrentVersion();
        return builder;
    }

}
