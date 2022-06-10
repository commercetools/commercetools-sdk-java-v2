
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

/**
 *  <p>This update action changes the order of the <code>assets</code> array. The new order is defined by listing the <code>id</code>s of the Assets.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     */

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
