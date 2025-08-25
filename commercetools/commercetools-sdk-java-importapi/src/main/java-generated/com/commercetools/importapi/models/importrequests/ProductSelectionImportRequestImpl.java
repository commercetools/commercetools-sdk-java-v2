
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
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
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/product-selections/import-containers/{importContainerKey}:POST" rel="nofollow">import Product Selections</a>. Contains data for <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selections</a> to be created or updated in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionImportRequestImpl implements ProductSelectionImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("product-selection");
    }

    /**
     * create empty instance
     */
    public ProductSelectionImportRequestImpl() {
        this.type = ImportResourceType.findEnum("product-selection");
    }

    /**
     *  <p>The resource type that can be imported.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> getResources() {
        return this.resources;
    }

    public void setResources(
            final com.commercetools.importapi.models.product_selections.ProductSelectionImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionImportRequestImpl that = (ProductSelectionImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(resources, that.resources)
                .append(type, that.type)
                .append(resources, that.resources)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("resources", resources)
                .build();
    }

    @Override
    public ProductSelectionImportRequest copyDeep() {
        return ProductSelectionImportRequest.deepCopy(this);
    }
}
