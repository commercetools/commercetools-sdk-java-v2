
package com.commercetools.api.models.product;

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
 *  <p>JSON object where the keys are Category <code>id</code>, and the values are order hint values: strings representing a number between <code>0</code> and <code>1</code>, but not ending in <code>0</code>. Order hints allow controlling the order of Products and how they appear in Categories. Products without order hints have an order score below <code>0</code>. Order hints are not unique. If a subset of Products have the same value for order hint in a specific category, the behavior is undetermined.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryOrderHintsImpl implements CategoryOrderHints, ModelBase {

    private Map<String, String> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryOrderHintsImpl(@JsonAnySetter @JsonProperty("values") final Map<String, String> values) {
        this.values = values;
    }

    /**
     * create empty instance
     */
    public CategoryOrderHintsImpl() {
    }

    /**
     *  <p>A string representing a number between <code>0</code> and <code>1</code>, but not ending in <code>0</code>.</p>
     */

    public Map<String, String> values() {
        return values;
    }

    public void setValue(String key, String value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryOrderHintsImpl that = (CategoryOrderHintsImpl) o;

        return new EqualsBuilder().append(values, that.values).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("values", values).build();
    }

    @Override
    public CategoryOrderHints copyDeep() {
        return CategoryOrderHints.deepCopy(this);
    }
}
