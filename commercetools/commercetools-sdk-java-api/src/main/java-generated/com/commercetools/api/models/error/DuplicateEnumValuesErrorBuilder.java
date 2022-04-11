
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicateEnumValuesErrorBuilder implements Builder<DuplicateEnumValuesError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> duplicates;

    public DuplicateEnumValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateEnumValuesErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DuplicateEnumValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DuplicateEnumValuesErrorBuilder duplicates(final String... duplicates) {
        this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
        return this;
    }

    public DuplicateEnumValuesErrorBuilder duplicates(final java.util.List<String> duplicates) {
        this.duplicates = duplicates;
        return this;
    }

    public DuplicateEnumValuesErrorBuilder plusDuplicates(final String... duplicates) {
        if (this.duplicates == null) {
            this.duplicates = new ArrayList<>();
        }
        this.duplicates.addAll(Arrays.asList(duplicates));
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<String> getDuplicates() {
        return this.duplicates;
    }

    public DuplicateEnumValuesError build() {
        Objects.requireNonNull(message, DuplicateEnumValuesError.class + ": message is missing");
        Objects.requireNonNull(values, DuplicateEnumValuesError.class + ": values are missing");
        Objects.requireNonNull(duplicates, DuplicateEnumValuesError.class + ": duplicates is missing");
        return new DuplicateEnumValuesErrorImpl(message, values, duplicates);
    }

    /**
     * builds DuplicateEnumValuesError without checking for non null required values
     */
    public DuplicateEnumValuesError buildUnchecked() {
        return new DuplicateEnumValuesErrorImpl(message, values, duplicates);
    }

    public static DuplicateEnumValuesErrorBuilder of() {
        return new DuplicateEnumValuesErrorBuilder();
    }

    public static DuplicateEnumValuesErrorBuilder of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorBuilder builder = new DuplicateEnumValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.duplicates = template.getDuplicates();
        return builder;
    }

}
