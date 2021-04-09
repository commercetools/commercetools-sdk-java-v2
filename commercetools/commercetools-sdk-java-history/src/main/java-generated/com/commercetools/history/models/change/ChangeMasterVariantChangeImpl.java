
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeMasterVariantChangeImpl implements ChangeMasterVariantChange {

    private String type;

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    @JsonCreator
    ChangeMasterVariantChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("catalogData") final String catalogData,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Variant previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Variant nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_MASTER_VARIANT_CHANGE;
    }

    public ChangeMasterVariantChangeImpl() {
        this.type = CHANGE_MASTER_VARIANT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeMasterVariant</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.common.Variant getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Variant getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Variant nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeMasterVariantChangeImpl that = (ChangeMasterVariantChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(catalogData)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
