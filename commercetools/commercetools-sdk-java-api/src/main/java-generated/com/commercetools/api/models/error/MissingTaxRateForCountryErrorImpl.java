
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
public class MissingTaxRateForCountryErrorImpl implements MissingTaxRateForCountryError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String taxCategoryId;

    private String country;

    private String state;

    @JsonCreator
    MissingTaxRateForCountryErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("taxCategoryId") final String taxCategoryId, @JsonProperty("country") final String country,
            @JsonProperty("state") final String state) {
        this.message = message;
        this.values = values;
        this.taxCategoryId = taxCategoryId;
        this.country = country;
        this.state = state;
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
    }

    public MissingTaxRateForCountryErrorImpl() {
        this.code = MISSING_TAX_RATE_FOR_COUNTRY;
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

    public String getTaxCategoryId() {
        return this.taxCategoryId;
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
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

    public void setTaxCategoryId(final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingTaxRateForCountryErrorImpl that = (MissingTaxRateForCountryErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(taxCategoryId, that.taxCategoryId)
                .append(country, that.country)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(taxCategoryId)
                .append(country)
                .append(state)
                .toHashCode();
    }

}
