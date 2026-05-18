
package com.commercetools.checkout.models.application;

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
 * SetApplicationLogoUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationLogoUpdateActionImpl implements SetApplicationLogoUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.application.ApplicationLogo logo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetApplicationLogoUpdateActionImpl(
            @JsonProperty("logo") final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
        this.action = SET_APPLICATION_LOGO;
    }

    /**
     * create empty instance
     */
    public SetApplicationLogoUpdateActionImpl() {
        this.action = SET_APPLICATION_LOGO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationLogo getLogo() {
        return this.logo;
    }

    public void setLogo(final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetApplicationLogoUpdateActionImpl that = (SetApplicationLogoUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(logo, that.logo)
                .append(action, that.action)
                .append(logo, that.logo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(logo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("logo", logo)
                .build();
    }

    @Override
    public SetApplicationLogoUpdateAction copyDeep() {
        return SetApplicationLogoUpdateAction.deepCopy(this);
    }
}
