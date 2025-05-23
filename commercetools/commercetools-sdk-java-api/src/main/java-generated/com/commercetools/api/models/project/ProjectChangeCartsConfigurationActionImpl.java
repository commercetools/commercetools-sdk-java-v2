
package com.commercetools.api.models.project;

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
 * ProjectChangeCartsConfigurationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCartsConfigurationActionImpl implements ProjectChangeCartsConfigurationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.CartsConfiguration cartsConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeCartsConfigurationActionImpl(
            @JsonProperty("cartsConfiguration") final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
        this.action = CHANGE_CARTS_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public ProjectChangeCartsConfigurationActionImpl() {
        this.action = CHANGE_CARTS_CONFIGURATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Configuration for the Carts feature.</p>
     */

    public com.commercetools.api.models.project.CartsConfiguration getCartsConfiguration() {
        return this.cartsConfiguration;
    }

    public void setCartsConfiguration(
            final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeCartsConfigurationActionImpl that = (ProjectChangeCartsConfigurationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(cartsConfiguration, that.cartsConfiguration)
                .append(action, that.action)
                .append(cartsConfiguration, that.cartsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(cartsConfiguration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("cartsConfiguration", cartsConfiguration)
                .build();
    }

    @Override
    public ProjectChangeCartsConfigurationAction copyDeep() {
        return ProjectChangeCartsConfigurationAction.deepCopy(this);
    }
}
