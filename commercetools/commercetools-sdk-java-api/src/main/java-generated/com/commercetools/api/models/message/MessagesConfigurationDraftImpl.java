
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

/**
*  <p>Defines the configuration for the <a href="/../api/projects/messages">Messages Query</a> feature for the Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MessagesConfigurationDraftImpl implements MessagesConfigurationDraft, ModelBase {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    @JsonCreator
    MessagesConfigurationDraftImpl(@JsonProperty("enabled") final Boolean enabled,
            @JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation) {
        this.enabled = enabled;
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    public MessagesConfigurationDraftImpl() {
    }

    /**
    *  <p>Setting to <code>true</code> activates the <a href="/../api/projects/messages">Messages Query</a> feature.</p>
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
    *  <p>Specifies the number of days each Message should be available via the <a href="/../api/projects/messages">Messages Query</a> API. For Messages older than the specified period, it is not guaranteed that they are still accessible via the API.</p>
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

        MessagesConfigurationDraftImpl that = (MessagesConfigurationDraftImpl) o;

        return new EqualsBuilder().append(enabled, that.enabled)
                .append(deleteDaysAfterCreation, that.deleteDaysAfterCreation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(enabled).append(deleteDaysAfterCreation).toHashCode();
    }

}
