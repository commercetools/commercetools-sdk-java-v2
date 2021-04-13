
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class VariantImpl implements Variant {

    private Integer id;

    private String sku;

    private String key;

    @JsonCreator
    VariantImpl(@JsonProperty("id") final Integer id, @JsonProperty("sku") final String sku,
            @JsonProperty("key") final String key) {
        this.id = id;
        this.sku = sku;
        this.key = key;
    }

    public VariantImpl() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getSku() {
        return this.sku;
    }

    public String getKey() {
        return this.key;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantImpl that = (VariantImpl) o;

        return new EqualsBuilder().append(id, that.id).append(sku, that.sku).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(sku).append(key).toHashCode();
    }

}
