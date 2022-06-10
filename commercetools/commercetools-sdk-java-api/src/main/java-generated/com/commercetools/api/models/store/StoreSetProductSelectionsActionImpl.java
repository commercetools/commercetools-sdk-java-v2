
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

/**
 *  <p>Instead of adding or removing Product Selections individually, you can also change all the Store's Product Selections in one go using this update action. The Store will only contain the Product Selections specified in the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
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
