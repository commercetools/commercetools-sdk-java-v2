
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
 * ProjectSetDiscountsConfigurationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetDiscountsConfigurationActionImpl implements ProjectSetDiscountsConfigurationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.DiscountsConfiguration discountsConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetDiscountsConfigurationActionImpl(
            @JsonProperty("discountsConfiguration") final com.commercetools.api.models.project.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
        this.action = SET_DISCOUNTS_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public ProjectSetDiscountsConfigurationActionImpl() {
        this.action = SET_DISCOUNTS_CONFIGURATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     */

    public com.commercetools.api.models.project.DiscountsConfiguration getDiscountsConfiguration() {
        return this.discountsConfiguration;
    }

    public void setDiscountsConfiguration(
            final com.commercetools.api.models.project.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetDiscountsConfigurationActionImpl that = (ProjectSetDiscountsConfigurationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(discountsConfiguration, that.discountsConfiguration)
                .append(action, that.action)
                .append(discountsConfiguration, that.discountsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discountsConfiguration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("discountsConfiguration", discountsConfiguration)
                .build();
    }

    @Override
    public ProjectSetDiscountsConfigurationAction copyDeep() {
        return ProjectSetDiscountsConfigurationAction.deepCopy(this);
    }
}
