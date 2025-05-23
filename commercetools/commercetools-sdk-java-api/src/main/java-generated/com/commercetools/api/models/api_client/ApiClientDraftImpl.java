
package com.commercetools.api.models.api_client;

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
 * ApiClientDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApiClientDraftImpl implements ApiClientDraft, ModelBase {

    private String name;

    private String scope;

    private Long deleteDaysAfterCreation;

    private Integer accessTokenValiditySeconds;

    private Integer refreshTokenValiditySeconds;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApiClientDraftImpl(@JsonProperty("name") final String name, @JsonProperty("scope") final String scope,
            @JsonProperty("deleteDaysAfterCreation") final Long deleteDaysAfterCreation,
            @JsonProperty("accessTokenValiditySeconds") final Integer accessTokenValiditySeconds,
            @JsonProperty("refreshTokenValiditySeconds") final Integer refreshTokenValiditySeconds) {
        this.name = name;
        this.scope = scope;
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    /**
     * create empty instance
     */
    public ApiClientDraftImpl() {
    }

    /**
     *  <p>Name of the APIClient.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     */

    public String getScope() {
        return this.scope;
    }

    /**
     *  <p>If set, the Client will be deleted after the specified amount of days.</p>
     */

    public Long getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
     */

    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
     */

    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    public void setAccessTokenValiditySeconds(final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApiClientDraftImpl that = (ApiClientDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(scope, that.scope)
                .append(deleteDaysAfterCreation, that.deleteDaysAfterCreation)
                .append(accessTokenValiditySeconds, that.accessTokenValiditySeconds)
                .append(refreshTokenValiditySeconds, that.refreshTokenValiditySeconds)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(deleteDaysAfterCreation, that.deleteDaysAfterCreation)
                .append(accessTokenValiditySeconds, that.accessTokenValiditySeconds)
                .append(refreshTokenValiditySeconds, that.refreshTokenValiditySeconds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(scope)
                .append(deleteDaysAfterCreation)
                .append(accessTokenValiditySeconds)
                .append(refreshTokenValiditySeconds)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("scope", scope)
                .append("deleteDaysAfterCreation", deleteDaysAfterCreation)
                .append("accessTokenValiditySeconds", accessTokenValiditySeconds)
                .append("refreshTokenValiditySeconds", refreshTokenValiditySeconds)
                .build();
    }

    @Override
    public ApiClientDraft copyDeep() {
        return ApiClientDraft.deepCopy(this);
    }
}
