
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
*  <p>The request body to <a href="#import-orderpatches">import OrderPatches</a>. The data to be imported are represented by <a href="#orderpatchimport">OrderPatchImport</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderPatchImportRequestImpl implements OrderPatchImportRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> patches;

    @JsonCreator
    OrderPatchImportRequestImpl(
            @JsonProperty("patches") final java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> patches) {
        this.patches = patches;
        this.type = ImportResourceType.findEnum("order-patch");
    }

    public OrderPatchImportRequestImpl() {
        this.type = ImportResourceType.findEnum("order-patch");
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
    *  <p>The order patches of this request</p>
    */
    public java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> getPatches() {
        return this.patches;
    }

    public void setPatches(final com.commercetools.importapi.models.order_patches.OrderPatchImport... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
    }

    public void setPatches(
            final java.util.List<com.commercetools.importapi.models.order_patches.OrderPatchImport> patches) {
        this.patches = patches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPatchImportRequestImpl that = (OrderPatchImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(patches, that.patches).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(patches).toHashCode();
    }

}
