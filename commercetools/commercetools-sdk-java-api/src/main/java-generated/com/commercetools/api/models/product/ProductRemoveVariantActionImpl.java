
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
public final class ProductRemoveVariantActionImpl implements ProductRemoveVariantAction {

    private String action;

    private Long id;

    private String sku;

    private Boolean staged;

    @JsonCreator
    ProductRemoveVariantActionImpl(@JsonProperty("id") final Long id, @JsonProperty("sku") final String sku,
            @JsonProperty("staged") final Boolean staged) {
        this.id = id;
        this.sku = sku;
        this.staged = staged;
        this.action = REMOVE_VARIANT;
    }

    public ProductRemoveVariantActionImpl() {
        this.action = REMOVE_VARIANT;
    }

    public String getAction() {
        return this.action;
    }

    public Long getId() {
        return this.id;
    }

    public String getSku() {
        return this.sku;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
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

        ProductRemoveVariantActionImpl that = (ProductRemoveVariantActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(id, that.id)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(id).append(sku).append(staged).toHashCode();
    }

}
