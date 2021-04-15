
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCartsConfigurationImpl implements ProjectChangeCartsConfiguration {

    private String action;

    private com.commercetools.api.models.project.CartsConfiguration cartsConfiguration;

    @JsonCreator
    ProjectChangeCartsConfigurationImpl(
            @JsonProperty("cartsConfiguration") final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
        this.action = CHANGE_CARTS_CONFIGURATION;
    }

    public ProjectChangeCartsConfigurationImpl() {
        this.action = CHANGE_CARTS_CONFIGURATION;
    }

    public String getAction() {
        return this.action;
    }

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

        ProjectChangeCartsConfigurationImpl that = (ProjectChangeCartsConfigurationImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(cartsConfiguration, that.cartsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(cartsConfiguration).toHashCode();
    }

}
