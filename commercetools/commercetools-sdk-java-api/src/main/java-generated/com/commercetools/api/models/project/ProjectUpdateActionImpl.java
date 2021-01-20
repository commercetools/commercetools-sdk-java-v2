
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectUpdateActionImpl implements ProjectUpdateAction {

    private String action;

    @JsonCreator
    ProjectUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public ProjectUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectUpdateActionImpl that = (ProjectUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
