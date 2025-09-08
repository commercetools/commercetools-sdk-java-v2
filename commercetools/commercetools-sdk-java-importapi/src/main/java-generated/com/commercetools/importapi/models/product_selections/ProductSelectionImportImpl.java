
package com.commercetools.importapi.models.product_selections;

import java.time.*;
import java.util.*;

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
 *  <p>Represents the data used to import a ProductSelection. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a> in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionImportImpl implements ProductSelectionImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.product_selections.ProductSelectionMode mode;

    private com.commercetools.importapi.models.customfields.Custom custom;

    private java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> assignments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("mode") final com.commercetools.importapi.models.product_selections.ProductSelectionMode mode,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom,
            @JsonProperty("assignments") final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> assignments) {
        this.key = key;
        this.name = name;
        this.mode = mode;
        this.custom = custom;
        this.assignments = assignments;
    }

    /**
     * create empty instance
     */
    public ProductSelectionImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If an <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductSelection.mode</code>.</p>
     */

    public com.commercetools.importapi.models.product_selections.ProductSelectionMode getMode() {
        return this.mode;
    }

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>List of product assignments.</p>
     */

    public java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> getAssignments() {
        return this.assignments;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setMode(final com.commercetools.importapi.models.product_selections.ProductSelectionMode mode) {
        this.mode = mode;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    public void setAssignments(
            final com.commercetools.importapi.models.product_selections.ProductSelectionAssignment... assignments) {
        this.assignments = new ArrayList<>(Arrays.asList(assignments));
    }

    public void setAssignments(
            final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionAssignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionImportImpl that = (ProductSelectionImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(mode, that.mode)
                .append(custom, that.custom)
                .append(assignments, that.assignments)
                .append(key, that.key)
                .append(name, that.name)
                .append(mode, that.mode)
                .append(custom, that.custom)
                .append(assignments, that.assignments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(mode)
                .append(custom)
                .append(assignments)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("mode", mode)
                .append("custom", custom)
                .append("assignments", assignments)
                .build();
    }

    @Override
    public ProductSelectionImport copyDeep() {
        return ProductSelectionImport.deepCopy(this);
    }
}
