
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
public final class SetCategoryOrderHintChangeImpl implements SetCategoryOrderHintChange {

    private String type;

    private String change;

    private String catalogData;

    private String categoryId;

    private com.commercetools.history.models.common.CategoryOrderHints previousValue;

    private com.commercetools.history.models.common.CategoryOrderHints nextValue;

    @JsonCreator
    SetCategoryOrderHintChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("categoryId") final String categoryId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CategoryOrderHints previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CategoryOrderHints nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.categoryId = categoryId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_CATEGORY_ORDER_HINT_CHANGE;
    }

    public SetCategoryOrderHintChangeImpl() {
        this.type = SET_CATEGORY_ORDER_HINT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setCategoryOrderHint</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public com.commercetools.history.models.common.CategoryOrderHints getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.CategoryOrderHints getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.CategoryOrderHints previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.CategoryOrderHints nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCategoryOrderHintChangeImpl that = (SetCategoryOrderHintChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(categoryId, that.categoryId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(catalogData)
                .append(categoryId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
