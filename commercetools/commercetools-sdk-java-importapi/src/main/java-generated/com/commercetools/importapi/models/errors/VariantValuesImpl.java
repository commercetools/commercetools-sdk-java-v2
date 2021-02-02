
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class VariantValuesImpl implements VariantValues {

    private String sku;

    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @JsonCreator
    VariantValuesImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("prices") final java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.sku = sku;
        this.prices = prices;
        this.attributes = attributes;
    }

    public VariantValuesImpl() {
    }

    public String getSku() {
        return this.sku;
    }

    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getPrices() {
        return this.prices;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPrices(final com.commercetools.importapi.models.prices.PriceImport... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices) {
        this.prices = prices;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantValuesImpl that = (VariantValuesImpl) o;

        return new EqualsBuilder().append(sku, that.sku).append(prices, that.prices).append(attributes,
            that.attributes).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sku).append(prices).append(attributes).toHashCode();
    }

}
