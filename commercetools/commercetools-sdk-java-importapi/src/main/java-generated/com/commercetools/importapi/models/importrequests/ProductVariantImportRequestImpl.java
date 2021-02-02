
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>An import request for multiple product variant import resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImportRequestImpl implements ProductVariantImportRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources;

    @JsonCreator
    ProductVariantImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("product-variant");
    }

    public ProductVariantImportRequestImpl() {
        this.type = ImportResourceType.findEnum("product-variant");
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
    *  <p>The product variant import resources of this request.</p>
    */
    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> getResources() {
        return this.resources;
    }

    public void setResources(
            final com.commercetools.importapi.models.productvariants.ProductVariantImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantImportRequestImpl that = (ProductVariantImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(resources, that.resources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

}
