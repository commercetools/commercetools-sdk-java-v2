
package com.commercetools.history.models.change;

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
public class SetVariantAvailabilityChangeImpl implements SetVariantAvailabilityChange, ModelBase {

    private String type;

    private String change;

    private String catalogData;

    private String variant;

    private com.commercetools.history.models.common.ProductVariantAvailability previousValue;

    private com.commercetools.history.models.common.ProductVariantAvailability nextValue;

    @JsonCreator
    SetVariantAvailabilityChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("variant") final String variant,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ProductVariantAvailability previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ProductVariantAvailability nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.variant = variant;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_VARIANT_AVAILABILITY_CHANGE;
    }

    public SetVariantAvailabilityChangeImpl() {
        this.type = SET_VARIANT_AVAILABILITY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setVariantAvailability</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.ProductVariantAvailability getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.ProductVariantAvailability getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.common.ProductVariantAvailability previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ProductVariantAvailability nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetVariantAvailabilityChangeImpl that = (SetVariantAvailabilityChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(catalogData)
                .append(variant)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
