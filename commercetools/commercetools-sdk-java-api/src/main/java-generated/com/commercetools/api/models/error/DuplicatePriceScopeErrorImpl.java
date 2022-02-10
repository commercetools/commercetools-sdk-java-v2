
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicatePriceScopeErrorImpl implements DuplicatePriceScopeError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<com.commercetools.api.models.common.Price> conflictingPrices;

    @JsonCreator
    DuplicatePriceScopeErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingPrices") final java.util.List<com.commercetools.api.models.common.Price> conflictingPrices) {
        this.message = message;
        this.values = values;
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

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getConflictingPrices() {
        return this.conflictingPrices;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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
                .append(values, that.values)
                .append(conflictingPrices, that.conflictingPrices)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(conflictingPrices)
                .toHashCode();
    }

}
