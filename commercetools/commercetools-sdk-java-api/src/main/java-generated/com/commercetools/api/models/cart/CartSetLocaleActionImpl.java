
package com.commercetools.api.models.cart;

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
 * CartSetLocaleAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLocaleActionImpl implements CartSetLocaleAction, ModelBase {

    private String action;

    private String locale;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLocaleActionImpl(@JsonProperty("locale") final String locale) {
        this.locale = locale;
        this.action = SET_LOCALE;
    }

    /**
     * create empty instance
     */
    public CartSetLocaleActionImpl() {
        this.action = SET_LOCALE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be one of the Project's <code>languages</code>. If empty, any existing value will be removed.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLocaleActionImpl that = (CartSetLocaleActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(locale, that.locale)
                .append(action, that.action)
                .append(locale, that.locale)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(locale).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("locale", locale)
                .build();
    }

    @Override
    public CartSetLocaleAction copyDeep() {
        return CartSetLocaleAction.deepCopy(this);
    }
}
