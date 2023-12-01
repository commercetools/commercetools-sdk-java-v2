
package com.commercetools.api.models.store;

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
 *  <p>This update action produces the StoreLanguagesChanged Message. Adding a language other than the ones defined in the Project returns a ProjectNotConfiguredForLanguages error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetLanguagesActionImpl implements StoreSetLanguagesAction, ModelBase {

    private String action;

    private java.util.List<String> languages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetLanguagesActionImpl(@JsonProperty("languages") final java.util.List<String> languages) {
        this.languages = languages;
        this.action = SET_LANGUAGES;
    }

    /**
     * create empty instance
     */
    public StoreSetLanguagesActionImpl() {
        this.action = SET_LANGUAGES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
    }

    public void setLanguages(final java.util.List<String> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetLanguagesActionImpl that = (StoreSetLanguagesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(languages, that.languages)
                .append(action, that.action)
                .append(languages, that.languages)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(languages).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("languages", languages)
                .build();
    }

}
