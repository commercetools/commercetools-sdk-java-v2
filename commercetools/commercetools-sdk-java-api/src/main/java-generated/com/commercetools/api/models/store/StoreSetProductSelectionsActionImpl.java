
package com.commercetools.api.models.store;

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
public class StoreSetProductSelectionsActionImpl implements StoreSetProductSelectionsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections;

    @JsonCreator
    StoreSetProductSelectionsActionImpl(
            @JsonProperty("productSelections") final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
        this.action = SET_PRODUCT_SELECTIONS;
    }

    public StoreSetProductSelectionsActionImpl() {
        this.action = SET_PRODUCT_SELECTIONS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The total of Product Selections to be set for this Store.</p>
    */
    public java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> getProductSelections() {
        return this.productSelections;
    }

    public void setProductSelections(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft... productSelections) {
        this.productSelections = new ArrayList<>(Arrays.asList(productSelections));
    }

    public void setProductSelections(
            final java.util.List<com.commercetools.api.models.store.ProductSelectionSettingDraft> productSelections) {
        this.productSelections = productSelections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetProductSelectionsActionImpl that = (StoreSetProductSelectionsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productSelections, that.productSelections)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productSelections).toHashCode();
    }

}
