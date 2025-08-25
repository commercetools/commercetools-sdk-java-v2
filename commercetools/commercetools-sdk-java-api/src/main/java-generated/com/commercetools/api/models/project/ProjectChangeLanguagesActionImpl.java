
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
 *  <p>Removing a language used by a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> returns a <a href="https://docs.commercetools.com/apis/ctp:api:type:LanguageUsedInStoresError" rel="nofollow">LanguageUsedInStores</a> error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeLanguagesActionImpl implements ProjectChangeLanguagesAction, ModelBase {

    private String action;

    private java.util.List<String> languages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeLanguagesActionImpl(@JsonProperty("languages") final java.util.List<String> languages) {
        this.languages = languages;
        this.action = CHANGE_LANGUAGES;
    }

    /**
     * create empty instance
     */
    public ProjectChangeLanguagesActionImpl() {
        this.action = CHANGE_LANGUAGES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
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

        ProjectChangeLanguagesActionImpl that = (ProjectChangeLanguagesActionImpl) o;

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

    @Override
    public ProjectChangeLanguagesAction copyDeep() {
        return ProjectChangeLanguagesAction.deepCopy(this);
    }
}
