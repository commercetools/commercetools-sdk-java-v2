
package com.commercetools.api.models.error;

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
public class OutOfStockErrorImpl implements OutOfStockError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> lineItems;

    private java.util.List<String> skus;

    @JsonCreator
    OutOfStockErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("lineItems") final java.util.List<String> lineItems,
            @JsonProperty("skus") final java.util.List<String> skus) {
        this.message = message;
        this.values = values;
        this.lineItems = lineItems;
        this.skus = skus;
        this.code = OUT_OF_STOCK;
    }

    public OutOfStockErrorImpl() {
        this.code = OUT_OF_STOCK;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setLineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
    }

    public void setSkus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
    }

    public void setSkus(final java.util.List<String> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OutOfStockErrorImpl that = (OutOfStockErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(skus, that.skus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(lineItems)
                .append(skus)
                .toHashCode();
    }

}
