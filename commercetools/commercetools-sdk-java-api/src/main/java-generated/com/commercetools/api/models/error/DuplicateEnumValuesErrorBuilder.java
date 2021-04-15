
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateEnumValuesErrorBuilder {

    private String message;

    private java.util.List<String> duplicates;

    public DuplicateEnumValuesErrorBuilder message(final String message) {
        this.message = message;
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

    public String getMessage() {
        return this.message;
    }

    public java.util.List<String> getDuplicates() {
        return this.duplicates;
    }

    public DuplicateEnumValuesError build() {
        return new DuplicateEnumValuesErrorImpl(message, duplicates);
    }

    public static DuplicateEnumValuesErrorBuilder of() {
        return new DuplicateEnumValuesErrorBuilder();
    }

    public static DuplicateEnumValuesErrorBuilder of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorBuilder builder = new DuplicateEnumValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.duplicates = template.getDuplicates();
        return builder;
    }

}
