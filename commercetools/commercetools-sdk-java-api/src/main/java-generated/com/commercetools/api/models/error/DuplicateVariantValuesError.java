
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DuplicateVariantValuesErrorImpl.class)
public interface DuplicateVariantValuesError extends ErrorObject {

    String DUPLICATE_VARIANT_VALUES = "DuplicateVariantValues";

    @NotNull
    @Valid
    @JsonProperty("variantValues")
    public VariantValues getVariantValues();

    public void setVariantValues(final VariantValues variantValues);

    public static DuplicateVariantValuesError of() {
        return new DuplicateVariantValuesErrorImpl();
    }

    public static DuplicateVariantValuesError of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorImpl instance = new DuplicateVariantValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setVariantValues(template.getVariantValues());
        return instance;
    }

    public static DuplicateVariantValuesErrorBuilder builder() {
        return DuplicateVariantValuesErrorBuilder.of();
    }

    public static DuplicateVariantValuesErrorBuilder builder(final DuplicateVariantValuesError template) {
        return DuplicateVariantValuesErrorBuilder.of(template);
    }

    default <T> T withDuplicateVariantValuesError(Function<DuplicateVariantValuesError, T> helper) {
        return helper.apply(this);
    }
}
