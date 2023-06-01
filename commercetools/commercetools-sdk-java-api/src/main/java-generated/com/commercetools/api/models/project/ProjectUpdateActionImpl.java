package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationAction;
import com.commercetools.api.models.project.ProjectChangeCartsConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectChangeOrderSearchStatusAction;
import com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledAction;
import com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationAction;
import com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProjectUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectUpdateActionImpl implements ProjectUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public ProjectUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectUpdateActionImpl that = (ProjectUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
