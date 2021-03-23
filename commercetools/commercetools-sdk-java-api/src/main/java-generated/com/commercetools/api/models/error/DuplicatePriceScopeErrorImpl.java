
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
public final class DuplicatePriceScopeErrorImpl implements DuplicatePriceScopeError {

    private String code;

    private String message;

    private java.util.List<com.commercetools.api.models.common.Price> conflictingPrices;

    @JsonCreator
    DuplicatePriceScopeErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("conflictingPrices") final java.util.List<com.commercetools.api.models.common.Price> conflictingPrices) {
        this.message = message;
        this.conflictingPrices = conflictingPrices;
        this.code = DUPLICATE_PRICE_SCOPE;
    }

    public DuplicatePriceScopeErrorImpl() {
        this.code = DUPLICATE_PRICE_SCOPE;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getConflictingPrices() {
        return this.conflictingPrices;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setConflictingPrices(final com.commercetools.api.models.common.Price... conflictingPrices) {
        this.conflictingPrices = new ArrayList<>(Arrays.asList(conflictingPrices));
    }

    public void setConflictingPrices(
            final java.util.List<com.commercetools.api.models.common.Price> conflictingPrices) {
        this.conflictingPrices = conflictingPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicatePriceScopeErrorImpl that = (DuplicatePriceScopeErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(conflictingPrices, that.conflictingPrices)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(conflictingPrices).toHashCode();
    }

}
