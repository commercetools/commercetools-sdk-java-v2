
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceFunctionImpl implements PriceFunction {

    private String currencyCode;

    private String function;

    @JsonCreator
    PriceFunctionImpl(@JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("function") final String function) {
        this.currencyCode = currencyCode;
        this.function = function;
    }

    public PriceFunctionImpl() {
    }

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getFunction() {
        return this.function;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setFunction(final String function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceFunctionImpl that = (PriceFunctionImpl) o;

        return new EqualsBuilder().append(currencyCode, that.currencyCode).append(function, that.function).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currencyCode).append(function).toHashCode();
    }

}
