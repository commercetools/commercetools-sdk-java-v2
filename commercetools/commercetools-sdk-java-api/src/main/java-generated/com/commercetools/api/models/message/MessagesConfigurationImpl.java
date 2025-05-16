
package com.commercetools.api.models.message;

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
 *  <p>Holds the configuration for the Messages Query feature for the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MessagesConfigurationImpl implements MessagesConfiguration, ModelBase {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MessagesConfigurationImpl(@JsonProperty("enabled") final Boolean enabled,
            @JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation) {
        this.enabled = enabled;
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    /**
     * create empty instance
     */
    public MessagesConfigurationImpl() {
    }

    /**
     *  <p>When <code>true</code>, the Messages Query feature is active.</p>
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     *  <p>Specifies the number of days each Message should be available via the Messages Query API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API. This field may not be present on Projects created before 8 October 2018.</p>
     */

    public Integer getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MessagesConfigurationImpl that = (MessagesConfigurationImpl) o;

        return new EqualsBuilder().append(enabled, that.enabled)
                .append(deleteDaysAfterCreation, that.deleteDaysAfterCreation)
                .append(enabled, that.enabled)
                .append(deleteDaysAfterCreation, that.deleteDaysAfterCreation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(enabled).append(deleteDaysAfterCreation).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("enabled", enabled)
                .append("deleteDaysAfterCreation", deleteDaysAfterCreation)
                .build();
    }

    @Override
    public MessagesConfiguration copyDeep() {
        return MessagesConfiguration.deepCopy(this);
    }
}
