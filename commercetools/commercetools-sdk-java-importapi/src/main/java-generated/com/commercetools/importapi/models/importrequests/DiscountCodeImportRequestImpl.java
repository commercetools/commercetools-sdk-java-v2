
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
 *  <p>The request body to import DiscountCodes. Contains data for Discount Codes to be created or updated in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeImportRequestImpl implements DiscountCodeImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("discount-code");
    }

    /**
     * create empty instance
     */
    public DiscountCodeImportRequestImpl() {
        this.type = ImportResourceType.findEnum("discount-code");
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> getResources() {
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.discount_codes.DiscountCodeImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeImportRequestImpl that = (DiscountCodeImportRequestImpl) o;

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
    public DiscountCodeImportRequest copyDeep() {
        return DiscountCodeImportRequest.deepCopy(this);
    }
}
