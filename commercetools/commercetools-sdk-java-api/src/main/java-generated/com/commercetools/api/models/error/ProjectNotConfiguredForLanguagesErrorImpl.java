
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when the languages set for a Store are not supported by the Project.</p>
 *  <p>The error is returned as a failed response to the Set Languages update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectNotConfiguredForLanguagesErrorImpl implements ProjectNotConfiguredForLanguagesError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> languages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectNotConfiguredForLanguagesErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("languages") final java.util.List<String> languages) {
        this.message = message;
        this.values = values;
        this.languages = languages;
        this.code = PROJECT_NOT_CONFIGURED_FOR_LANGUAGES;
    }

    /**
     * create empty instance
     */
    public ProjectNotConfiguredForLanguagesErrorImpl() {
        this.code = PROJECT_NOT_CONFIGURED_FOR_LANGUAGES;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Languages configured for the Store.</p>
     */

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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

        ProjectNotConfiguredForLanguagesErrorImpl that = (ProjectNotConfiguredForLanguagesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(languages, that.languages)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(languages, that.languages)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).append(languages).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("languages", languages)
                .build();
    }

    @Override
    public ProjectNotConfiguredForLanguagesError copyDeep() {
        return ProjectNotConfiguredForLanguagesError.deepCopy(this);
    }
}
