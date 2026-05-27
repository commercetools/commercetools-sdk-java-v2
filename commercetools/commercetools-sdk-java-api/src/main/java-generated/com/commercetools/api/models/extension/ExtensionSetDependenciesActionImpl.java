
package com.commercetools.api.models.extension;

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
 * ExtensionSetDependenciesAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetDependenciesActionImpl implements ExtensionSetDependenciesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionSetDependenciesActionImpl(
            @JsonProperty("dependencies") final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies) {
        this.dependencies = dependencies;
        this.action = SET_DEPENDENCIES;
    }

    /**
     * create empty instance
     */
    public ExtensionSetDependenciesActionImpl() {
        this.action = SET_DEPENDENCIES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> getDependencies() {
        return this.dependencies;
    }

    public void setDependencies(
            final com.commercetools.api.models.extension.ExtensionResourceIdentifier... dependencies) {
        this.dependencies = new ArrayList<>(Arrays.asList(dependencies));
    }

    public void setDependencies(
            final java.util.List<com.commercetools.api.models.extension.ExtensionResourceIdentifier> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionSetDependenciesActionImpl that = (ExtensionSetDependenciesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(dependencies, that.dependencies)
                .append(action, that.action)
                .append(dependencies, that.dependencies)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(dependencies).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("dependencies", dependencies)
                .build();
    }

    @Override
    public ExtensionSetDependenciesAction copyDeep() {
        return ExtensionSetDependenciesAction.deepCopy(this);
    }
}
