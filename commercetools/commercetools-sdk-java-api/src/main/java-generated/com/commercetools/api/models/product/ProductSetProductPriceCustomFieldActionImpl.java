
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
public final class ProductSetProductPriceCustomFieldActionImpl implements ProductSetProductPriceCustomFieldAction {

    private String action;

    private String priceId;

    private Boolean staged;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    ProductSetProductPriceCustomFieldActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.priceId = priceId;
        this.staged = staged;
        this.name = name;
        this.value = value;
        this.action = SET_PRODUCT_PRICE_CUSTOM_FIELD;
    }

    public ProductSetProductPriceCustomFieldActionImpl() {
        this.action = SET_PRODUCT_PRICE_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetProductPriceCustomFieldActionImpl that = (ProductSetProductPriceCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(priceId, that.priceId).append(staged,
            that.staged).append(name, that.name).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceId).append(staged).append(name).append(
            value).toHashCode();
    }

}
