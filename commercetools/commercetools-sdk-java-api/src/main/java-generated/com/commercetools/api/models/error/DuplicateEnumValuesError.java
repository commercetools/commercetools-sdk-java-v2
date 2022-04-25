
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateEnumValuesErrorImpl.class)
public interface DuplicateEnumValuesError extends ErrorObject {

    String DUPLICATE_ENUM_VALUES = "DuplicateEnumValues";

    @NotNull
    @JsonProperty("duplicates")
    public List<String> getDuplicates();

    @JsonIgnore
    public void setDuplicates(final String... duplicates);

    public void setDuplicates(final List<String> duplicates);

    public static DuplicateEnumValuesError of() {
        return new DuplicateEnumValuesErrorImpl();
    }

    public static DuplicateEnumValuesError of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorImpl instance = new DuplicateEnumValuesErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setDuplicates(template.getDuplicates());
        return instance;
    }

    public static DuplicateEnumValuesErrorBuilder builder() {
        return DuplicateEnumValuesErrorBuilder.of();
    }

    public static DuplicateEnumValuesErrorBuilder builder(final DuplicateEnumValuesError template) {
        return DuplicateEnumValuesErrorBuilder.of(template);
    }

    default <T> T withDuplicateEnumValuesError(Function<DuplicateEnumValuesError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateEnumValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateEnumValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateEnumValuesError>";
            }
        };
    }
}
