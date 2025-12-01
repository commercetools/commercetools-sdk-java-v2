
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
 *  <p>Details of the Application logo. It is required if the <code>mode</code> is <code>CompleteFlow</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationLogoImpl implements ApplicationLogo, ModelBase {

    private String url;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApplicationLogoImpl(@JsonProperty("url") final String url) {
        this.url = url;
    }

    /**
     * create empty instance
     */
    public ApplicationLogoImpl() {
    }

    /**
     *  <p>URL of the logo.</p>
     */

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApplicationLogoImpl that = (ApplicationLogoImpl) o;

        return new EqualsBuilder().append(url, that.url).append(url, that.url).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(url).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("url", url).build();
    }

    @Override
    public ApplicationLogo copyDeep() {
        return ApplicationLogo.deepCopy(this);
    }
}
