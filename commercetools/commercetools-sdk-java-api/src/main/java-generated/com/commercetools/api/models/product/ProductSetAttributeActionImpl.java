
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetAttributeActionImpl implements ProductSetAttributeAction {

    private String action;

    private Long variantId;

    private String sku;

    private String name;

    private java.lang.Object value;

    private Boolean staged;

    @JsonCreator
    ProductSetAttributeActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.name = name;
        this.value = value;
        this.staged = staged;
        this.action = SET_ATTRIBUTE;
    }

    public ProductSetAttributeActionImpl() {
        this.action = SET_ATTRIBUTE;
    }

    public String getAction() {
        return this.action;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public String getSku() {
        return this.sku;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed.
    *  If the attribute exists and a value is provided, the new value is applied.
    *  If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
    */
    public java.lang.Object getValue() {
        return this.value;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetAttributeActionImpl that = (ProductSetAttributeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(variantId, that.variantId).append(sku,
            that.sku).append(name, that.name).append(value, that.value).append(staged, that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(variantId).append(sku).append(name).append(
            value).append(staged).toHashCode();
    }

}
