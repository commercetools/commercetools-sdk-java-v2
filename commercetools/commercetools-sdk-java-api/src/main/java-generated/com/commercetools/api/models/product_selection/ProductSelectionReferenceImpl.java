
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionReferenceImpl implements ProductSelectionReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private com.commercetools.api.models.product_selection.ProductSelection obj;

    @JsonCreator
    ProductSelectionReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("obj") final com.commercetools.api.models.product_selection.ProductSelection obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("product-selection");
    }

    public ProductSelectionReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("product-selection");
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
    *  <p>Unique ID of the Product Selection.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Contains the representation of the expanded Product Selection. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for Product Selection.</p>
    */
    public com.commercetools.api.models.product_selection.ProductSelection getObj() {
        return this.obj;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setObj(final com.commercetools.api.models.product_selection.ProductSelection obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionReferenceImpl that = (ProductSelectionReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(obj, that.obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(obj).toHashCode();
    }

}