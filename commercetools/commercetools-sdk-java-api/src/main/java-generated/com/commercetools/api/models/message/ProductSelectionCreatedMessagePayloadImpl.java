
package com.commercetools.api.models.message;

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
public class ProductSelectionCreatedMessagePayloadImpl implements ProductSelectionCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product_selection.ProductSelectionType productSelection;

    @JsonCreator
    ProductSelectionCreatedMessagePayloadImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionType productSelection) {
        this.productSelection = productSelection;
        this.type = PRODUCT_SELECTION_CREATED;
    }

    public ProductSelectionCreatedMessagePayloadImpl() {
        this.type = PRODUCT_SELECTION_CREATED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionType getProductSelection() {
        return this.productSelection;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionType productSelection) {
        this.productSelection = productSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionCreatedMessagePayloadImpl that = (ProductSelectionCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(productSelection, that.productSelection).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(productSelection).toHashCode();
    }

}
