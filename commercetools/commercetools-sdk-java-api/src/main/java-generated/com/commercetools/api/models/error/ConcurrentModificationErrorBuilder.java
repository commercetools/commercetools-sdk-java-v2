
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ConcurrentModificationErrorBuilder implements Builder<ConcurrentModificationError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private Long currentVersion;

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ConcurrentModificationErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public ConcurrentModificationErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public ConcurrentModificationErrorBuilder currentVersion(@Nullable final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public ConcurrentModificationError build() {
        Objects.requireNonNull(message, ConcurrentModificationError.class + ": message is missing");
        Objects.requireNonNull(values, ConcurrentModificationError.class + ": values are missing");
        return new ConcurrentModificationErrorImpl(message, values, currentVersion);
    }

    /**
     * builds ConcurrentModificationError without checking for non null required values
     */
    public ConcurrentModificationError buildUnchecked() {
        return new ConcurrentModificationErrorImpl(message, values, currentVersion);
    }

    public static ConcurrentModificationErrorBuilder of() {
        return new ConcurrentModificationErrorBuilder();
    }

    public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.currentVersion = template.getCurrentVersion();
        return builder;
    }

}
