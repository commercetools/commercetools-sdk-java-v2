
package com.commercetools.api.models.category;

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
public class CategoryChangeAssetOrderActionImpl implements CategoryChangeAssetOrderAction, ModelBase {

    private String action;

    private java.util.List<String> assetOrder;

    @JsonCreator
    CategoryChangeAssetOrderActionImpl(@JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        this.action = CHANGE_ASSET_ORDER;
    }

    public CategoryChangeAssetOrderActionImpl() {
        this.action = CHANGE_ASSET_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public void setAssetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
    }

    public void setAssetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryChangeAssetOrderActionImpl that = (CategoryChangeAssetOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(assetOrder, that.assetOrder).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetOrder).toHashCode();
    }

}
