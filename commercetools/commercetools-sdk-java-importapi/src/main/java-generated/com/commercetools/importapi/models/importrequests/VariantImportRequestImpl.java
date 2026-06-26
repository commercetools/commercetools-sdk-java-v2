
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The request body to <a href="https://docs.commercetools.com/apis/ctp:import:endpoint:/{projectKey}/variants/import-containers/{importContainerKey}:POST" rel="nofollow">import Variants</a>. Contains data for Variants to be created or updated in a Project.</p>
 *  <p>This import resource is only available for Projects with <code>productCatalogModel</code> set to <code>Modular</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImportRequestImpl implements VariantImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.variants.VariantImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.variants.VariantImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("variant");
    }

    /**
     * create empty instance
     */
    public VariantImportRequestImpl() {
        this.type = ImportResourceType.findEnum("variant");
    }

    /**
     *  <p>The resource type that can be imported.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.variants.VariantImport> getResources() {
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.variants.VariantImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.variants.VariantImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantImportRequestImpl that = (VariantImportRequestImpl) o;

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
    public VariantImportRequest copyDeep() {
        return VariantImportRequest.deepCopy(this);
    }
}
