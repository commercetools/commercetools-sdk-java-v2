
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApiClientDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApiClientDraft apiClientDraft = ApiClientDraft.builder()
 *             .name("{name}")
 *             .scope("{scope}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApiClientDraftImpl.class)
public interface ApiClientDraft {

    /**
     <*  <p>Name of the APIClient.</p>>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     <*  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>>
     */
    @NotNull
    @JsonProperty("scope")
    public String getScope();

    /**
     <*  <p>If set, the Client will be deleted after the specified amount of days.</p>>
     */

    @JsonProperty("deleteDaysAfterCreation")
    public Long getDeleteDaysAfterCreation();

    /**
     <*  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>>
     */

    @JsonProperty("accessTokenValiditySeconds")
    public Integer getAccessTokenValiditySeconds();

    /**
     <*  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>>
     */

    @JsonProperty("refreshTokenValiditySeconds")
    public Integer getRefreshTokenValiditySeconds();

    public void setName(final String name);

    public void setScope(final String scope);

    public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation);

    public void setAccessTokenValiditySeconds(final Integer accessTokenValiditySeconds);

    public void setRefreshTokenValiditySeconds(final Integer refreshTokenValiditySeconds);

    public static ApiClientDraft of() {
        return new ApiClientDraftImpl();
    }

    public static ApiClientDraft of(final ApiClientDraft template) {
        ApiClientDraftImpl instance = new ApiClientDraftImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        instance.setAccessTokenValiditySeconds(template.getAccessTokenValiditySeconds());
        instance.setRefreshTokenValiditySeconds(template.getRefreshTokenValiditySeconds());
        return instance;
    }

    public static ApiClientDraftBuilder builder() {
        return ApiClientDraftBuilder.of();
    }

    public static ApiClientDraftBuilder builder(final ApiClientDraft template) {
        return ApiClientDraftBuilder.of(template);
    }

    default <T> T withApiClientDraft(Function<ApiClientDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ApiClientDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApiClientDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApiClientDraft>";
            }
        };
    }
}
