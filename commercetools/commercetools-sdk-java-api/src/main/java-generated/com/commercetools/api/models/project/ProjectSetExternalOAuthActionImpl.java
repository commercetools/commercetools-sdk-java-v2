
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
public final class ProjectSetExternalOAuthActionImpl implements ProjectSetExternalOAuthAction {

    private String action;

    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    @JsonCreator
    ProjectSetExternalOAuthActionImpl(
            @JsonProperty("externalOAuth") final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        this.action = SET_EXTERNAL_O_AUTH;
    }

    public ProjectSetExternalOAuthActionImpl() {
        this.action = SET_EXTERNAL_O_AUTH;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If you do not provide the <code>externalOAuth</code> field or provide a value
    *  of <code>null</code>, the update action unsets the External OAuth provider.</p>
    */
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth() {
        return this.externalOAuth;
    }

    public void setExternalOAuth(final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetExternalOAuthActionImpl that = (ProjectSetExternalOAuthActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(externalOAuth, that.externalOAuth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalOAuth).toHashCode();
    }

}
