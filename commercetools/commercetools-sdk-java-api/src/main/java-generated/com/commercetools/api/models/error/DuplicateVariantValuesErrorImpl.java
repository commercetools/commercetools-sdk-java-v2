
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateVariantValuesErrorImpl implements DuplicateVariantValuesError {

    private String code;

    private String message;

    private com.commercetools.api.models.error.VariantValues variantValues;

    @JsonCreator
    DuplicateVariantValuesErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("variantValues") final com.commercetools.api.models.error.VariantValues variantValues) {
        this.message = message;
        this.variantValues = variantValues;
        this.code = DUPLICATE_VARIANT_VALUES;
    }

    public DuplicateVariantValuesErrorImpl() {
        this.code = DUPLICATE_VARIANT_VALUES;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.error.VariantValues getVariantValues() {
        return this.variantValues;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setVariantValues(final com.commercetools.api.models.error.VariantValues variantValues) {
        this.variantValues = variantValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateVariantValuesErrorImpl that = (DuplicateVariantValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(variantValues, that.variantValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(variantValues).toHashCode();
    }

}
