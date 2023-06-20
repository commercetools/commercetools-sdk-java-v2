
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

/**
 *  <p>Change triggered by the Move image to position update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoveImageToPositionChangeImpl implements MoveImageToPositionChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    private String catalogData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MoveImageToPositionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Image> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Image> nextValue,
            @JsonProperty("catalogData") final String catalogData) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.catalogData = catalogData;
        this.type = MOVE_IMAGE_TO_POSITION_CHANGE;
    }

    /**
     * create empty instance
     */
    public MoveImageToPositionChangeImpl() {
        this.type = MOVE_IMAGE_TO_POSITION_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Image> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Image> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MoveImageToPositionChangeImpl that = (MoveImageToPositionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(catalogData)
                .toHashCode();
    }

}
