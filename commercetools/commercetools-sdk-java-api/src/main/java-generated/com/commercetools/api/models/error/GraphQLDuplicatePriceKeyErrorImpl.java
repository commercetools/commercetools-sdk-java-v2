
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when a Price key conflicts with an existing key.</p>
 *  <p>Keys of Embedded Prices must be unique per ProductVariant.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicatePriceKeyErrorImpl implements GraphQLDuplicatePriceKeyError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicatePriceKeyErrorImpl(@JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingPrice") final com.commercetools.api.models.common.Price conflictingPrice) {
        this.values = values;
        this.conflictingPrice = conflictingPrice;
        this.code = DUPLICATE_PRICE_KEY;
    }

    /**
     * create empty instance
     */
    public GraphQLDuplicatePriceKeyErrorImpl() {
        this.code = DUPLICATE_PRICE_KEY;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     */

    public com.commercetools.api.models.common.Price getConflictingPrice() {
        return this.conflictingPrice;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setConflictingPrice(final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLDuplicatePriceKeyErrorImpl that = (GraphQLDuplicatePriceKeyErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(conflictingPrice, that.conflictingPrice)
                .append(code, that.code)
                .append(values, that.values)
                .append(conflictingPrice, that.conflictingPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(conflictingPrice).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("conflictingPrice", conflictingPrice)
                .build();
    }

}
