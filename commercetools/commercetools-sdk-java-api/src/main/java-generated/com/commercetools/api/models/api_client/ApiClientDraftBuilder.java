
package com.commercetools.api.models.api_client;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ApiClientDraftBuilder implements Builder<ApiClientDraft> {

    private String name;

    private String scope;

    @Nullable
    private Long deleteDaysAfterCreation;

    @Nullable
    private Integer accessTokenValiditySeconds;

    @Nullable
    private Integer refreshTokenValiditySeconds;

    /**
    *  <p>Name of the APIClient.</p>
    */

    public ApiClientDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
    *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
    */

    public ApiClientDraftBuilder scope(final String scope) {
        this.scope = scope;
        return this;
    }

    /**
    *  <p>If set, the Client will be deleted after the specified amount of days.</p>
    */

    public ApiClientDraftBuilder deleteDaysAfterCreation(@Nullable final Long deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }

    /**
    *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
    */

    public ApiClientDraftBuilder accessTokenValiditySeconds(@Nullable final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }

    /**
    *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
    */

    public ApiClientDraftBuilder refreshTokenValiditySeconds(@Nullable final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String getScope() {
        return this.scope;
    }

    @Nullable
    public Long getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    @Nullable
    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    @Nullable
    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public ApiClientDraft build() {
        Objects.requireNonNull(name, ApiClientDraft.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClientDraft.class + ": scope is missing");
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    /**
     * builds ApiClientDraft without checking for non null required values
     */
    public ApiClientDraft buildUnchecked() {
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    public static ApiClientDraftBuilder of() {
        return new ApiClientDraftBuilder();
    }

    public static ApiClientDraftBuilder of(final ApiClientDraft template) {
        ApiClientDraftBuilder builder = new ApiClientDraftBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        builder.accessTokenValiditySeconds = template.getAccessTokenValiditySeconds();
        builder.refreshTokenValiditySeconds = template.getRefreshTokenValiditySeconds();
        return builder;
    }

}
