
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ParcelMeasurements
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementsImpl implements ParcelMeasurements, ModelBase {

    private Integer heightInMillimeter;

    private Integer lengthInMillimeter;

    private Integer widthInMillimeter;

    private Integer weightInGram;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelMeasurementsImpl(@JsonProperty("heightInMillimeter") final Integer heightInMillimeter,
            @JsonProperty("lengthInMillimeter") final Integer lengthInMillimeter,
            @JsonProperty("widthInMillimeter") final Integer widthInMillimeter,
            @JsonProperty("weightInGram") final Integer weightInGram) {
        this.heightInMillimeter = heightInMillimeter;
        this.lengthInMillimeter = lengthInMillimeter;
        this.widthInMillimeter = widthInMillimeter;
        this.weightInGram = weightInGram;
    }

    /**
     * create empty instance
     */
    public ParcelMeasurementsImpl() {
    }

    /**
     *  <p>Height of the Parcel.</p>
     */

    public Integer getHeightInMillimeter() {
        return this.heightInMillimeter;
    }

    /**
     *  <p>Length of the Parcel.</p>
     */

    public Integer getLengthInMillimeter() {
        return this.lengthInMillimeter;
    }

    /**
     *  <p>Width of the Parcel.</p>
     */

    public Integer getWidthInMillimeter() {
        return this.widthInMillimeter;
    }

    /**
     *  <p>Weight of the Parcel.</p>
     */

    public Integer getWeightInGram() {
        return this.weightInGram;
    }

    public void setHeightInMillimeter(final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
    }

    public void setLengthInMillimeter(final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
    }

    public void setWidthInMillimeter(final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
    }

    public void setWeightInGram(final Integer weightInGram) {
        this.weightInGram = weightInGram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelMeasurementsImpl that = (ParcelMeasurementsImpl) o;

        return new EqualsBuilder().append(heightInMillimeter, that.heightInMillimeter)
                .append(lengthInMillimeter, that.lengthInMillimeter)
                .append(widthInMillimeter, that.widthInMillimeter)
                .append(weightInGram, that.weightInGram)
                .append(heightInMillimeter, that.heightInMillimeter)
                .append(lengthInMillimeter, that.lengthInMillimeter)
                .append(widthInMillimeter, that.widthInMillimeter)
                .append(weightInGram, that.weightInGram)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(heightInMillimeter)
                .append(lengthInMillimeter)
                .append(widthInMillimeter)
                .append(weightInGram)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("heightInMillimeter", heightInMillimeter)
                .append("lengthInMillimeter", lengthInMillimeter)
                .append("widthInMillimeter", widthInMillimeter)
                .append("weightInGram", weightInGram)
                .build();
    }

    @Override
    public ParcelMeasurements copyDeep() {
        return ParcelMeasurements.deepCopy(this);
    }
}
