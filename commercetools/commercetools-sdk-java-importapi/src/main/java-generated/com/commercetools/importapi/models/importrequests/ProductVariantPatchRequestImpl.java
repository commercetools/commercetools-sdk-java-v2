
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
 *  <p>The request body to import ProductVariantPatches. The data to be imported are represented by ProductVariantPatch.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantPatchRequestImpl implements ProductVariantPatchRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantPatchRequestImpl(
            @JsonProperty("patches") final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        this.type = ImportResourceType.findEnum("product-variant-patch");
    }

    /**
     * create empty instance
     */
    public ProductVariantPatchRequestImpl() {
        this.type = ImportResourceType.findEnum("product-variant-patch");
    }

    /**
     *  <p>The type of the import resource.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The product variant patches of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches() {
        return this.patches;
    }

    public void setPatches(final com.commercetools.importapi.models.productvariants.ProductVariantPatch... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
    }

    public void setPatches(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantPatchRequestImpl that = (ProductVariantPatchRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(patches, that.patches).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(patches).toHashCode();
    }

}
