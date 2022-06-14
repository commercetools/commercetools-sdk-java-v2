
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * PriceFunction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceFunctionImpl implements PriceFunction, ModelBase {

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
     *  <p>Currency code compliant to ISO 4217.</p>
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *  <p>To calculate a Price based on the score, use <code>+</code>, <code>-</code>, <code>*</code> and parentheses. The score is inserted with <code>x</code>. The function returns the cent amount.</p>
     *  <p>For example, to charge $1.99 for a score of <code>1</code>, $3.99 for a score of <code>2</code>, $5.99 for a score of <code>3</code> and onwards, the function is: <code>(200 * x) - 1)</code>. To charge $4.50, $6.00, and $7.50 for express shipping, the function is: <code>(150 * x) + 300</code>.</p>
     */

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
