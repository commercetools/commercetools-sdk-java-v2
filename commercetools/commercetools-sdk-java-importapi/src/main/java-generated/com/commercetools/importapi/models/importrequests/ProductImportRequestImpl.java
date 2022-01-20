
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

/**
*  <p>The request body to <a href="#import-products">import Products</a>. Contains data for <a href="/../api/projects/products#product">Products</a> to be created or updated in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductImportRequestImpl implements ProductImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.products.ProductImport> resources;

    @JsonCreator
    ProductImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("product");
    }

    public ProductImportRequestImpl() {
        this.type = ImportResourceType.findEnum("product");
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
    *  <p>The product import resources of this request.</p>
    */
    public java.util.List<com.commercetools.importapi.models.products.ProductImport> getResources() {
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.products.ProductImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductImportRequestImpl that = (ProductImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(resources, that.resources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

}
